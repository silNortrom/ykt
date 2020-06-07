package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.CardMerchantsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.CardMerchantsMapper;
import com.ykt.backstage.entity.CardMerchants;
import com.ykt.backstage.service.CardMerchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:05
 */
@Service
public class CardMerchantsServiceImp implements CardMerchantsService {
    @Autowired
    CardMerchantsMapper cardMerchantsMapper;

    @Override
    public int deleteByPrimaryKey(String merchantCode) {
        return cardMerchantsMapper.deleteByPrimaryKey(merchantCode);
    }

    @Override
    public int insert(CardMerchantsVO cardMerchantsVO) {
        return cardMerchantsMapper.insert(cardMerchantsVO);
    }

    @Override
    public CardMerchants selectByPrimaryKey(String merchantCode) {
        return cardMerchantsMapper.selectByPrimaryKey(merchantCode);
    }

    @Override
    public List<CardMerchantsVO> selectAll() {
        return cardMerchantsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(CardMerchantsVO cardMerchantsVO) {
        return cardMerchantsMapper.updateByPrimaryKey(cardMerchantsVO);
    }

    @Override
    public List<CardMerchants> pageQuery(Query query) {
        return cardMerchantsMapper.pageQuery(query);
    }
}
