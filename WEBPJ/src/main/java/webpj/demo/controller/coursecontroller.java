package webpj.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import webpj.demo.ENTITY.*;
import webpj.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/course")

public class coursecontroller {
    @Autowired
    CourseService courseService;

    @GetMapping("getall")
    List<CourseEntity> getallcourse() {
    return courseService.getALLclass();
    }
    @GetMapping("getonesclass")
    public @ResponseBody
    List<CourseEntity> getonesclass(@RequestParam(name="UID") int UID){
        return courseService.getonesallclass(UID);
    }
    @GetMapping("getcoursebyid")
    public @ResponseBody
    CourseEntity getcoursebyid(@RequestParam(name = "CourseID") int Cid){
        return courseService.getcoursebyCourseID(Cid);
    }
    @GetMapping("getbyhot")
    List<CourseEntity> getbyhot() {
        List<CourseEntity> courseEntities =  courseService.getALLclass();
        Collections.reverse(courseEntities);
        return courseEntities;
    }

}
