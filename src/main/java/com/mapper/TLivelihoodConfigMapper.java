package com.mapper;

import com.model.TLivelihoodConfigDo;
import com.model.TLivelihoodConfigDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLivelihoodConfigMapper {
    long countByExample(TLivelihoodConfigDoExample example);

    int insert(TLivelihoodConfigDo record);

    int insertSelective(TLivelihoodConfigDo record);

    List<TLivelihoodConfigDo> selectByExample(TLivelihoodConfigDoExample example);

    TLivelihoodConfigDo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TLivelihoodConfigDo record, @Param("example") TLivelihoodConfigDoExample example);

    int updateByExample(@Param("record") TLivelihoodConfigDo record, @Param("example") TLivelihoodConfigDoExample example);

    int updateByPrimaryKeySelective(TLivelihoodConfigDo record);

    int updateByPrimaryKey(TLivelihoodConfigDo record);
}