package com.ykt.backstage.dao;

import com.ykt.backstage.VO.CardTransactionsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.CardTransactions;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CardTransactionsMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(CardTransactions record);

    CardTransactions selectByPrimaryKey(Integer id);

    List<CardTransactions> selectAll();

    int updateByPrimaryKey(CardTransactions record);

    List<CardTransactions> pageQuery(@Param("query") Query query);

    //TODO    取出一个月内的数据(按用户来取结果的加上)
    List<CardTransactions> selectMonth();

    //TODO    取出一年内的数据(按用户来取结果的加上)
    List<CardTransactions> selectYear();

    //    取出一个月内数据按种类和时间分
    List<CardTransactionsVO> selectMonthByTypeDate();

    //根据传入的时间和类型返回该条件下的具体消费情况
    List<CardTransactions> selectByDateType(@Param("time") String time, @Param("type") String type);

    //返回该生的消费top10数据
    List<CardTransactionsVO> getTop10();
}