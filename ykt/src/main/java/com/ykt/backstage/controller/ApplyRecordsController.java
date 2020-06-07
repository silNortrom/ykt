package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.ApplyRecords;
import com.ykt.backstage.service.ApplyRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/5 15:13
 */
@RestController
@RequestMapping("/apply")
public class ApplyRecordsController {

    @Autowired
    ApplyRecordsService applyRecordsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        applyRecordsService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(ApplyRecords record) {
        applyRecordsService.insert(record);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", applyRecordsService.selectByPrimaryKey(id));
    }

    @RequestMapping(value = "pageRecords", method = RequestMethod.GET)
    public R pageQueryRecords(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<ApplyRecords> lists = applyRecordsService.pageQuery(query);
        int totalCount = applyRecordsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(ApplyRecords record) {
        applyRecordsService.updateByPrimaryKey(record);
        return R.ok();
    }

    @RequestMapping(value = "selectcdgl", method = RequestMethod.GET)
    public R selectcdgl(ApplyRecords record) {
        return R.ok().put("lists", applyRecordsService.selectcdgl());
    }
}
