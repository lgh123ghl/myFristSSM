package com.lgh.dao;

import com.common.bean.Sign;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 15:05
 * @Description:
 */
@Repository
public interface SingDao {
    List<Sign> getSignList();
}
