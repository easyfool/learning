package com.wangfengbabe.learning.controller;

import com.wangfengbabe.learning.model.User;
import com.wangfengbabe.learning.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by wangfeng on 11/8/16.
 */
@Controller
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    @Autowired
    //@Qualifier  IUserService只有一个实现,因此不需要@Qualifier("")来指定是哪一个
    private IUserService userService;

    @RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
    @ResponseBody
    public String login(@RequestParam("username") String userName, @RequestParam("password") String password, Map<String, Object> map) {
        return "true";
    }

}
