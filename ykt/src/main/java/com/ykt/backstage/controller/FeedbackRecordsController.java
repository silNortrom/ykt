package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.service.FeedbackRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 23:06
 */
@RestController
@RequestMapping("/feedback")
public class FeedbackRecordsController {
    @Autowired
    FeedbackRecordsService feedbackRecordsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        feedbackRecordsService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(FeedbackRecords feedbackRecords) {
        feedbackRecordsService.insert(feedbackRecords);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", feedbackRecordsService.selectByPrimaryKey(id));
    }

    @RequestMapping(value = "pageFeedbackRecords", method = RequestMethod.GET)
    public R pageQueryFeedbackRecords(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<FeedbackRecords> lists = feedbackRecordsService.pageQuery(query);
        int totalCount = feedbackRecordsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(FeedbackRecords feedbackRecords) {
        feedbackRecordsService.updateByPrimaryKey(feedbackRecords);
        return R.ok();
    }
}
