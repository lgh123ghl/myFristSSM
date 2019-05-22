package com.lgh.service;

import com.common.bean.PageBean;
import com.common.bean.Sign;

import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 14:50
 * @Description:
 */
public interface SingService {
    PageBean<Sign> getSignList(Integer page,Integer size);
}
