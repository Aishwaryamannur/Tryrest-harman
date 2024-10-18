import org.springframework.web.bind.annotation.*;


@RestController
public class ApiController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello,World!";
    }



    @GetMapping("/hello/{Name}")
    public String greetUser(@PathVariable String name) {
        return "Hello," + name + "!";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String messege) {
        return "You said : " + messege;

    }



}

