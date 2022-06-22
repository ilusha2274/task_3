package com.task3.task3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class calculateController {

    @GetMapping("/")
    public String getCalculate(){
        return "index";
    }

    @PostMapping("/")
    public String printCalculate(String variable1, String variable2, String operation, Model model){
        int v1,v2;
        int res;
        try {
            v1 = Integer.valueOf(variable1);
            v2 = Integer.valueOf(variable2);
        }catch (NumberFormatException e){
            model.addAttribute("result", "Числа введены некорректно!");
            return "index";
        }
        switch (operation){
            case "+" -> res = v1 + v2;
            case "-" -> res = v1 - v2;
            case "*" -> res = v1 * v2;
            case "/" -> {if (v2 == 0){
                model.addAttribute("result", "На 0 делить нельзя!");
                return "index";
            }
                res = v1 / v2;}
            default -> {
                model.addAttribute("result", "'" + operation + "'" + " Такой операции нет!");
                return "index";
            }
        }
        model.addAttribute("result", res);
        return "index";
    }
}
