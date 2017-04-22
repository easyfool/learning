package com.wangfengbabe.learning_spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class BeanWithCollectionProperty {

  private List<Object> list;
  private Set<Object> set;
  private Map<Object, Object> map;
  private Properties properties;

  public List<Object> getList() {
    return list;
  }

  public void setList(List<Object> list) {
    this.list = list;
  }

  public Set<Object> getSet() {
    return set;
  }

  public void setSet(Set<Object> set) {
    this.set = set;
  }

  public Map<Object, Object> getMap() {
    return map;
  }

  public void setMap(Map<Object, Object> map) {
    this.map = map;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }
}
