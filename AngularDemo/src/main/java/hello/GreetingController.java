package hello;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;


// designate class as a rest controller
@RestController
// tells class to allow CORS requests from clients that don't originate from same server
@CrossOrigin
public class GreetingController {
    private static final String template = "Hello world, %s!";
    private final AtomicLong counter = new AtomicLong();

    // controller will use this to serve up response to any request received at endpoint below
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World" ) String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
