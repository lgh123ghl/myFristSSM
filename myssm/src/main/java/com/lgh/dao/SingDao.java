package com.lgh.dao;

import com.common.bean.Sign;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 15:05
 * @Description:
 */
@Repository
public interface SingDao {

    /**
     *  获取签到列表(含分页功能)
     * @param page
     * @param size
     * @return
     */
    List<Sign> getSignList(@Param("page") Integer page, @Param("size") Integer size);

    /**  配合分页接口，返回数据总条数
     * @return
     */
    Integer getSignListTotal();
}
