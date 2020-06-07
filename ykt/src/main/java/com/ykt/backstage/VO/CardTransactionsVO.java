package com.ykt.backstage.VO;

import java.io.Serializable;

/**
 * @aunthor likun
 * @description 消费记录处理类
 * @date 2020/5/1
 */
public class CardTransactionsVO implements Serializable {

    private String transactionType;
    private String transactionDate;
    private Integer transactionAmount;

    public CardTransactionsVO(String transactionType, String transactionDate, Integer transactionAmount) {
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }
}
