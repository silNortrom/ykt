package com.ykt.backstage.service;


import com.ykt.backstage.VO.CdglVo;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.ApplyRecords;

import java.util.List;

public interface ApplyRecordsService {

    //撤销申请
    void deleteByPrimaryKey(Integer id);

    //插入申请数据
    void insert(ApplyRecords record);

    //根据id找到申请数据
    ApplyRecords selectByPrimaryKey(Integer id);

    //返回所有申请数据
    List<ApplyRecords> selectAll();

    /**
     * 取得分页数据
     *
     * @param 分页信息
     * @return 分页数据
     */
    List<ApplyRecords> pageQuery(Query query);


    //更新数据
    void updateByPrimaryKey(ApplyRecords record);

    List<CdglVo> selectcdgl();

}
