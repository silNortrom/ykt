package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.GradeWarning;
import com.ykt.backstage.service.GradeWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @aunthor likun
 * @description 成绩处理
 * @date 2020/4/20
 */
@RestController
@RequestMapping("/grade")
public class GradeWarningController {
    @Autowired
    GradeWarningService gradeWarningService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        gradeWarningService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(GradeWarning record) {
        gradeWarningService.insert(record);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", gradeWarningService.selectByPrimaryKey(id));
    }


    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(GradeWarning record) {
        gradeWarningService.updateByPrimaryKey(record);
        return R.ok();
    }

    //根据学院学年学期返回学业预警情况
    @RequestMapping(value = "returnTableData", method = RequestMethod.GET)
    public R returnTableData(String xy, String xn, String xq) {
        return R.ok().put("tableData", gradeWarningService.returnTableData(xy, xn, xq));
    }
}
