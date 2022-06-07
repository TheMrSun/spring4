package com.tsl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Slience
 * @version 1.0
 */

@Controller
public class ViewController {

    @RequestMapping(value ={"/show"})
    public String show(){
        return "show";
    }

}
