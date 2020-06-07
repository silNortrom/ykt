package com.ykt.backstage.dao;

import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.entity.BookLibraryInfos;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookLibraryInfosMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(BookLibraryInfos record);

    BookLibraryInfos selectByPrimaryKey(Integer id);

    List<BookLibraryInfos> selectAll();

    int updateByPrimaryKey(BookLibraryInfos record);

    List<BookLibraryInfos> pageQuery(@Param("query") Query query);
}