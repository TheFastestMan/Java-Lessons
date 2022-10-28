//package com.json.ex_01_json.enti.parser;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.json.ex_01_json.enti.Person;
//
//import java.io.File;
//import java.io.IOException;
//
//public class JacksonDataBind {
//
//
//    public static void parseJson(String path){
//        ObjectMapper objectMapper = new ObjectMapper();
//        Person person = null;
//        try {
//            person = objectMapper.readValue(new File(path), Person.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(person);
//        System.out.println(person.getLastName());
//
//    }
//}
