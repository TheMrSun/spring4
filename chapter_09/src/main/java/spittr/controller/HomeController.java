package spittr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import spittr.entity.Spitter;
import spittr.entity.SpitterForm;

import javax.servlet.http.Part;
import javax.validation.Valid;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * @author Slience
 * @version 1.0
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = GET)
    public String index() {
        return "home";
    }

}
