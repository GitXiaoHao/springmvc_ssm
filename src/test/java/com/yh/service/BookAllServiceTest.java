package com.yh.service;

import com.yh.config.SpringConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * date 2022/12/19
 *
 * @author yu
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookAllServiceTest {
    @Autowired
    private BookAllService bookAllService;
    @Test
    public void testGetByPrimaryKey(){
        bookAllService.selectByPrimaryKey(1);
    }
}
