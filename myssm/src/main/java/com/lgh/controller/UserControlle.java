package com.lgh.controller;

import com.common.bean.Dw15MinTjl;
import com.common.bean.User;
import com.lgh.jedis.RedisCache;
import com.lgh.service.impl.UserServiceImpl;
import org.apache.ibatis.cache.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * @Auther: LGH
 * @Date: 2019/5/16 14:13
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserControlle {
    @Autowired
    private UserServiceImpl userService;


    @RequestMapping(value = "/getUserList", method = {RequestMethod.GET})
    @ResponseBody
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @RequestMapping(value = "/getDw15MinTjl", method = {RequestMethod.GET})
    @ResponseBody
    public List<Dw15MinTjl> getDw15MinTjl(){
        return userService.getDw15MinTjl();
    }


}
