package com.ykt.backstage.dao;

import com.ykt.backstage.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    Grade selectByPrimaryKey(Integer id);

    List<Grade> selectAll();

    int updateByPrimaryKey(Grade record);

    List<Grade> selectByDate(String date);
}