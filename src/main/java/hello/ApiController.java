package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private SpecialGreetingEntityProcessor processor = new SpecialGreetingEntityProcessor();

    @RequestMapping("/api/greeting")
    public GreetingEntity greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new GreetingEntity(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/api/hello")
    public GreetingEntity helloThere() {
        return processor.getSpecialGreetingEntity();
    }

}