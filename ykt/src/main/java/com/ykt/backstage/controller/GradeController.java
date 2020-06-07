package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.Grade;
import com.ykt.backstage.entity.GradeWarning;
import com.ykt.backstage.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "insertGrade", method = RequestMethod.POST)
    public R insert(Grade record) {
        gradeService.insert(record);
        return R.ok();
    }

    @RequestMapping(value = "deleteGrade", method = RequestMethod.DELETE)
    public R deleteByPrimaryKey(Integer id) {
        gradeService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "selectall", method = RequestMethod.GET)
    public R selectall(Integer id) {
        return R.ok().put("lists", gradeService.selectAll());
    }

    @RequestMapping(value = "selectbydate", method = RequestMethod.GET)
    public R selectall(String date) {
        return R.ok().put("dates", gradeService.selectAll());
    }
}
