package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.Site;
import com.ykt.backstage.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/18 16:43
 */
@RestController
@RequestMapping("/site")
public class SiteController {
    @Autowired
    SiteService siteService;

    //取得分页数据
    @RequestMapping(value = "pageSites", method = RequestMethod.GET)
    public R getQueryPage(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<Site> lists = siteService.pageQuery(query);
        int totalCount = siteService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageSites", page);
    }

    //    //修改
//    @RequestMapping(value = "updateSiteStatus",method = RequestMethod.POST)
//    public R updateStatus(int id,int status){
//        siteService.updateStatus(id,status);
//        return R.ok();
//    }
    @RequestMapping(value = "selectsitevo", method = RequestMethod.GET)
    public R selectsitevo() {
        return R.ok().put("lists", siteService.selectsitevo());
    }


}
