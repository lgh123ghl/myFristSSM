package com.lgh.service.impl;

import com.common.bean.Dw15MinTjl;
import com.common.bean.User;
import com.lgh.dao.UserDao;
import com.lgh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/16 14:09
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.selectUserList();
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public Boolean addUsers(List<User> userList) {
        return null;
    }

    @Override
    public Boolean updateUser(User user) {
        return null;
    }

    @Override
    public Boolean deleteUser(User user) {
        return null;
    }

    @Override
    public List<Dw15MinTjl> getDw15MinTjl() {
        return userDao.selectDw15MinTjl();
    }
}
