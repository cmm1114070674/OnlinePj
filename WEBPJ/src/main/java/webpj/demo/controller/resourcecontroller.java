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
import webpj.demo.service.ResourceService;

import java.util.List;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Resource")
public class resourcecontroller {
    @Autowired
    ResourceService resourceService;
    @GetMapping("getresbyRid")
    @ResponseBody
    ResourceEntity getresbyid(@RequestParam(name = "RID")int id){
        return resourceService.getresbyid(id);
    }
    @GetMapping("getressbycourseid")
    @ResponseBody
    List<ResourceEntity> getressbycourseid(@RequestParam(name = "Courseid")int id){
        return resourceService.getressbycoureseid(id);
    }
}
