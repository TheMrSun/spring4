package spittr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import spittr.data.SpitterRepository;
import spittr.data.SpittleRepository;
import spittr.model.Spitter;

import javax.validation.Valid;

/**
 * @author Slience
 * @version 1.0
 */
@RequestMapping("/spitter")
@Controller
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }


    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String showRegistrationForm(Model model) {
        model.addAttribute(new Spitter());
        return "registerForm";
    }

    @RequestMapping(value="/register2", method= RequestMethod.GET)
    public String showRegistrationForm2(Model model) {
        //model.addAttribute("spitter", new Spitter(24L, "jbauer", "24hours", "Jack", "Bauer", "jbauer@ctu.gov"));
        model.addAttribute("spitter", new Spitter());

        return "registerForm2";
    }



    /**
     * //@Valid 进行校验的标志,Errors 校验出错的信息
     * @param spitter
     * @param errors
     * @return
     */

    @RequestMapping(value="/register", method= RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value="/register2", method= RequestMethod.POST)
    public String processRegistration2(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "registerForm2";
        }
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }


    @RequestMapping(value="/{username}", method= RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }

}
