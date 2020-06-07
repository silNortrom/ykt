package com.ykt.backstage.service;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.FeedbackRecords;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:38
 */
public interface FeedbackRecordsService {
    int deleteByPrimaryKey(Integer id);

    int insert(FeedbackRecords record);

    FeedbackRecords selectByPrimaryKey(Integer id);

    List<FeedbackRecords> selectAll();

    int updateByPrimaryKey(FeedbackRecords record);

    List<FeedbackRecords> pageQuery(Query query);
}
