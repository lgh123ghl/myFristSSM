package com.lgh.service.impl;

import com.common.bean.PageBean;
import com.common.bean.Sign;
import com.common.bean.SignDTO;
import com.common.contants.InteractionConstants;
import com.common.util.DateUtil;
import com.lgh.dao.SingDao;
import com.lgh.service.SingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 14:50
 * @Description:
 */
@Service
public class SingServiceImpl implements SingService {

    private DateUtil dateUtil = new DateUtil();

    @Autowired
    private SingDao singDao;
    @Override
    public PageBean<SignDTO> getSignList(Integer page, Integer size) {
        PageBean<SignDTO> signPageBean = new PageBean<>();
        List<Sign> signList = singDao.getSignList((page-1)*size,size);
        List<SignDTO> signDTOList = new ArrayList<>();
        for (Sign sign:signList) {
            SignDTO signDTO = new SignDTO();
            signDTO.setUserId(sign.getUserId());
            signDTO.setAddress(sign.getAddress());
            signDTO.setLat(sign.getLat());
            signDTO.setLon(sign.getLon());
            signDTO.setSignType(sign.getSignType());
            signDTO.setSignTime(dateUtil.formatDateToString(sign.getSignTime(), InteractionConstants.FORMAT_YMD_HMS));
            signDTOList.add(signDTO);
        }
        signPageBean.setRows(signDTOList);
        signPageBean.setPage(page);
        signPageBean.setSize(size);
        signPageBean.setTotal(singDao.getSignListTotal());
        return signPageBean;
    }
}
