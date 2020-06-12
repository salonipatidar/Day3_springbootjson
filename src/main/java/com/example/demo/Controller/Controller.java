package com.example.demo.Controller;

import com.example.demo.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
        @RequestMapping("/")
        public String sayHello() {
            return "Hello World Developer!!!";
        }
        @RequestMapping("/student")
        public Student getStudent()
        {
            return new Student(101,22,"Saloni","indore");
        }
}
