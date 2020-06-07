package com.ykt.backstage.service.impl;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.FeedbackRecordsMapper;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.service.FeedbackRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 23:04
 */
@Service
public class FeedbackRecordsServiceImp implements FeedbackRecordsService {
    @Autowired
    FeedbackRecordsMapper feedbackRecordsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return feedbackRecordsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(FeedbackRecords feedbackRecords) {
        return feedbackRecordsMapper.insert(feedbackRecords);
    }

    @Override
    public FeedbackRecords selectByPrimaryKey(Integer id) {
        return feedbackRecordsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<FeedbackRecords> selectAll() {
        return feedbackRecordsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(FeedbackRecords feedbackRecords) {
        return feedbackRecordsMapper.updateByPrimaryKey(feedbackRecords);
    }

    @Override
    public List<FeedbackRecords> pageQuery(Query query) {
        return feedbackRecordsMapper.pageQuery(query);
    }
}
