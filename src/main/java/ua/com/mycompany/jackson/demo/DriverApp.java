package ua.com.mycompany.jackson.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;

public class DriverApp {
    public static void main(String[] args) {
        try{

            //read sample-lite.json
            ObjectMapper objectMapper1 = new ObjectMapper();
            Student student1 = objectMapper1.readValue(new File("data/sample-lite.json"), Student.class);
            System.out.println(student1.toString());

            //read sample-full.json
            ObjectMapper objectMapper = new ObjectMapper();
            Student student = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
            System.out.println(student.toString());


            //how to write POJO -> JSON
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            objectMapper.writeValue(new File("output.json"), student);

        } catch (Exception e)   {
            e.printStackTrace();
        }





    }
}
