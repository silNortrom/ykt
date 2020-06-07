package com.ykt.backstage.dao;

import com.ykt.backstage.VO.DormitoryWarningVO;
import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.DormitoryWarning;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface DormitoryWarningMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(DormitoryWarning record);

    DormitoryWarning selectByPrimaryKey(Integer id);

    List<DormitoryWarning> selectAll();

    int updateByPrimaryKey(DormitoryWarning record);

    List<DormitoryWarning> pageQuery(@Param("query") Query query);

    List<DormitoryWarningVO> getMonthData();

    List<DormitoryWarningVO> getTodayData();

    List<Map<String, Integer>> monthLineWarning();

    List<LostHistogramVO> monthHistogramWarning();
}