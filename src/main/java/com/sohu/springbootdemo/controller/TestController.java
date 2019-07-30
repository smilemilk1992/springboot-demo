package com.sohu.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sohu.springbootdemo.AopTest.StatisticsTime.AnalysisActuator;
import com.sohu.springbootdemo.Model.PnewsContent;
import com.sohu.springbootdemo.Model.PnewsGoodreads;
import com.sohu.springbootdemo.Model.PnewsGoodreadsExample;
import com.sohu.springbootdemo.Server.impl.GoodreadsServerImpl;
import com.sohu.springbootdemo.Server.impl.PnewscontentServerImpl;
import com.sohu.springbootdemo.Utils.JSonUtil;
import com.sohu.springbootdemo.Utils.ListObject;
import com.sohu.springbootdemo.Utils.ResponseUtils;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author haochen
 * @date 2019/7/25 11:28
 */
//@Controller  //不用指定一级域名
@RestController
@RequestMapping(value = "/test")
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private PnewscontentServerImpl pnewscontentServerImpl;

    @Autowired
    private GoodreadsServerImpl goodreadsServerImpl;

    @ResponseBody
    @RequestMapping("/failed")
    public Map<String, String> requestFailed(){

        Map<String, String> map = new HashMap<>();
        map.put("code", "-1");
        map.put("msg", "请求错误");
        return map;
    }

    @ResponseBody
    @RequestMapping("/success/info")
    public String userInfo(){

        return "success";
    }
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String testHello(){
        logger.info("hello world!");
        return "hello world!";
    }

    //在入参设置@RequestBody注解表示接收整个报文体，这里主要用在接收整个POST请求中的json报文体，
    //目前主流的请求报文也都是JSON格式了，使用该注解就能够获取整个JSON报文体作为入参，使用JSON解析工具解析后获取具体参数
    @ResponseBody
    @RequestMapping(value = "/getUserByJson",method={RequestMethod.POST})
    public String getUserByJson(@RequestBody String data){
        return "Json is " + data;
    }

    //String url = URLEncoder.encode(content,"UTF-8"); 先编码
    @ResponseBody
    @RequestMapping(value = "/getImgLink",method={RequestMethod.POST,RequestMethod.GET},produces = "application/json; charset=utf-8")
    public void getColudImg(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
        Long startTm=System.currentTimeMillis();
//        String url = URLDecoder.decode(request.getParameter("url"),"UTF-8");
        String url = request.getParameter("url");
        ListObject listObject = new ListObject();
        List<JSONObject> list = new ArrayList<JSONObject>();
        listObject.setCode("C0000");
        listObject.setMsg("访问成功");
        listObject.setCostTm(System.currentTimeMillis()-startTm);
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("url",url);
        list.add(jsonObject);
        listObject.setItems(list);
        logger.info(String.valueOf(JSONObject.toJSON(listObject)));
        ResponseUtils.renderJson(response,JSonUtil.toJson(listObject));
    }

    //这里使用@RequestMapping注解表示该方法对应的二级上下文路径
    @RequestMapping(value = "/getUserByGet", method = {RequestMethod.POST,RequestMethod.GET})
    public String getUserByGet(@RequestParam(value = "userName") String userName){
        return "Hello " + userName;
    }

    @ResponseBody
    @AnalysisActuator(note = "获取物料信息")
    @RequestMapping(value = "/getinfo",method={RequestMethod.POST,RequestMethod.GET},produces = "application/json; charset=utf-8")  //注解为控制器指定可以处理哪些 URL 请求
    public Object getinfo(HttpServletRequest request, HttpServletResponse response){
        long startTm=System.currentTimeMillis();
        String id = request.getParameter("id");
        ListObject listObject = new ListObject();
        List<JSONObject> list = new ArrayList<JSONObject>();
        if(id.equals("") || id==null){
            listObject.setCode("C0001");
            listObject.setMsg("参数错误");
            listObject.setCostTm(System.currentTimeMillis()-startTm);
        }else {
            PnewsContent pnewsContent=pnewscontentServerImpl.getContent(Integer.valueOf(id));
            if(pnewsContent==null){
                listObject.setCode("C0002");
                listObject.setMsg("访问错误");
                listObject.setCostTm(System.currentTimeMillis()-startTm);
            }else {
                listObject.setCode("C0000");
                listObject.setMsg("访问成功");
                listObject.setCostTm(System.currentTimeMillis()-startTm);
                JSONObject jsonObject= (JSONObject) JSON.toJSON(pnewsContent);
                list.add(jsonObject);
                listObject.setItems(list);
            }
        }
        logger.info(String.valueOf(JSONObject.toJSON(listObject)));
        return JSONObject.toJSON(listObject);
//        ResponseUtils.renderJson(response,JSonUtil.toJson(listObject));
    }

    @ResponseBody
    @RequestMapping(value = "/goodreads/getinfo",method={RequestMethod.POST,RequestMethod.GET},produces = "application/json; charset=utf-8")  //注解为控制器指定可以处理哪些 URL 请求
    public Object getGoodreadsInfo(HttpServletRequest request, HttpServletResponse response){
        long startTm=System.currentTimeMillis();
        String cudosid = request.getParameter("cudosid");
        String goodreadsId = request.getParameter("goodreadsId");
        ListObject listObject = new ListObject();
        List<JSONObject> list = new ArrayList<JSONObject>();
        if((cudosid==null)&&(goodreadsId==null)){
            listObject.setCode("C0001");
            listObject.setMsg("参数错误");
            listObject.setCostTm(System.currentTimeMillis()-startTm);
        }else {
            PnewsGoodreadsExample pnewsGoodreadsExample=new PnewsGoodreadsExample();
            if(cudosid!=null && !cudosid.equals("")){
                pnewsGoodreadsExample.or().andCudosidEqualTo(Integer.valueOf(cudosid));
            }

            if(goodreadsId!=null && !goodreadsId.equals("")){
                pnewsGoodreadsExample.or().andGoodreadsidEqualTo(Integer.valueOf(goodreadsId));
            }
            List<PnewsGoodreads> pnewsGoodreads=goodreadsServerImpl.getContent(pnewsGoodreadsExample);
            if(pnewsGoodreads==null){
                listObject.setCode("C0002");
                listObject.setMsg("访问错误");
                listObject.setCostTm(System.currentTimeMillis()-startTm);
            }else {
                listObject.setCode("C0000");
                listObject.setMsg("访问成功");
                listObject.setCostTm(System.currentTimeMillis()-startTm);
                JSONObject jsonObject= (JSONObject) JSON.toJSON(pnewsGoodreads.get(0));
                list.add(jsonObject);
                listObject.setItems(list);
            }
        }
        logger.info(String.valueOf(JSONObject.toJSON(listObject)));
        return JSONObject.toJSON(listObject);
//        ResponseUtils.renderJson(response,JSonUtil.toJson(listObject));
    }
}
