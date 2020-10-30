package com.itheilv.blog.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.itheilv.blog.base.BaseModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author WSQ
 * @since 2020-10-30
 */

@TableName("user")
@ApiModel(value = "User对象", description = "")
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;
    @TableField("nickname")
    @ApiModelProperty(value = "")
    protected String nickname;
    @TableField("password")
    @ApiModelProperty(value = "")
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