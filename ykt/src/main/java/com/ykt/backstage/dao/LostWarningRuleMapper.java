package com.ykt.backstage.dao;

import com.ykt.backstage.entity.LostWarningRule;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LostWarningRuleMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(LostWarningRule record);

    LostWarningRule selectByPrimaryKey(Integer id);

    List<LostWarningRule> selectAll();

    int updateByPrimaryKey(LostWarningRule record);
}