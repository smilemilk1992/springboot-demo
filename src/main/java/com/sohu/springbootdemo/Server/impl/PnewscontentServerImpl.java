package com.sohu.springbootdemo.Server.impl;

import com.sohu.springbootdemo.Dao.recomcrawl.PnewsContentMapper;
import com.sohu.springbootdemo.Model.PnewsContent;
import com.sohu.springbootdemo.Server.PnewscontentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author haochen
 * @date 2019/7/29 18:06
 */
@Service
public class PnewscontentServerImpl implements PnewscontentServer {
    @Autowired
    private PnewsContentMapper pnewsContentMapper;

    /**
     * 事务注解
     * @param id
     * @return
     */
    @Transactional
    public PnewsContent getContent(Integer id){
        return pnewsContentMapper.selectByPrimaryKey(id);
    }
}
