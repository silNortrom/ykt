package com.ykt.backstage.service.impl;

import com.ykt.backstage.VO.ApplySiteVO;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.SiteMapper;
import com.ykt.backstage.entity.Site;
import com.ykt.backstage.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/18 16:40
 */
@Service
public class SiteServiceImp implements SiteService {

    @Autowired
    SiteMapper siteMapper;


    @Override
    public int deleteByPrimaryKey(String siteCode) {
        return siteMapper.deleteByPrimaryKey(siteCode);
    }

    @Override
    public int insert(Site record) {
        return siteMapper.insert(record);
    }

    @Override
    public Site selectByPrimaryKey(String siteCode) {
        return siteMapper.selectByPrimaryKey(siteCode);
    }

    @Override
    public List<Site> selectAll() {
        return siteMapper.selectAll();
    }

    @Override
    public List<Site> pageQuery(Query query) {
        return siteMapper.pageQuery(query);
    }

    @Override
    public int updateByPrimaryKey(Site record) {
        return siteMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ApplySiteVO> selectsitevo() {
        return siteMapper.selectsitevo();
    }
}
