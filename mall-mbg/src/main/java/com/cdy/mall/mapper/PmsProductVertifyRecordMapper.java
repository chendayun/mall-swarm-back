package com.cdy.mall.mapper;

import com.cdy.mall.model.PmsProductVertifyRecord;
import com.cdy.mall.model.PmsProductVertifyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsProductVertifyRecordMapper {
    long countByExample(PmsProductVertifyRecordExample example);

    int deleteByExample(PmsProductVertifyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductVertifyRecord row);

    int insertSelective(PmsProductVertifyRecord row);

    List<PmsProductVertifyRecord> selectByExample(PmsProductVertifyRecordExample example);

    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") PmsProductVertifyRecord row, @Param("example") PmsProductVertifyRecordExample example);

    int updateByExample(@Param("row") PmsProductVertifyRecord row, @Param("example") PmsProductVertifyRecordExample example);

    int updateByPrimaryKeySelective(PmsProductVertifyRecord row);

    int updateByPrimaryKey(PmsProductVertifyRecord row);
}