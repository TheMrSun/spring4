package spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Slience
 * @version 1.0
 */
@Controller
public class HomeControoler {

    @RequestMapping(value = "/home")
    public String home(){
        return "home";
    }

}
