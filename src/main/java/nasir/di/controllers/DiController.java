package nasir.di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class DiController {
    public String hello(){
        System.out.println("Hello");
        return "foo";
    }
}
