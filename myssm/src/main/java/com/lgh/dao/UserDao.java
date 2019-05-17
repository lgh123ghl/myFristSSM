package com.lgh.dao;

import com.common.bean.Dw15MinTjl;
import com.common.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/16 14:47
 * @Description:
 */
@Repository
public interface UserDao {
    List<User> selectUserList();
    List<Dw15MinTjl> selectDw15MinTjl();
}
