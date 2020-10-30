package com.itheilv.blog.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheilv.blog.base.BaseController;
import com.itheilv.blog.base.BaseResult;
import com.itheilv.blog.model.User;
import com.itheilv.blog.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 管理 Controller
 *
 * @author WSQ
 * @since 2020-10-30
 */
@RestController
@Api(value = "User管理", tags = "管理")
@RequestMapping("/user")
public class UserController extends BaseController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /**
     * 分页列表
     *
     * @param page the page
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "列表--分页", response = User.class)
    @GetMapping(value = "/")
    public Object list(Page<User> page, User user) {
        Page<User> userPage = userService.queryByPageWithAutoWrapper(user, page);
        return BaseResult.successResultCreate(userPage);
    }

    /**
     * 查询
     *
     * @param userId the user
     * @return the user
     */
    @ApiOperation(value = "信息")
    @GetMapping(value = "/getUser")
    public Object getUser(String userId) {
        User user = userService.getById(userId);
        return BaseResult.successResultCreate(user);
    }

    /**
     * 新增
     *
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "新增信息", response = User.class)
    @PostMapping(value = "/")
    public Object create(@RequestBody User user) {
        return BaseResult.successResultCreate(userService.save(user));
    }

    /**
     * 删除
     *
     * @param userId the userId
     * @return the object
     */
    @ApiOperation(value = "删除信息")
    @DeleteMapping(value = "/delete")
    public Object delete(String userId) {
        int count = userService.remove(userId);
        return BaseResult.checkCountOneResult(count);
    }

    /**
     * 修改
     *
     * @param user the user
     * @return the object
     */
    @ApiOperation(value = "修改信息")
    @PutMapping(value = "/")
    public Object update(@RequestBody User user) {
        int count = userService.updateSelective(user);
        return BaseResult.checkCountOneResult(count);
    }

}
