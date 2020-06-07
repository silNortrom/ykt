package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.VO.LostWarningsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.LostWarningsMapper;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.entity.LostWarnings;
import com.ykt.backstage.service.LostWarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:18
 */
@Service
public class LostWarningsServiceImp implements LostWarningsService {
    @Autowired
    LostWarningsMapper lostWarningsMapper;

    @Override
    public int deleteByPrimaryKey(int id) {
        return lostWarningsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LostWarnings lostWarnings) {
        return lostWarningsMapper.insert(lostWarnings);
    }

    @Override
    public LostWarnings selectByPrimaryKey(int id) {
        return lostWarningsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<LostWarnings> selectAll() {
        return lostWarningsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(LostWarnings lostWarnings) {
        return lostWarningsMapper.updateByPrimaryKey(lostWarnings);
    }

    @Override
    public List<LostWarnings> pageQuery(Query query) {
        return lostWarningsMapper.pageQuery(query);
    }

    @Override
    public List<LostWarningsVO> monthWarning() {
        return lostWarningsMapper.monthWarning();
    }

    @Override
    public List<LostWarningsVO> dayNewWarning() {
        return lostWarningsMapper.dayNewWarning();
    }

    @Override
    public List<LostWarningsVO> monthLiftWarning() {
        return lostWarningsMapper.monthWarning();
    }

    @Override
    public List<LostWarningsVO> monthNotLiftWarning() {
        return lostWarningsMapper.dayNewWarning();
    }

    @Override
    public List<Map<String, Integer>> monthLineWarning() {
        return lostWarningsMapper.monthLineWarning();
    }

    @Override
    public List<LostHistogramVO> monthHistogramWarning() {
        return lostWarningsMapper.monthHistogramWarning();
    }

    @Override
    public void addFeedbacks(FeedbackRecords feedbackRecords) {
        lostWarningsMapper.addFeedbacks(feedbackRecords);
    }

}
