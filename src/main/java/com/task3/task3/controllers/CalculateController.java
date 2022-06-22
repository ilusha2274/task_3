package com.task3.task3.controllers;

import com.task3.task3.Calculator;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

    @RequestMapping("/")
    public Calculator printCalculate(String variable1, String variable2, String operation, Model model) {
        int v1, v2;
        int res;
        try {
            v1 = Integer.valueOf(variable1);
            v2 = Integer.valueOf(variable2);
        } catch (NumberFormatException e) {
            model.addAttribute("result", "Числа введены некорректно!");
            return null;
        }
        Calculator calculator = new Calculator();
        try {
            calculator.count(v1,v2,operation);
        }catch (NullPointerException e){
            return null;
        }
        return calculator;
    }
}
