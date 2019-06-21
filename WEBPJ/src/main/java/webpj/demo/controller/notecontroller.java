package webpj.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import webpj.demo.ENTITY.CourseEntity;
import webpj.demo.ENTITY.NoteEntity;
import webpj.demo.service.CourseService;
import webpj.demo.service.NoteService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/note")

public class notecontroller {
    @Autowired
    NoteService noteService;

    @GetMapping("getbyuserid")
    public @ResponseBody
    List<NoteEntity> getbyuserid(@RequestParam(name = "UID") int UID) {
        return noteService.getnotebyuserid(UID);
    }

    @GetMapping("addnote")
    public @ResponseBody
    void addnotes(@RequestParam(name = "UID") int UID,@RequestParam(name = "COURSEID") int courseid,@RequestParam(name = "DESCRI")String description){
        noteService.addnote(UID, courseid, description);
    }
}
