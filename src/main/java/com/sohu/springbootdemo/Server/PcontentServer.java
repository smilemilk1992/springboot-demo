package com.sohu.springbootdemo.Server;

import com.sohu.springbootdemo.Dao.PnewsContentMapper;
import com.sohu.springbootdemo.Model.PnewsContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author haochen
 * @date 2019/7/25 14:55
 */
@Service
public class PcontentServer {

    @Autowired
    private PnewsContentMapper pnewsContentMapper;

    public PnewsContent getContent(Integer id){
        return pnewsContentMapper.selectByPrimaryKey(id);
    }
}
