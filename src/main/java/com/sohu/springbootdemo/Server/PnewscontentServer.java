package com.sohu.springbootdemo.Server;

import com.sohu.springbootdemo.Dao.recomcrawl.PnewsContentMapper;
import com.sohu.springbootdemo.Model.PnewsContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author haochen
 * @date 2019/7/25 14:55
 */

public interface PnewscontentServer {

    public PnewsContent getContent(Integer id);
}
