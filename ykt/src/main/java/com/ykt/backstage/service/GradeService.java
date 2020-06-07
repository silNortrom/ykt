package com.ykt.backstage.service;

import com.ykt.backstage.entity.Grade;

import java.util.List;

public interface GradeService {
    int deleteByPrimaryKey(Integer id);

    int insert(Grade record);

    Grade selectByPrimaryKey(Integer id);

    List<Grade> selectAll();

    int updateByPrimaryKey(Grade record);

    List<Grade> selectByDate(String date);

}
