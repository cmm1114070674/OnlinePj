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

import java.util.List;
import java.util.logging.Level;



@RestController
@EnableAutoConfiguration
@RequestMapping("/coursecell")
public class coursecellcontroller {
    @Autowired
    CoursecellService coursecellService;

    @GetMapping("getall")
    @ResponseBody
    List<CoursecellEntity> getall() {
        return coursecellService.getall();
    }

    @GetMapping("getcells")
    public @ResponseBody
    List<CoursecellEntity> getcells(@RequestParam(name = "unitid") int unitid) {
        return coursecellService.getcellsintUnitID(unitid);
    }
}
