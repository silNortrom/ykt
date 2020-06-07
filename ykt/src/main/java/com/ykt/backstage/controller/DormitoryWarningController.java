package com.ykt.backstage.controller;

import com.ykt.backstage.VO.DormitoryWarningVO;
import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.VO.LostWarningsVO;
import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.DormitoryWarning;
import com.ykt.backstage.service.DormitoryWarningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:58
 */
@RestController
@RequestMapping("/dormitoryWarning")
public class DormitoryWarningController {
    @Autowired
    DormitoryWarningService dormitoryWarningService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        dormitoryWarningService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(DormitoryWarning dormitoryWarning) {
        dormitoryWarningService.insert(dormitoryWarning);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", dormitoryWarningService.selectByPrimaryKey(id));
    }

    @RequestMapping(value = "pageDormitoryWarning", method = RequestMethod.GET)
    public R pageQueryDormitoryWarning(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<DormitoryWarning> lists = dormitoryWarningService.pageQuery(query);
        int totalCount = dormitoryWarningService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(DormitoryWarning dormitoryWarning) {
        dormitoryWarningService.updateByPrimaryKey(dormitoryWarning);
        return R.ok();
    }

    @RequestMapping(value = "getData", method = RequestMethod.GET)
    public R getTableData() {
        /****************************************************************************/
        //接收不同类型的相应数目
        Map<String, Integer> sumValue = new HashMap<String, Integer>();
        //获取当月预警情况
        List<DormitoryWarningVO> mothWarning = dormitoryWarningService.getMonthData();
        //获取当天预警情况
        List<DormitoryWarningVO> dayNewWarning = dormitoryWarningService.getTodayData();
        //获取当月解除预警情况
        List<DormitoryWarningVO> monthLiftWarning = new ArrayList<DormitoryWarningVO>();
        //获取当月未解除预警情况
        List<DormitoryWarningVO> monthNotLiftWarning = new ArrayList<DormitoryWarningVO>();

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

        List<Map<String, Integer>> lineChart = dormitoryWarningService.monthLineWarning();

        /****************************************************************************/

        List<LostHistogramVO> histogramData = dormitoryWarningService.monthHistogramWarning();

        /****************************************************************************/

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
}
