package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * @author Slience
 * @version 1.0
 */
@Controller
@RequestMapping(value = "/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";
    private SpittleRepository spittleRepository;

    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method = GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam(value = "count", defaultValue = "20") int count, Model model) {
        List<Spittle> spittles = spittleRepository.findSpittles(max, count);
        model.addAttribute("spittleList",spittles);
        return spittles;
    }
}