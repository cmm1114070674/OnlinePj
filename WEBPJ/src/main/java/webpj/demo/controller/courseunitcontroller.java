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
import webpj.demo.service.CoursecellService;
import webpj.demo.service.CourseunitService;

import java.util.List;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/courseunit")
public class courseunitcontroller {
    @Autowired
    CourseunitService courseunitService;

    @GetMapping("getbycourseid")
    @ResponseBody
    List<CourseunitEntity> getbycourseid(@RequestParam(name = "courseid") int id) {
        return courseunitService.getunitbycourseID(id);
    }

    @GetMapping("getonebyunit")
    @ResponseBody
    CourseunitEntity getonebyunit(@RequestParam(name = "unitid") int id) {
        return courseunitService.getbyUnitid(id);
    }
}
