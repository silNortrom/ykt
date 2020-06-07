package com.ykt.backstage.controller;

import com.ykt.backstage.VO.CardMerchantsVO;
import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.CardMerchants;
import com.ykt.backstage.service.CardMerchantsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:12
 */
@RestController
@RequestMapping("/card/merchants")
public class CardMerchantsController {
    @Autowired
    CardMerchantsService cardMerchantsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(String merchantCode) {
        cardMerchantsService.deleteByPrimaryKey(merchantCode);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(@RequestBody CardMerchantsVO cardMerchantsVO) {
        cardMerchantsService.insert(cardMerchantsVO);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(String merchantCode) {
        return R.ok().put("record", cardMerchantsService.selectByPrimaryKey(merchantCode));
    }

    @RequestMapping(value = "pageCardMerchants", method = RequestMethod.GET)
    public R pageQueryCardMerchants(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<CardMerchants> lists = cardMerchantsService.pageQuery(query);
//        int totalCount = cardMerchantsService.selectAll().size();
        int totalCount = cardMerchantsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "selectAll", method = RequestMethod.GET)
    public R selectAll() {
        List<CardMerchantsVO> lists = cardMerchantsService.selectAll();
        return R.ok().put("lists", lists);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(@RequestBody CardMerchantsVO cardMerchantsVO) {
        cardMerchantsService.updateByPrimaryKey(cardMerchantsVO);
        return R.ok();
    }
}
