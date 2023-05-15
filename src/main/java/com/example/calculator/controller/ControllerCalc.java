package com.example.calculator.controller;

import com.example.calculator.servece.ServiceCalc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalc {
    private final ServiceCalc serviceCalc;

    public ControllerCalc(ServiceCalc serviceCalc) {
        this.serviceCalc = serviceCalc;
    }

    @GetMapping
    public String showHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = serviceCalc.plus(num1, num2);
        return messageToUser(num1, '+', num2, result);
    }

    @GetMapping("/minus")
    public String minus(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = serviceCalc.minus(num1, num2);
        return messageToUser(num1, '-', num2, result);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = serviceCalc.multiply(num1, num2);
        return messageToUser(num1, '*', num2, result);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        if (num2 == 0) {
            return "ошибка, деление на ноль";
        }
        int result = serviceCalc.divide(num1, num2);
        return messageToUser(num1, '/', num2, result);
    }

    private String messageToUser(Integer num1, char action, Integer num2, int result) {
        return String.format("%d %c %d = %d", num1, action, num2, result);
    }
}
