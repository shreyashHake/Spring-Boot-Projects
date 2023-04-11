package com.hithachi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
// spring web mvc : contains a bunch of annotations
@RestController

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }

    // to make rest endpoint that clients can call
    @GetMapping("/greet") // '/' is root
    public GreetResponse greet() {
        GreetResponse response =
                new GreetResponse(
                        "Hello",
                        List.of("Java", "Python", "Go", "Golang", "Javascript"),
                        new Person("Shreyash", 21,50_000)
                );

        return response;
    }

    record GreetResponse(
            String greet,
            List<String> favProgramingLanguages,
            Person person
    ) {
    } // helps to achieve immutability

    record Person(String name, int age, double savings) {
    }
}
