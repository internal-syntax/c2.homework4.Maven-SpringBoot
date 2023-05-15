package com.example.calculator.servece;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalc {

    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public int divide(Integer num1, Integer num2) {
        return num1 / num2;
    }
}
