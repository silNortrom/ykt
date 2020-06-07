package com.ykt.backstage.dao;

import com.ykt.backstage.VO.LostHistogramVO;
import com.ykt.backstage.VO.LostWarningsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.FeedbackRecords;
import com.ykt.backstage.entity.LostWarnings;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface LostWarningsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(LostWarnings record);

    LostWarnings selectByPrimaryKey(Integer id);

    List<LostWarnings> selectAll();

    int updateByPrimaryKey(LostWarnings record);

    List<LostWarnings> pageQuery(@Param("query") Query query);

    List<LostWarningsVO> monthWarning();

    List<LostWarningsVO> dayNewWarning();

    List<LostWarningsVO> monthLiftWarning();

    List<LostWarningsVO> monthNotLiftWarning();

    List<Map<String, Integer>> monthLineWarning();

    List<LostHistogramVO> monthHistogramWarning();

    void addFeedbacks(FeedbackRecords feedbackRecords);
}