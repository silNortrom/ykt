package com.ykt.backstage.service;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.BookLibraryInfos;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:28
 */
public interface BookLibraryInfosService {
    //按id删除
    int deleteByPrimaryKey(Integer id);

    //插入借阅记录
    int insert(BookLibraryInfos record);

    //根据id查找
    BookLibraryInfos selectByPrimaryKey(Integer id);

    //找出全部数据
    List<BookLibraryInfos> selectAll();

    //更新
    int updateByPrimaryKey(BookLibraryInfos record);

    //取出分页数据
    List<BookLibraryInfos> pageQuery(Query query);
}
