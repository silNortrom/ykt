package com.ykt.backstage.dao;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.FeedbackRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeedbackRecordsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(FeedbackRecords record);

    FeedbackRecords selectByPrimaryKey(Integer id);

    List<FeedbackRecords> selectAll();

    int updateByPrimaryKey(FeedbackRecords record);

    List<FeedbackRecords> pageQuery(@Param("query") Query query);
}