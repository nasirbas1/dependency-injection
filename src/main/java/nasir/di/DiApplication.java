package nasir.di;

import nasir.di.controllers.DiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiApplication.class, args);
        DiController controller = (DiController) ctx.getBean("diController");
        controller.hello();
    }

}
