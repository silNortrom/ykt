package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.DormitoryWarningVO;
import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.DormitoryWarningMapper;
import com.ykt.backstage.entity.DormitoryWarning;
import com.ykt.backstage.service.DormitoryWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:55
 */
@Service
public class DormitoryWarningServiceImp implements DormitoryWarningService {
    @Autowired
    DormitoryWarningMapper dormitoryWarningMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dormitoryWarningMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(DormitoryWarning dormitoryWarning) {
        return dormitoryWarningMapper.insert(dormitoryWarning);
    }

    @Override
    public DormitoryWarning selectByPrimaryKey(Integer id) {
        return dormitoryWarningMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<DormitoryWarning> selectAll() {
        return dormitoryWarningMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(DormitoryWarning dormitoryWarning) {
        return dormitoryWarningMapper.updateByPrimaryKey(dormitoryWarning);
    }

    @Override
    public List<DormitoryWarning> pageQuery(Query query) {
        return dormitoryWarningMapper.pageQuery(query);
    }

    @Override
    public List<DormitoryWarningVO> getMonthData() {
        return dormitoryWarningMapper.getMonthData();
    }

    @Override
    public List<DormitoryWarningVO> getTodayData() {
        return dormitoryWarningMapper.getTodayData();
    }

    @Override
    public List<Map<String, Integer>> monthLineWarning() {
        return dormitoryWarningMapper.monthLineWarning();
    }

    @Override
    public List<LostHistogramVO> monthHistogramWarning() {
        return dormitoryWarningMapper.monthHistogramWarning();
    }
}
