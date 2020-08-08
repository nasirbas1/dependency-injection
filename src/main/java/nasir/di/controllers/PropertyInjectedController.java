package nasir.di.controllers;

import nasir.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    // You can comment this out and use spring relection
    //  instead of the implementation name being the type , put it the name of variable
    //    public GreetingServiceImpl greetingService;
    //
    //    public String sayHello(){
    //        return greetingService.sayGreeting();
    //    }
    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
