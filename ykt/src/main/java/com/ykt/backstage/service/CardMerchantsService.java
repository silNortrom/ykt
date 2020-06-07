package com.ykt.backstage.service;

import com.ykt.backstage.VO.CardMerchantsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.CardMerchants;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:30
 */
public interface CardMerchantsService {
    int deleteByPrimaryKey(String merchantCode);

    int insert(CardMerchantsVO cardMerchantsVO);

    CardMerchants selectByPrimaryKey(String merchantCode);

    List<CardMerchantsVO> selectAll();

    int updateByPrimaryKey(CardMerchantsVO cardMerchantsVO);

    List<CardMerchants> pageQuery(Query query);
}
