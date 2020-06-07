package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.GradeWarningVO;
import com.ykt.backstage.dao.GradeWarningMapper;
import com.ykt.backstage.entity.GradeWarning;
import com.ykt.backstage.service.GradeWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeWarningServiceImp implements GradeWarningService {

    @Autowired
    private GradeWarningMapper gradeWarningMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        gradeWarningMapper.deleteByPrimaryKey(id);
        return 0;
    }

    @Override
    public int insert(GradeWarning record) {
        gradeWarningMapper.insert(record);
        return 0;
    }

    @Override
    public GradeWarning selectByPrimaryKey(Integer id) {
        return gradeWarningMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<GradeWarning> selectAll() {
        return gradeWarningMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(GradeWarning record) {
        gradeWarningMapper.updateByPrimaryKey(record);
        return 0;
    }

    @Override
    public List<GradeWarningVO> returnTableData(String xy, String xn, String xq) {
        return gradeWarningMapper.returnTableData(xy, xn, xq);
    }

}
