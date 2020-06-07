package com.ykt.backstage.dao;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentsMapper {

    int deleteByPrimaryKey(String xh);

    int insert(Students record);

    Students selectByPrimaryKey(String xh);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);

    List<Students> pageQuery(@Param("query") Query query);
}