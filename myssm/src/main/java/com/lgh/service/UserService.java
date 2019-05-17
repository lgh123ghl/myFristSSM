package com.lgh.service;

import com.common.bean.Dw15MinTjl;
import com.common.bean.User;

import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/16 14:03
 * @Description:
 */
public interface UserService {
    /**
     * 获取所有人员
     * @return
     */
    List<User> getUserList();

    /**
     * 修改人员
     * @param user
     * @return
     */
    User addUser(User user);

    /**
     * 批量修改人员
     * @param userList
     * @return
     */
    Boolean addUsers(List<User> userList);

    /**
     * 修改人员
     * @param user
     * @return
     */
    Boolean updateUser(User user);

    /**
     * 删除人员
     * @param user
     * @return
     */
    Boolean deleteUser(User user);

    List<Dw15MinTjl> getDw15MinTjl();
}
