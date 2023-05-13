package com.example.calculator.servece;

public class Service {

    public String showHello() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }

    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ошибка, отсутствует параметр";
        }
        if (num2 == 0) {
            return "ошибка, деление на ноль";
        }
            int result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }
    }
