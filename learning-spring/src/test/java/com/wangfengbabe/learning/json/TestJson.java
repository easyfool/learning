package com.wangfengbabe.learning.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wangfeng on 11/11/16.
 */


public class TestJson {
    private final static Logger LOGGER = LoggerFactory.getLogger(TestJson.class);

    public static void main(String[] args) {
        Person person = new Person();
        person.username = "wangfeng";
        person.age = 28;
        JSONObject jsonObject = JSONObject.fromObject(person);
        String jsonStr = jsonObject.toString();
        LOGGER.info(jsonStr);
        jsonObject = JSONObject.fromObject(jsonStr);
        Person p = (Person)JSONObject.toBean(jsonObject,Person.class);
        System.out.println(p);
        //使用ObjectMapper
        ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
