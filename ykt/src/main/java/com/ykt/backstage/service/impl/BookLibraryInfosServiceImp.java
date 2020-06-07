package com.ykt.backstage.service.impl;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.dao.BookLibraryInfosMapper;
import com.ykt.backstage.entity.BookLibraryInfos;
import com.ykt.backstage.service.BookLibraryInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:44
 */
@Service
public class BookLibraryInfosServiceImp implements BookLibraryInfosService {
    @Autowired
    BookLibraryInfosMapper bookLibraryInfosMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bookLibraryInfosMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BookLibraryInfos record) {
        return bookLibraryInfosMapper.insert(record);
    }

    @Override
    public BookLibraryInfos selectByPrimaryKey(Integer id) {
        return bookLibraryInfosMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<BookLibraryInfos> selectAll() {
        return bookLibraryInfosMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(BookLibraryInfos record) {
        return bookLibraryInfosMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BookLibraryInfos> pageQuery(Query query) {
        return bookLibraryInfosMapper.pageQuery(query);
    }
}
