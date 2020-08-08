package nasir.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
// If there are many implementation of the service
// primary annotation makes it the default one
@Primary
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        System.out.println("Hell ya");
        return "foo";
    }
}
