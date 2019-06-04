package com.common.util;

import com.common.bean.PageBean;
import com.common.bean.Sign;
import java.util.ArrayList;
import java.util.List;


/** 分页工具（用代码实现list分页）
 * @author : LGH
 * @Date: 2019/5/31 09:14
 * @Description:
 */
public class PageUtil<T> {

    /**
     * 分页-返回PageBean，包括page,size,total,list<Bean>
     * @param ts
     * @param page
     * @param size
     * @return
     */
        PageBean<T> beanPage(List<T> ts, int page, int size) {
        List<T> tList = new ArrayList<>();
        PageBean<T> pageBean = new PageBean<>();
        int currIdx = (page > 1 ? (page - 1) * size : 0);
        for (int i = 0; i < size && i < ts.size() - currIdx; i++) {
            T t = ts.get(currIdx + i);
            tList.add(t);
        }
        pageBean.setPage(page);
        pageBean.setSize(size);
        pageBean.setTotal(ts.size());
        pageBean.setRows(tList);
        return pageBean;
    }

    /**
     * 分页-只返回list<Bean>
     * @param ts
     * @param page
     * @param size
     * @return
     */
        List<T> ListPage(List<T> ts, int page, int size) {
        List<T> tList = new ArrayList<>();
        int currIdx = (page > 1 ? (page - 1) * size : 0);
        for (int i = 0; i < size && i < ts.size() - currIdx; i++) {
            T t = ts.get(currIdx + i);
            tList.add(t);
        }
        return tList;
    }

    public static void main(String[] args) {
        PageUtil<Sign> tUtil = new PageUtil<>();
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

         PageBean<Sign> signPageBean = tUtil.beanPage(signList,1,3);
        for (Sign sign:signPageBean.getRows()) {
            System.out.println(sign.toString());
        }

/*        List<Sign> signList1 = tUtil.ListPage(signList,1,2);
        for (Sign sign:signList1) {
            System.out.println(sign.toString());
        }*/
    }
}
