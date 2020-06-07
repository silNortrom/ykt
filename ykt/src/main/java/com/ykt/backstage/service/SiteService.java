package com.ykt.backstage.service;

import com.ykt.backstage.VO.ApplySiteVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.Site;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/18 16:28
 */
public interface SiteService {

    //根据id删除
    int deleteByPrimaryKey(String siteCode);

    //插入
    int insert(Site record);

    //根据id返回对象
    Site selectByPrimaryKey(String siteCode);

    //返回所有对象
    List<Site> selectAll();

    /**
     * @param query
     * @return 分页数据
     */
    List<Site> pageQuery(Query query);

    //更新
    int updateByPrimaryKey(Site record);

    List<ApplySiteVO> selectsitevo();

}
