package com.ykt.backstage.service;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Students;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:12
 */
public interface StudentsService {

    int deleteByPrimaryKey(String xh);

    int insert(Students record);

    Students selectByPrimaryKey(String xh);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);

    List<Students> pageQuery(Query query);
}
