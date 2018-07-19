package study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import study.controller.ClientController;

@SpringBootApplication
public class RestClientApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(RestClientApplication.class, args);

        ClientController clientController = (ClientController) ctx.getBean("clientController");
        clientController.printJson();
    }
}
