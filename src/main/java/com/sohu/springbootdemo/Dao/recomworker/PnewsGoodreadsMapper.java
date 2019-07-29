package com.sohu.springbootdemo.Dao.recomworker;

import com.sohu.springbootdemo.Model.PnewsGoodreads;
import com.sohu.springbootdemo.Model.PnewsGoodreadsExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PnewsGoodreadsMapper {
    int countByExample(PnewsGoodreadsExample example);

    int deleteByExample(PnewsGoodreadsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PnewsGoodreads record);

    int insertSelective(PnewsGoodreads record);

    List<PnewsGoodreads> selectByExample(PnewsGoodreadsExample example);

    PnewsGoodreads selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PnewsGoodreads record, @Param("example") PnewsGoodreadsExample example);

    int updateByExample(@Param("record") PnewsGoodreads record, @Param("example") PnewsGoodreadsExample example);

    int updateByPrimaryKeySelective(PnewsGoodreads record);

    int updateByPrimaryKey(PnewsGoodreads record);
}