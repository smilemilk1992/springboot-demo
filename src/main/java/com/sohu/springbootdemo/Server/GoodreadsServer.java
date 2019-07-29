package com.sohu.springbootdemo.Server;

import com.sohu.springbootdemo.Model.PnewsGoodreads;
import com.sohu.springbootdemo.Model.PnewsGoodreadsExample;

import java.util.List;

/**
 * @author haochen
 * @date 2019/7/29 17:15
 */
public interface GoodreadsServer {

    public List<PnewsGoodreads> getContent(PnewsGoodreadsExample example);
}
