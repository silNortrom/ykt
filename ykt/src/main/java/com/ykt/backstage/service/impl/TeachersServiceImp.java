package com.ykt.backstage.service.impl;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.TeachersMapper;
import com.ykt.backstage.entity.Teachers;
import com.ykt.backstage.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:50
 */
@Service
public class TeachersServiceImp implements TeachersService {
    @Autowired
    TeachersMapper teachersMapper;

    @Override
    public int deleteByPrimaryKey(String teacherNum) {
        return 0;
    }

    @Override
    public int insert(Teachers teachers) {
        return 0;
    }

    @Override
    public Teachers selectByPrimaryKey(String teacherNum) {
        return null;
    }

    @Override
    public List<Teachers> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Teachers teachers) {
        return 0;
    }

    @Override
    public List<Teachers> pageQuery(Query query) {
        return null;
    }
}
