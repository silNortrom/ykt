package com.ykt.backstage.service;

import com.ykt.backstage.VO.CardTransactionsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.CardTransactions;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:35
 */
public interface CardTransactionsService {

    int deleteByPrimaryKey(Integer id);

    int insert(CardTransactions record);

    CardTransactions selectByPrimaryKey(Integer id);

    List<CardTransactions> selectAll();

    int updateByPrimaryKey(CardTransactions record);

    List<CardTransactions> pageQuery(Query query);

    List<CardTransactions> selectMonth();

    List<CardTransactions> selectYear();

    List<CardTransactionsVO> selectMonthByTypeDate();

    List<CardTransactions> selectByDateType(String time, String type);

    List<CardTransactionsVO> getTop10();
}
