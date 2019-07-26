package com.sohu.springbootdemo.Dao;

import com.sohu.springbootdemo.Model.PnewsContent;
import com.sohu.springbootdemo.Model.PnewsContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PnewsContentMapper {
    int countByExample(PnewsContentExample example);

    int deleteByExample(PnewsContentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PnewsContent record);

    int insertSelective(PnewsContent record);

    List<PnewsContent> selectByExample(PnewsContentExample example);

    PnewsContent selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PnewsContent record, @Param("example") PnewsContentExample example);

    int updateByExample(@Param("record") PnewsContent record, @Param("example") PnewsContentExample example);

    int updateByPrimaryKeySelective(PnewsContent record);

    int updateByPrimaryKey(PnewsContent record);
}