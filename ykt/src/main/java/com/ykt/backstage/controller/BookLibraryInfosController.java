package com.ykt.backstage.controller;

import com.ykt.backstage.common.utils.Page;
import com.ykt.backstage.common.utils.Query;
import com.ykt.backstage.common.utils.R;
import com.ykt.backstage.entity.BookLibraryInfos;
import com.ykt.backstage.service.BookLibraryInfosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author likun
 * @version 1.0
 * @date 2019/12/25 20:57
 */
@RestController
@RequestMapping("/book")
public class BookLibraryInfosController {
    @Autowired
    BookLibraryInfosService bookLibraryInfosService;

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public R deleteById(Integer id) {
        bookLibraryInfosService.deleteByPrimaryKey(id);
        return R.ok();
    }

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public R insert(BookLibraryInfos bookLibraryInfos) {
        bookLibraryInfosService.insert(bookLibraryInfos);
        return R.ok();
    }

    @RequestMapping(value = "selectById", method = RequestMethod.GET)
    public R selectById(Integer id) {
        return R.ok().put("record", bookLibraryInfosService.selectByPrimaryKey(id));
    }

    @RequestMapping(value = "pageBooks", method = RequestMethod.GET)
    public R pageQueryBookLibraryInfos(Integer pn, Integer ps) {
        Query query = new Query(pn, ps);
        List<BookLibraryInfos> lists = bookLibraryInfosService.pageQuery(query);
        int totalCount = bookLibraryInfosService.selectAll().size();
        Page page = new Page(query, totalCount, lists);
        return R.ok().put("PageBookInfos", page);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public R updateRecord(BookLibraryInfos bookLibraryInfos) {
        bookLibraryInfosService.updateByPrimaryKey(bookLibraryInfos);
        return R.ok();
    }
}
