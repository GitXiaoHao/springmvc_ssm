package com.yh.service.impl;

import com.yh.mapper.BookAllMapper;
import com.yh.pojo.BookAll;
import com.yh.service.BookAllService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者 小豪<p>
 * 时间 2022/12/18<p>
 *
 * @author yu<p>
 */
@Service
public class BookAllServiceImpl implements BookAllService {
    @Autowired
    private BookAllMapper mapper;


    @Override
    public boolean deleteByPrimaryKey(Integer bookId) {
        return mapper.deleteByPrimaryKey(bookId) == 1;
    }

    @Override
    public boolean insert(BookAll record) {
        return mapper.insert(record) == 1;
    }

    @Override
    public BookAll selectByPrimaryKey(Integer bookId) {
        return mapper.selectByPrimaryKey(bookId);
    }

    @Override
    public List<BookAll> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public boolean updateByPrimaryKey(BookAll record) {
        return mapper.updateByPrimaryKey(record) == 1;
    }
}
