package webpj.demo.controller;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import webpj.demo.ENTITY.*;

import webpj.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import webpj.demo.service.StudentService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class studentcontroller {
    @Autowired
    StudentService studentService;

    @GetMapping("getbycourseid")
    @ResponseBody
    List<StudentEntity> getbycourseid(@RequestParam(name = "courseid") int id) {
        return studentService.getbycourseid(id);
    }

    @GetMapping("getbyUID")
    @ResponseBody
    List<StudentEntity> getbyUID(@RequestParam(name = "UID") int id) {
        return studentService.getbyUID(id);
    }

    @GetMapping("getbycourseidandUID")
    @ResponseBody
    StudentEntity getbycourseidandUID(@RequestParam(name = "courseid") int id, @RequestParam(name = "UID") int id2) {
        return studentService.getbycourseidanduid(id, id2);
    }
    @GetMapping("selectcourse")
    @ResponseBody
    void selectcourse(@RequestParam(name = "courseid") int id, @RequestParam(name = "UID") int id2){
        studentService.selectcourse(id2, id);
    }
}
