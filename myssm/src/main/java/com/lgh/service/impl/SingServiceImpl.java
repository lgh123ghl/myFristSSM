package com.lgh.service.impl;

import com.common.bean.PageBean;
import com.common.bean.Sign;
import com.lgh.dao.SingDao;
import com.lgh.service.SingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 14:50
 * @Description:
 */
@Service
public class SingServiceImpl implements SingService {

    @Autowired
    private SingDao singDao;
    @Override
    public PageBean<Sign> getSignList(Integer page, Integer size) {
        PageBean<Sign> signPageBean = new PageBean<Sign>();
        List<Sign> signList = singDao.getSignList((page-1)*size,size);
        signPageBean.setRows(signList);
        signPageBean.setPage(page);
        signPageBean.setSize(size);
        signPageBean.setTotal(singDao.getSignListTotal());
        return signPageBean;
    }
}
