package com.wangfengbabe.learning_spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangfeng on 23/02/2017.
 */
@Controller
public class WelcomeController {

  private final static Logger LOGGER = LoggerFactory.getLogger(WelcomeController.class);

  @RequestMapping(value = "/welcome", method = RequestMethod.GET)
  public String welcome(Model model) {
    LOGGER.debug("welcome() is executed,value{}", "wangfeng");
    LOGGER.error("this is error message", new Exception("testing"));
    model.addAttribute("msg", "hello spring mvc logback");
    return "welcome";
  }
}
