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
import webpj.demo.service.ExecutionService;
import webpj.demo.service.HomeworkService;

import java.util.List;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/homework")

public class homeworkcontroller {
    @Autowired
    HomeworkService homeworkService;

    @GetMapping("getcoursehomework")
    @ResponseBody
    List<HomeworkEntity> getcoursehomework(@RequestParam(name = "Course") int id) {
        return homeworkService.getcoursehomework(id);
    }

    @GetMapping("getBYHID")
    @ResponseBody
    HomeworkEntity getBYHID(@RequestParam(name = "HID") int id) {
        return homeworkService.gethomeworkbyHID(id);
    }
}
