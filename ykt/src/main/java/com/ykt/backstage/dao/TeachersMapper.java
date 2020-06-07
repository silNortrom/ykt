package com.ykt.backstage.dao;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Teachers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeachersMapper {

    int deleteByPrimaryKey(String teacherNum);

    int insert(Teachers record);

    Teachers selectByPrimaryKey(String teacherNum);

    List<Teachers> selectAll();

    int updateByPrimaryKey(Teachers record);

    List<Teachers> pageQuery(@Param("query") Query query);
}