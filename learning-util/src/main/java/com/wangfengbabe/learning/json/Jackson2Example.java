package com.wangfengbabe.learning.json;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by wangfeng on 07/03/2017.
 */
public class Jackson2Example {

  public static void main(String[] args) {
    Jackson2Example jackson2Example = new Jackson2Example();
    jackson2Example.run();
  }

  public void run() {
    ObjectMapper objectMapper = new ObjectMapper();
    Staff staff = createDummyObject();
    try {
      objectMapper.writeValue(new File("./staff.json"), staff);
      String jsonString = objectMapper.writeValueAsString(staff);
      System.out.println(jsonString);

      jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
      System.out.println(jsonString);

      //Map
      Map<String, Object> map = objectMapper.readValue(jsonString, new TypeReference<Map<String, Object>>() {
      });
      System.out.println(map.get("name"));

      Staff staff1 = objectMapper.readValue(jsonString, Staff.class);
      System.out.println(staff1);

      Staff staff2 = objectMapper.readValue(new File("./staff.json"), Staff.class);
      System.out.println(staff2);
      //List
      List<Staff> list = Arrays.asList(staff, staff1, staff2);
      jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
      System.out.println(jsonString);

      List<Staff> list1 = objectMapper.readValue(jsonString, new TypeReference<List<Staff>>() {
      });
      System.out.println(list1);


    } catch (JsonGenerationException e) {
      e.printStackTrace();
    } catch (JsonMappingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private Staff createDummyObject() {
    Staff staff = new Staff();
    staff.setName("wangfeng");
    staff.setAge(28);
    staff.setPosition("shandong");
    staff.setSalary(new BigDecimal(1000));
    List<String> skills = new ArrayList<String>();
    skills.add("java");
    skills.add("c");
    staff.setSkills(skills);
    return staff;

  }

}
