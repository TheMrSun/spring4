package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author Slience
 * @version 1.0
 */
@Controller
@RequestMapping(value ="/")
public class HomeController {

    @RequestMapping(method = GET)
    public String home() {
        return "home";
    }
}
