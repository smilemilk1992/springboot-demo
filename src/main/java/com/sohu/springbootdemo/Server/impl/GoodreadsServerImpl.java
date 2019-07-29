package com.sohu.springbootdemo.Server.impl;

import com.sohu.springbootdemo.Dao.recomworker.PnewsGoodreadsMapper;
import com.sohu.springbootdemo.Model.PnewsGoodreads;
import com.sohu.springbootdemo.Model.PnewsGoodreadsExample;
import com.sohu.springbootdemo.Server.GoodreadsServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author haochen
 * @date 2019/7/29 18:06
 */
@Service
public class GoodreadsServerImpl implements GoodreadsServer {
    @Autowired
    private PnewsGoodreadsMapper pnewsGoodreadsMapper;

    @Transactional
    public List<PnewsGoodreads> getContent(PnewsGoodreadsExample example){
        return pnewsGoodreadsMapper.selectByExample(example);
    }
}
