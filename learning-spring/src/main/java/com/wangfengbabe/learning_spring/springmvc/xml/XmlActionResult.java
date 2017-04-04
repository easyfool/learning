package com.wangfengbabe.learning_spring.springmvc.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by wangfeng on 14/03/2017.
 */
@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.NONE)
public class XmlActionResult<T> extends BaseXmlResult {

  @XmlElements({
      @XmlElement(name = "Person", type = Person.class),
      @XmlElement(name = "Man", type = Man.class),
      @XmlElement(name = "Woman", type = Woman.class)
  })
  private T data;

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }


}
