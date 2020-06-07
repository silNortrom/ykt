package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.Students;
import com.ykt.backstage.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:45
 */
@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(String xh) {
        studentsService.deleteByPrimaryKey(xh);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(Students students) {
        studentsService.insert(students);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(String xh) {
        return R.ok().put("record", studentsService.selectByPrimaryKey(xh));
    }

    @RequestMapping(value = "pageStudents", method = RequestMethod.GET)
    public R pageQueryStudents(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<Students> lists = studentsService.pageQuery(query);
        int totalCount = studentsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(Students students) {
        studentsService.updateByPrimaryKey(students);
        return R.ok();
    }
}
