package com.test.dockertest.controller;

import com.test.dockertest.mapper.TestMapper;
import com.test.dockertest.mapper.Tester;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试类
 *
 * @author gaofeng
 * @version 1.0
 * @date 2019-09-30
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Resource
    private TestMapper testMapper;

    @RequestMapping(value = "/hello")
    public String hello() {
        Tester tester = new Tester();
        tester.setTestId(Integer.valueOf(String.valueOf(System.currentTimeMillis() / 1000L)));
        testMapper.insert(tester);
        return "hello";
    }
}
