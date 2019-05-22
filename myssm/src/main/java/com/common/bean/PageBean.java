package com.common.bean;

import org.apache.poi.ss.formula.functions.T;

import java.io.Serializable;
import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/22 10:45
 * @Description:
 */
public class PageBean<T> implements Serializable {
    private static final long serialVersionUID = 8074807368854150053L;
    /**
     * page
     */
    private Integer page;
    /**
     * size
     */
    private Integer size;
    /**
     * 数据
     */
    private List<T> rows;
    /**
     * 数据总条条数
     */
    private Integer total;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
