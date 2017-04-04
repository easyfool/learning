package com.wangfengbabe.learning_spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangfeng on 23/02/2017.
 */
@Controller
public class HelloController {

  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String printWelcome(ModelMap modelMap) {
    modelMap.addAttribute("message", "Spring MVC hello world");
    return "hello";

  }
}
