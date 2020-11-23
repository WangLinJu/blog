package com.itheilv.blog.base;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


/**
 * @author WSQ
 * @since 2020-09-27
 */
public class BaseServiceImpl<Mapper extends BaseMapper<Record>, Record extends BaseModel> extends ServiceImpl<Mapper, Record> implements BaseService<Record> {


}
