package org.example.springproject;

import org.example.springproject.Entities.Student;
import org.example.springproject.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {

        Student student1 = new Student("Maxim", "Kuriavskiy","m@gmail.com");
        studentRepository.save(student1);
    }
}
