package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/calc/sum/{op1}/{op2}")
    @ResponseBody
    public String sum(@PathVariable String op1, @PathVariable String op2) {
        int op1Number, op2Number;
        try {
            op1Number = Integer.parseInt(op1);
            op2Number = Integer.parseInt(op2);
        } catch (Exception e) {
            return "invalid number";
        }
        int sumNumber = op1Number + op2Number;
        return op1 + " + " + op2 + " = " + sumNumber;
    }

    @GetMapping("/calc/div/{op1}/{op2}")
    @ResponseBody
    public String div(@PathVariable String op1, @PathVariable String op2) {
        int op1Number, op2Number;
        try {
            op1Number = Integer.parseInt(op1);
            op2Number = Integer.parseInt(op2);
        } catch (Exception e) {
            return "invalid number";
        }
        int divNumber = op1Number / op2Number;
        return op1 + " / " + op2 + " = " + divNumber;
    }

    @GetMapping("/calc/mult/{op1}/{op2}")
    @ResponseBody
    public String mult(@PathVariable String op1, @PathVariable String op2) {
        int op1Number, op2Number;
        try {
            op1Number = Integer.parseInt(op1);
            op2Number = Integer.parseInt(op2);
        } catch (Exception e) {
            return "invalid number";
        }
        int multNumber = op1Number * op2Number;
        return op1 + " * " + op2 + " = " + multNumber;
    }

    @GetMapping("/calc/subtract/{op1}/{op2}")
    @ResponseBody
    public String subtract(@PathVariable String op1, @PathVariable String op2) {
        int op1Number, op2Number;
        try {
            op1Number = Integer.parseInt(op1);
            op2Number = Integer.parseInt(op2);
        } catch (Exception e) {
            return "invalid number";
        }
        int subtractNumber = op1Number - op2Number;
        return op1 + " - " + op2 + " = " + subtractNumber;
    }
}
