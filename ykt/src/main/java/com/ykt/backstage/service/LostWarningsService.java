package com.ykt.backstage.service;

import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.VO.LostWarningsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.entity.LostWarnings;

import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:03
 */
public interface LostWarningsService {
    int deleteByPrimaryKey(int id);

    int insert(LostWarnings lostWarnings);

    LostWarnings selectByPrimaryKey(int id);

    List<LostWarnings> selectAll();

    int updateByPrimaryKey(LostWarnings lostWarnings);

    List<LostWarnings> pageQuery(Query query);

    List<LostWarningsVO> monthWarning();

    List<LostWarningsVO> dayNewWarning();

    List<LostWarningsVO> monthLiftWarning();

    List<LostWarningsVO> monthNotLiftWarning();

    List<Map<String, Integer>> monthLineWarning();

    List<LostHistogramVO> monthHistogramWarning();

    void addFeedbacks(FeedbackRecords feedbackRecords);
}
