package no.frodo.moap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoapController {


    @GetMapping(value="/greeting")
    public String sayHello() {
        return "hello from moap docker\n";
    }

}
