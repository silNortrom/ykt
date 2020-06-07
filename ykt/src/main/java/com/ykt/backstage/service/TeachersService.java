package com.ykt.backstage.service;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Teachers;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:13
 */
public interface TeachersService {

    int deleteByPrimaryKey(String teacherNum);

    int insert(Teachers teachers);

    Teachers selectByPrimaryKey(String teacherNum);

    List<Teachers> selectAll();

    int updateByPrimaryKey(Teachers teachers);

    List<Teachers> pageQuery(Query query);
}
