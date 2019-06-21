package webpj.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import webpj.demo.ENTITY.CollectionEntity;
import webpj.demo.ENTITY.StudentEntity;
import webpj.demo.service.CollectionService;
import webpj.demo.service.StudentService;

import java.util.Collection;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/collection")
public class collectioncontroller {
    @Autowired
    CollectionService collectionService;

    @GetMapping("getbycourseid")
    @ResponseBody
    List<CollectionEntity> getbycourseid(@RequestParam(name = "courseid") int id) {
        return collectionService.getbycourseid(id);
    }

    @GetMapping("getbyUID")
    @ResponseBody
    List<CollectionEntity> getbyUID(@RequestParam(name = "UID") int id) {
        return collectionService.getbyUID(id);
    }

    @GetMapping("getbycourseidandUID")
    @ResponseBody
    CollectionEntity getbycourseidandUID(@RequestParam(name = "courseid") int id, @RequestParam(name = "UID") int id2) {
        return collectionService.getbycourseidanduid(id, id2);
    }
    @GetMapping("addfavo")
    @ResponseBody
    void addfavoclass (@RequestParam(name = "courseid") int id, @RequestParam(name = "UID") int id2) {
        collectionService.addfavocourse(id2,id);
    }
}
