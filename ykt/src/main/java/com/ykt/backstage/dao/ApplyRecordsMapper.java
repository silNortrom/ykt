package com.ykt.backstage.dao;

import com.ykt.backstage.VO.CdglVo;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.ApplyRecords;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplyRecordsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyRecords record);

    ApplyRecords selectByPrimaryKey(Integer id);

    List<ApplyRecords> selectAll();

    int updateByPrimaryKey(ApplyRecords record);

    List<ApplyRecords> pageQuery(@Param("query") Query query);

    List<CdglVo> selectcdgl();
}