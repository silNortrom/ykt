package com.ykt.backstage.service;

import com.ykt.backstage.VO.DormitoryWarningVO;
import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.DormitoryWarning;

import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:53
 */
public interface DormitoryWarningService {

    int deleteByPrimaryKey(Integer id);

    int insert(DormitoryWarning dormitoryWarning);

    DormitoryWarning selectByPrimaryKey(Integer id);

    List<DormitoryWarning> selectAll();

    int updateByPrimaryKey(DormitoryWarning dormitoryWarning);

    List<DormitoryWarning> pageQuery(Query query);

    List<DormitoryWarningVO> getMonthData();

    List<DormitoryWarningVO> getTodayData();

    List<Map<String, Integer>> monthLineWarning();

    List<LostHistogramVO> monthHistogramWarning();
}
