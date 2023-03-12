package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                    Student teo = new Student(
                            "Teo",
                            "teo@agu.io",
                            LocalDate.of(2000, DECEMBER, 3),
                            33);
                    Student andro = new Student(
                            "Andro",
                            "andro@gmail.com",
                            LocalDate.of(2010,APRIL,9),
                            13
                    );
        };
    }
}
