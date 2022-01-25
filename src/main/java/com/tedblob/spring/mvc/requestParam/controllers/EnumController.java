package com.tedblob.spring.mvc.requestParam.controllers;

import com.tedblob.spring.mvc.requestParam.enums.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnumController {

    @GetMapping(path = "/plotGraph")
    public String plotGraph(@RequestParam("direction") Direction direction) {
        System.out.println("Plot Graph : " + direction);
        return "Plot Graph : " + direction;
    }
}
