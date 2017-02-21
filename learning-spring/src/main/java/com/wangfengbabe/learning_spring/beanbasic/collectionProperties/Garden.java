package com.wangfengbabe.learning_spring.beanbasic.collectionProperties;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by wangfeng on 20/02/2017.
 */
public class Garden {

  private List<Object> lists;
  private Set<Object> sets;
  private Map<Object, Object> maps;
  private Properties properties;

  public List<Object> getLists() {
    return lists;
  }

  public void setLists(List<Object> lists) {
    this.lists = lists;
  }

  public Set<Object> getSets() {
    return sets;
  }

  public void setSets(Set<Object> sets) {
    this.sets = sets;
  }

  public Map<Object, Object> getMaps() {
    return maps;
  }

  public void setMaps(Map<Object, Object> maps) {
    this.maps = maps;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }
}
