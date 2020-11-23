package com.itheilv.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.itheilv.blog.base.BaseController;
import com.itheilv.blog.service.UserService;
import com.itheilv.blog.model.User;

/**
 * 用户表管理 Controller
 *
 * @author WSQ
 * @since 2020-11-23
 */
@RestController
@Api(value = "User管理", tags = "用户表管理")
@RequestMapping("/user")
public class UserController extends BaseController {

    @Autowired
    private UserService userService;

}
