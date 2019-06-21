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

import java.util.List;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Execution")
public class Executioncontroller {
    @Autowired
    ExecutionService executionService;

    @GetMapping("getbyHID")
    @ResponseBody
    List<ExecutionEntity> getbyHID(@RequestParam(name = "HID") int id) {
        return executionService.getexebyHID(id);
    }

    @GetMapping("getbyUID")
    @ResponseBody
    List<ExecutionEntity> getbyUID(@RequestParam(name = "UID") int id) {
        return executionService.getexebyUID(id);
    }

    @GetMapping("getbyHIDANDUID")
    @ResponseBody
    ExecutionEntity getbyHIDandUID(@RequestParam(name = "HID") int id, @RequestParam(name = "UID") int id2) {
        return executionService.getexebyHIDANDUID(id, id2);
    }
    @GetMapping("handhomework")
    @ResponseBody
    void handhomework(@RequestParam(name = "HID") int id, @RequestParam(name = "UID") int id2,@RequestParam(name = "SCORE") int score, @RequestParam(name = "DESCRI")String DESCRI){
        executionService.handhomework(id, id2, score, DESCRI);
    }
}
