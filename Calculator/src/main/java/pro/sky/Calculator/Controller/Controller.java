package pro.sky.Calculator.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Calculator.Service.Service;

import java.util.Scanner;

@RestController
@RequestMapping(path = "/calculator")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;

    }

    @GetMapping
    String helloCalc() {
        return "Добро пожаловать в <b>калькулятор!</b>";
    }

    @GetMapping(path = "plus")
    public String plus(@RequestParam("num1") float num1, @RequestParam float num2) {
        return service.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return service.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam("num1") float num1, @RequestParam("num2") float num2) {
        return service.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam float num1, @RequestParam float num2) {
        return service.divide(num1,num2);
    }
}
