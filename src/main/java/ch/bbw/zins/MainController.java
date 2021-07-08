package ch.bbw.zins;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;

@Controller
public class MainController {
    private HashMap<String, String> savedValues = new HashMap<>();
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("calculate", new Calculate());
        return "zins";
    }
    @PostMapping("/calc")
    public String calc(@ModelAttribute Calculate calculate, Model model){
        int amort = calculate.getAmort();
        double rate = calculate.getRate();
        double zinsCost = calculate.getZinsCost();

        String result = "Amort: " + amort + "\n Rate: " + rate + "\n Zinsen Kosten: " + zinsCost;

        model.addAttribute("result", result);
        return "zins";

    }
}
