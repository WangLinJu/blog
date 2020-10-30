package com.itheilv.blog.service.impl;

import com.itheilv.blog.base.BaseServiceImpl;
import com.itheilv.blog.mapper.UserMapper;
import com.itheilv.blog.model.User;
import com.itheilv.blog.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 服务实现类
 *
 * @author WSQ
 * @since 2020-10-30
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

}

