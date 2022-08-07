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

    @RequestMapping(value = "/home", method = GET)
    public String home(Model model) {
        if(!model.containsAttribute("registerForm")){
            System.out.println("不包含");
        } else{
            Map<String, Object> stringObjectMap = model.asMap();
            SpitterForm registerForm = (SpitterForm)stringObjectMap.get("registerForm");
            System.out.println(registerForm.toString());
        }

        return "home";
    }

    @RequestMapping(value = "/register", method = GET)
    public String register(Model model) {
        model.addAttribute("spitterForm",new SpitterForm());
        return "registerForm";
    }


    @RequestMapping(value = "/register", method = POST)
    public String processRegistration(@Valid SpitterForm spitterForm, Errors errors
            ,RedirectAttributes redirect) throws IllegalStateException, IOException {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        Spitter spitter = spitterForm.toSpitter();
        System.out.println(spitter);
        MultipartFile profilePicture = spitterForm.getProfilePicture();
        profilePicture.transferTo(new File("D:/test/" + spitter.getUsername() + ".jpg"));
        redirect.addFlashAttribute("registerForm",spitterForm);
        //重定向带参 对象可以放在flash(spring属性)
        return "redirect:/home";
    }


}
