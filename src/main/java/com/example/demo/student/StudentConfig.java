package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository
    ){
        return args -> {
           Student yahya = new Student(
                   "Yahya",
                   "yehya@gmail.com",
                   LocalDate.of(2000, Month.JANUARY, 25)
           );

            Student ali = new Student(
                    "ali",
                    "ali@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 25)
            );

            studentRepository.saveAll(
                    List.of(yahya, ali)
            );
        };
    }
}
