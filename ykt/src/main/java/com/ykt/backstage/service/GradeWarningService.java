package com.ykt.backstage.service;

import com.ykt.backstage.VO.GradeWarningVO;
import com.ykt.backstage.entity.GradeWarning;

import java.util.List;

public interface GradeWarningService {

    int deleteByPrimaryKey(Integer id);

    int insert(GradeWarning record);

    GradeWarning selectByPrimaryKey(Integer id);

    List<GradeWarning> selectAll();

    int updateByPrimaryKey(GradeWarning record);

    List<GradeWarningVO> returnTableData(String xy, String xn, String xq);
}
