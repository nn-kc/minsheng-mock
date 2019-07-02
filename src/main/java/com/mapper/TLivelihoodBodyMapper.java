package com.mapper;

import com.model.TLivelihoodBodyDo;
import com.model.TLivelihoodBodyDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TLivelihoodBodyMapper {
    long countByExample(TLivelihoodBodyDoExample example);

    int insert(TLivelihoodBodyDo record);

    int insertSelective(TLivelihoodBodyDo record);

    List<TLivelihoodBodyDo> selectByExample(TLivelihoodBodyDoExample example);

    TLivelihoodBodyDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TLivelihoodBodyDo record, @Param("example") TLivelihoodBodyDoExample example);

    int updateByExample(@Param("record") TLivelihoodBodyDo record, @Param("example") TLivelihoodBodyDoExample example);

    int updateByPrimaryKeySelective(TLivelihoodBodyDo record);

    int updateByPrimaryKey(TLivelihoodBodyDo record);

    void delBody(Integer id);
}