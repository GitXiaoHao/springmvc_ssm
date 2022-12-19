package com.yh.controller;

import com.yh.pojo.BookAll;
import com.yh.service.BookAllService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * date 2022/12/19
 *
 * @author yu
 */
//替代 Controller和 ResponseBody
@RestController
//设置重复路径
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookAllService bookAllService;

    @DeleteMapping("/{bookId}")
    public Result deleteByPrimaryKey(@PathVariable Integer bookId) {
        boolean flag = bookAllService.deleteByPrimaryKey(bookId);
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR,flag);
    }

    @PostMapping
    public Result insert(@RequestBody BookAll record) {
        boolean flag = bookAllService.insert(record);
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @GetMapping("/{bookId}")
    public Result selectByPrimaryKey(@PathVariable Integer bookId) {
        BookAll bookAll = bookAllService.selectByPrimaryKey(bookId);
        Integer code = bookAll == null ? Code.GET_ERR : Code.GET_OK;
        String msg = bookAll == null ? "" : "数据查询失败";
        return new Result(code,bookAll,msg);
    }

    @GetMapping
    public Result selectAll() {
        List<BookAll> bookAllList = bookAllService.selectAll();
        Integer code = bookAllList == null || bookAllList.size() == 0 ? Code.GET_ERR : Code.GET_OK;
        String msg = bookAllList == null || bookAllList.size() == 0 ? "" : "数据查询失败";
        return new Result(code,bookAllList,msg);
    }

    @PutMapping
    public Result updateByPrimaryKey(@RequestBody BookAll record) {
        boolean flag = bookAllService.updateByPrimaryKey(record);
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
