package com.matskevich.springcource.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/first") //если убрать то будет работать http://localhost:8080/goodbye http://localhost:8080/hello,
// а с этим нужно в адрес добавлять /first
public class FirstController {
    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        System.out.println("Hello " + name + " " + lastname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
