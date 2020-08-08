package nasir.di.controllers;

import nasir.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class DiController {
    private GreetingService greetingService;

    public DiController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        return greetingService.sayGreeting();
    }
}
