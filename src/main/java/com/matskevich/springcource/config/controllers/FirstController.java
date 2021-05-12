package com.matskevich.springcource.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first") //если убрать то будет работать http://localhost:8080/goodbye http://localhost:8080/hello,
// а с этим нужно в адрес добавлять /first
public class FirstController {
    /*@GetMapping("/hello")
    public String helloPage(@RequestParam("name") String name,
                            @RequestParam("lastname") String lastname) {*/
    //если написать так, то при вводе url без параметров будет ошибка
    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            @RequestParam(value = "lastname", required = false) String lastname) {
        // когда написали value и required=false,то url можно не передавать параметры, ошибки не будет, параметры будут null
        System.out.println("Hello " + name + " " + lastname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
