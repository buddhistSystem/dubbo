package com.liqian.service.impl;

import com.liqian.dao.UserMapper;
import com.liqian.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Administrator
 * @Date: 2019/7/30 0030 10:37
 * @Description:
 */
@Service
public class DemoServiceImpl implements DemoService {


    @Resource
    private UserMapper userMapper;


    @Override
    public int countUser() {
        return userMapper.countUser();
    }
}
