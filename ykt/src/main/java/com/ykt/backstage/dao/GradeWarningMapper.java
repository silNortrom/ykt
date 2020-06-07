package com.ykt.backstage.dao;

import com.ykt.backstage.VO.GradeWarningVO;
import com.ykt.backstage.entity.GradeWarning;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GradeWarningMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(GradeWarning record);

    GradeWarning selectByPrimaryKey(Integer id);

    List<GradeWarning> selectAll();

    int updateByPrimaryKey(GradeWarning record);

    List<GradeWarningVO> returnTableData(@Param("xy") String xy, @Param("xn") String xn, @Param("xq") String xq);
}