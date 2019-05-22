package com.lgh.controller;

import com.common.bean.PageBean;
import com.common.bean.Sign;
import com.lgh.service.impl.SingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: 李光辉
 * @Date: 2019/5/10 14:49
 * @Description:
 */
@RequestMapping("/sing")
@Controller
public class SingController {
    @Autowired
    private SingServiceImpl singService;

    @RequestMapping(value = "/getSignList", method = {RequestMethod.POST})
    @ResponseBody
    public PageBean<Sign> getSignList(@RequestParam(value = "page",required = false,defaultValue = "-1") Integer page, @RequestParam(value = "size",required = false,defaultValue = "-1") Integer size){
        return singService.getSignList(page,size);
    }
}
