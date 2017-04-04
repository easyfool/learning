package com.wangfengbabe.learning_spring.springmvc.xml;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by wangfeng on 14/03/2017.
 */
@Controller
@RequestMapping("/mvc")
public class PersonController {

  @RequestMapping("/helloXmlPerson/{name}")
  @ResponseBody
  public XmlActionResult helloXmlPerson(@PathVariable("name") String name) {
    XmlActionResult<Person> actionResult = new XmlActionResult<Person>();
    actionResult.setCode("123");
    actionResult.setMessage(name);
    Person person = new Person("xxxxx", 1, 32);

    actionResult.setData(person);
    return actionResult;
  }
}
