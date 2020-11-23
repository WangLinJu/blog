package com.itheilv.blog.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.itheilv.blog.base.BaseModel;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户表
 *
 * @author WSQ
 * @since 2020-11-23
 */
@TableName("user")
@ApiModel(value = "User对象", description = "用户表")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 昵称
     */
    @TableField("nickname")
    @ApiModelProperty(value = "昵称")
    protected String nickname;

    /**
     * 密码
     */
    @TableField("password")
    @ApiModelProperty(value = "密码")
    protected String password;

    public User() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                ", nickname=" + nickname +
                ", password=" + password +
                "}";
    }
}