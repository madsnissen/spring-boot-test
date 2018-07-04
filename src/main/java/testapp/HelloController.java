package testapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/rest/greeting")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}