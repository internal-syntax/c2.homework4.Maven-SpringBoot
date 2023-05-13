package com.example.calculator.controller;

import com.example.calculator.servece.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class Controller {
    private Service service = new Service();

    @GetMapping()
    public String showHello() {
        return service.showHello();
    }

    @GetMapping("/plus")
    public String plus(@RequestParam int num1, int num2) {
            return service.plus(num1, num2);
        }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, int num2) {
        return service.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, int num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam int num1, int num2) {
        return service.divide(num1, num2);
    }
}
