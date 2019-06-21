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
import webpj.demo.service.UsersService;

import java.util.List;
import java.util.logging.Level;

@RestController
@EnableAutoConfiguration
@RequestMapping("/Users")
public class userscontroller {
    @Autowired
    UsersService usersService;

    @GetMapping("getall")
    List<UsersEntity> getall() {
        return usersService.getALL();
    }

    @GetMapping("getbyUID")
    @ResponseBody
    UsersEntity getbyHID(@RequestParam(name = "UID") int id) {

        return usersService.getonebyUID(id);
    }
    @GetMapping("adduser")
    @ResponseBody
    boolean addusers(@RequestParam(name = "UID") int id,@RequestParam(name = "USERNAME")String username,@RequestParam(name = "PASS")String Pass){
        return usersService.addUsers(id,username,Pass);
    }

}
