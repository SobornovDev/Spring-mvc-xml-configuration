package ru.sobornov.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/

@Controller
public class FirstControllerClass {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";

    }
}
