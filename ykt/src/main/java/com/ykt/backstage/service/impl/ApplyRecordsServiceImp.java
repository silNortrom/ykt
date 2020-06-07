package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.CdglVo;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.ApplyRecordsMapper;
import com.ykt.backstage.entity.ApplyRecords;
import com.ykt.backstage.service.ApplyRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/5 11:38
 */
@Service
public class ApplyRecordsServiceImp implements ApplyRecordsService {

    @Autowired
    private ApplyRecordsMapper applyRecordsMapper;

    @Override
    public void deleteByPrimaryKey(Integer id) {
        applyRecordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insert(ApplyRecords record) {
        applyRecordsMapper.insert(record);
    }

    @Override
    public ApplyRecords selectByPrimaryKey(Integer id) {
        return applyRecordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<ApplyRecords> selectAll() {
        return applyRecordsMapper.selectAll();
    }

    @Override
    public List<ApplyRecords> pageQuery(Query query) {
        return applyRecordsMapper.pageQuery(query);
    }

    @Override
    public void updateByPrimaryKey(ApplyRecords record) {
        applyRecordsMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<CdglVo> selectcdgl() {
        return applyRecordsMapper.selectcdgl();
    }
}
