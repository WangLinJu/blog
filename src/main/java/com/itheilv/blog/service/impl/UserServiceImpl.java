package com.itheilv.blog.service.impl;

import com.itheilv.blog.model.User;
import com.itheilv.blog.mapper.UserMapper;
import com.itheilv.blog.service.UserService;
import com.itheilv.blog.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务实现类
 *
 * @author WSQ
 * @since 2020-11-23
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}

