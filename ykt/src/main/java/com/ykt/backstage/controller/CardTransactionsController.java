package com.ykt.backstage.controller;

import com.ykt.backstage.VO.CardTransactionsVO;
import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.CardTransactions;
import com.ykt.backstage.service.CardTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 22:33
 */
@RestController
@RequestMapping("/card/transactions")
public class CardTransactionsController {
    @Autowired
    CardTransactionsService cardTransactionsService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        cardTransactionsService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(CardTransactions cardTransactions) {
        cardTransactionsService.insert(cardTransactions);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        CardTransactions C= cardTransactionsService.selectByPrimaryKey(id);
        return R.ok().put("record", C);
    }

    @RequestMapping(value = "pageCardTransactions", method = RequestMethod.GET)
    public R pageQueryCardTransactions(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<CardTransactions> lists = cardTransactionsService.pageQuery(query);
        int totalCount = cardTransactionsService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageRecords", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(CardTransactions cardTransactions) {
        cardTransactionsService.updateByPrimaryKey(cardTransactions);
        return R.ok();
    }

    //    取得近一个月消费
    @RequestMapping(value = "selectMonth", method = RequestMethod.GET)
    public R monthCardTransactions() {
        List<CardTransactions> lists = cardTransactionsService.selectMonth();
        Map<String, Integer> sumValue = new HashMap<String, Integer>();
        Integer temporary;

        for (CardTransactions cardTransaction : lists) {
            if (sumValue.containsKey(cardTransaction.getTransactionType())) {
                temporary = sumValue.get(cardTransaction.getTransactionType());
                sumValue.put(cardTransaction.getTransactionType(), cardTransaction.getTransactionAmount() + temporary);
            } else {
                sumValue.put(cardTransaction.getTransactionType(), cardTransaction.getTransactionAmount());
            }
        }

        List<CardTransactionsVO> typeDate = cardTransactionsService.selectMonthByTypeDate();
////        存hashmap的map
//        HashMap<String, HashMap<String, ArrayList<String>>> typeMap = new HashMap<String, HashMap<String, ArrayList<String>>>();
//
//        for (CardTransactionsVO cardTransactionsVO : typeDate) {
//            if(typeMap.containsKey(cardTransactionsVO.getTransactionType())){
//                typeMap.get(cardTransactionsVO.getTransactionType()).get("dateData").add(cardTransactionsVO.getTransactionDate());
//                typeMap.get(cardTransactionsVO.getTransactionType()).get("expectedData").add(String.valueOf(cardTransactionsVO.getTransactionAmount()));
//            }else{
//                typeMap.put(cardTransactionsVO.getTransactionType(),new HashMap<String, ArrayList<String>>());
//                typeMap.get(cardTransactionsVO.getTransactionType()).put("expectedData",new ArrayList<String>());
//                typeMap.get(cardTransactionsVO.getTransactionType()).put("dateData",new ArrayList<String>());
//                typeMap.get(cardTransactionsVO.getTransactionType()).get("dateData").add(cardTransactionsVO.getTransactionDate());
//                typeMap.get(cardTransactionsVO.getTransactionType()).get("expectedData").add(String.valueOf(cardTransactionsVO.getTransactionAmount()));
//            }
//        }
//        map里套map
        return R.ok().put("sumValue", sumValue).put("typeDate", typeDate);
    }

    //    根据时间和类型返回该时间的详细消费情况
    @RequestMapping(value = "dateGetCardTransactions", method = RequestMethod.GET)
    public R dateGetCardTransactions(String time, String type) {
        List<CardTransactions> lists = cardTransactionsService.selectByDateType(time, type);
        return R.ok().put("lists", lists);
    }

    //    取出top10的信息
    @RequestMapping(value = "getTop10", method = RequestMethod.GET)
    public R dateGetCardTransactions() {
        List<CardTransactionsVO> top10 = cardTransactionsService.getTop10();

        return R.ok().put("top10", top10);
    }
}
