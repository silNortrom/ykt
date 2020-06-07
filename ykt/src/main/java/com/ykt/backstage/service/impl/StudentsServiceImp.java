package com.ykt.backstage.service.impl;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.StudentsMapper;
import com.ykt.backstage.entity.Students;
import com.ykt.backstage.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:37
 */
@Service
public class StudentsServiceImp implements StudentsService {
    @Autowired
    StudentsMapper studentsMapper;

    @Override
    public int deleteByPrimaryKey(String xh) {
        return studentsMapper.deleteByPrimaryKey(xh);
    }

    @Override
    public int insert(Students students) {
        return studentsMapper.insert(students);
    }

    @Override
    public Students selectByPrimaryKey(String xh) {
        return studentsMapper.selectByPrimaryKey(xh);
    }

    @Override
    public List<Students> selectAll() {
        return studentsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Students students) {
        return studentsMapper.updateByPrimaryKey(students);
    }

    @Override
    public List<Students> pageQuery(Query query) {
        return studentsMapper.pageQuery(query);
    }
}
