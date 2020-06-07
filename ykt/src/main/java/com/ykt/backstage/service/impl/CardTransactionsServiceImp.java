package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.CardTransactionsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.CardTransactionsMapper;
import com.ykt.backstage.entity.CardTransactions;
import com.ykt.backstage.service.CardTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:24
 */
@Service
public class CardTransactionsServiceImp implements CardTransactionsService {
    @Autowired
    CardTransactionsMapper cardTransactionsMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cardTransactionsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CardTransactions cardTransactions) {
        return cardTransactionsMapper.insert(cardTransactions);
    }

    @Override
    public CardTransactions selectByPrimaryKey(Integer id) {
        return cardTransactionsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CardTransactions> selectAll() {
        return cardTransactionsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(CardTransactions cardTransactions) {
        return cardTransactionsMapper.updateByPrimaryKey(cardTransactions);
    }

    @Override
    public List<CardTransactions> pageQuery(Query query) {
        return cardTransactionsMapper.pageQuery(query);
    }

    @Override
    public List<CardTransactions> selectMonth() {
        return cardTransactionsMapper.selectMonth();
    }

    @Override
    public List<CardTransactions> selectYear() {
        return cardTransactionsMapper.selectYear();
    }

    @Override
    public List<CardTransactionsVO> selectMonthByTypeDate() {
        return cardTransactionsMapper.selectMonthByTypeDate();
    }

    @Override
    public List<CardTransactions> selectByDateType(String time, String type) {
        return cardTransactionsMapper.selectByDateType(time, type);
    }

    @Override
    public List<CardTransactionsVO> getTop10() {
        return cardTransactionsMapper.getTop10();
    }
}
