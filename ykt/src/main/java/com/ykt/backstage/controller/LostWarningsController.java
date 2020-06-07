package com.ykt.backstage.controller;

import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.VO.LostWarningsVO;
import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.entity.LostWarnings;
import com.ykt.backstage.entity.Students;
import com.ykt.backstage.service.LostWarningsService;
import com.ykt.backstage.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/26 20:22
 */
@RestController
@RequestMapping("/lost")
public class LostWarningsController {
    @Autowired
    LostWarningsService lostWarningsService;
    @Autowired
    StudentsService studentsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        lostWarningsService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(LostWarnings lostWarnings) {
        lostWarningsService.insert(lostWarnings);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", lostWarningsService.selectByPrimaryKey(id));
    }

    @RequestMapping(value = "pageLostWarnings", method = RequestMethod.GET)
    public R pageQueryLostWarnings(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<LostWarnings> lists = lostWarningsService.pageQuery(query);
        int totalCount = lostWarningsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(LostWarnings lostWarnings) {
        lostWarningsService.updateByPrimaryKey(lostWarnings);
        return R.ok();
    }

    @RequestMapping(value = "getData", method = RequestMethod.GET)
    public R getTableData() {
        /****************************************************************************/
        //接收不同类型的相应数目
        Map<String, Integer> sumValue = new HashMap<String, Integer>();
        //获取当月预警情况
        List<LostWarningsVO> mothWarning = lostWarningsService.monthWarning();
        //获取当天预警情况
        List<LostWarningsVO> dayNewWarning = lostWarningsService.dayNewWarning();
        //获取当月解除预警情况
        List<LostWarningsVO> monthLiftWarning = new ArrayList<LostWarningsVO>();
        //获取当月未解除预警情况
        List<LostWarningsVO> monthNotLiftWarning = new ArrayList<LostWarningsVO>();

        //在这里进行分类操作
        for (int i = 0; i < mothWarning.size(); i++) {
            if (mothWarning.get(i).getJcyjsj().equals("none")) {
                monthNotLiftWarning.add(mothWarning.get(i));
                System.out.println(mothWarning.get(i).getJcyjsj());
            } else {
                monthLiftWarning.add(mothWarning.get(i));
            }
        }

        sumValue.put("mothWarning", mothWarning.size());
        sumValue.put("dayNewWarning", dayNewWarning.size());
        sumValue.put("monthLiftWarning", monthLiftWarning.size());
        sumValue.put("monthNotLiftWarning", monthNotLiftWarning.size());
        /****************************************************************************/

        List<Map<String, Integer>> lineChart = lostWarningsService.monthLineWarning();

        /****************************************************************************/

        List<LostHistogramVO> histogramData = lostWarningsService.monthHistogramWarning();

        /****************************************************************************/

////        测试一下插入是否成功
//        FeedbackRecords feedbackRecords = new FeedbackRecords();
//        feedbackRecords.setAttendanceWarningsId(2);
//        feedbackRecords.setFeedbackTime(new Date());
//        feedbackRecords.setCreatedBy("hhh");
//        feedbackRecords.setCreatedUserId("1");
//        feedbackRecords.setCreatedAt(new Date());
//        feedbackRecords.setDescription("sadhjshdjhd");
//        lostWarningsService.addFeedbacks(feedbackRecords);
        /****************************************************************************/
        //返回数据给前端
        return R.ok().put("sumValue", sumValue)
                .put("mothWarning", mothWarning)
                .put("dayNewWarning", dayNewWarning)
                .put("monthLiftWarning", monthLiftWarning)
                .put("monthNotLiftWarning", monthNotLiftWarning)
                .put("lineChart", lineChart)
                .put("histogramData", histogramData);
    }

    @RequestMapping(value = "liftWarning", method = RequestMethod.POST)
    public R liftWarning(@RequestBody FeedbackRecords feedbackRecords) {
        lostWarningsService.addFeedbacks(feedbackRecords);
        return R.ok();
    }

    @RequestMapping(value = "getPortrait", method = RequestMethod.GET)
    public R getPortrait(String xh) {
        Students students = studentsService.selectByPrimaryKey(xh);
        return R.ok().put("student", students);
    }
}
