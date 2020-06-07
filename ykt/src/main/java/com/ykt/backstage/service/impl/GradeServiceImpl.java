package com.ykt.backstage.service.impl;

import com.ykt.backstage.dao.GradeMapper;
import com.ykt.backstage.entity.Grade;
import com.ykt.backstage.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return gradeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Grade record) {
        return gradeMapper.insert(record);
    }

    @Override
    public Grade selectByPrimaryKey(Integer id) {
        return gradeMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Grade record) {
        return gradeMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Grade> selectByDate(String date) {
        return gradeMapper.selectByDate(date);
    }
}
