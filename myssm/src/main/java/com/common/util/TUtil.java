package com.common.util;

import com.common.bean.PageBean;
import com.common.bean.Sign;
import org.apache.poi.ss.formula.functions.T;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/31 09:14
 * @Description:
 */
public class TUtil<T> {
        PageBean<org.apache.poi.ss.formula.functions.T> beanPage(List<org.apache.poi.ss.formula.functions.T> ts, int page, int size) {
        List<org.apache.poi.ss.formula.functions.T> tList = new ArrayList<>();
        PageBean<org.apache.poi.ss.formula.functions.T> pageBean = new PageBean<>();
        int currIdx = (page > 1 ? (page - 1) * size : 0);
        for (int i = 0; i < size && i < ts.size() - currIdx; i++) {
            org.apache.poi.ss.formula.functions.T t = ts.get(currIdx + i);
            tList.add(t);
        }
        pageBean.setPage(page);
        pageBean.setSize(size);
        pageBean.setTotal(ts.size());
        pageBean.setRows(tList);
        return pageBean;
    }

    public static void main(String[] args) {
        TUtil<Sign> tUtil = new TUtil<>();
        List<Sign> signList = new ArrayList<Sign>();
        Sign sign1 = new Sign();
        sign1.setId(1L);
        sign1.setAddress("云南");
        signList.add(sign1);

        Sign sign2 = new Sign();
        sign2.setId(2L);
        sign2.setAddress("湖北");
        signList.add(sign2);

        Sign sign3 = new Sign();
        sign3.setId(3L);
        sign3.setAddress("杭州");
        signList.add(sign3);

        Sign sign4 = new Sign();
        sign4.setId(4L);
        sign4.setAddress("北京");
        signList.add(sign4);

       // PageBean<Sign> signPageBean = tUtil.beanPage(signList,1,2);
    }
}
