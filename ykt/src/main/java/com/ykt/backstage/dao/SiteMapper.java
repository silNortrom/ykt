package com.ykt.backstage.dao;

import com.ykt.backstage.VO.ApplySiteVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Site;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SiteMapper {

    int deleteByPrimaryKey(String siteCode);

    int insert(Site record);

    Site selectByPrimaryKey(String siteCode);

    List<Site> selectAll();

    int updateByPrimaryKey(Site record);

    List<Site> pageQuery(@Param("query") Query query);

    List<ApplySiteVO> selectsitevo();
}