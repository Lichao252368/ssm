package com.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author lichao
 * @description TODO
 * @date 2020/12/6 18:32
 * @params
 * @return
 **/
@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/getStudentList")
    public String getStudentList(){
        return "success";
    }
}
