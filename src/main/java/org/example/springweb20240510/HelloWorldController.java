package org.example.springweb20240510;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() {
        return
                "Hello, World! blaaaalalal";
    }

    @GetMapping("/hello/{name1}")
    public String sayHelloJohn(@PathVariable String name1) {
        return
                "Hello, " + name1 + "!";
    }



}
