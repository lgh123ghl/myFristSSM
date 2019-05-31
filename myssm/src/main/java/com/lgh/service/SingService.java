package com.lgh.service;

import com.common.bean.PageBean;
import com.common.bean.Sign;

import java.util.List;

/**
 * @author  李光辉
 * @Date: 2019/5/10 14:50
 * @Description:
 */
public interface SingService {
    /**  签到列表（分页）
     * @param page
     * @param size
     * @return
     */
    PageBean<Sign> getSignList(Integer page,Integer size);
}
