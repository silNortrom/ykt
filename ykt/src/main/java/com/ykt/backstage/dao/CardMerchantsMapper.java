package com.ykt.backstage.dao;

import com.ykt.backstage.VO.CardMerchantsVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.CardMerchants;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CardMerchantsMapper {

    int deleteByPrimaryKey(String merchantCode);

    int insert(CardMerchantsVO cardMerchantsVO);

    CardMerchants selectByPrimaryKey(String merchantCode);

    List<CardMerchantsVO> selectAll();

    int updateByPrimaryKey(CardMerchantsVO cardMerchantsVO);

    List<CardMerchants> pageQuery(@Param("query") Query query);
}