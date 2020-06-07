package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.Teachers;
import com.ykt.backstage.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:53
 */
@RestController
@RequestMapping("/teachers")
public class TeachersController {
    @Autowired
    TeachersService teachersService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(String teacherNum) {
        teachersService.deleteByPrimaryKey(teacherNum);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(Teachers teachers) {
        teachersService.insert(teachers);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(String teacherNum) {
        return R.ok().put("record", teachersService.selectByPrimaryKey(teacherNum));
    }

    @RequestMapping(value = "pageTeachers", method = RequestMethod.GET)
    public R pageQueryTeachers(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<Teachers> lists = teachersService.pageQuery(query);
        int totalCount = teachersService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(Teachers teachers) {
        teachersService.updateByPrimaryKey(teachers);
        return R.ok();
    }
}
