package com.javaguides.springapi.controller;

import com.javaguides.springapi.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {


    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Ramesh", "Fadatare");
    }

    //http://localhost:8080/students
    @GetMapping("/students")
    public List<Student> getListOfStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Джонни", "Кейдж"));
        students.add(new Student("Кенши", "Такахахахахаши"));
        students.add(new Student("Керри", "Евродилдо"));
        students.add(new Student("Ривер", "фамилия Хз"));
        students.add(new Student("Карлах", "МояЛюбовь"));

        return students;
    }

    // http://localhost:8080/student/Alya/Sark/
    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}/")
    public Student studentPathVariable(@PathVariable("firstName") String firstName,
                                       @PathVariable("lastName") String lastName) {
        return new Student(firstName, lastName);
    }


    //Build REST API to handle query parameters
    //http://localhost:8080/student/query?firstName=Alya&lastName=Sark
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName
    ) {
        return new Student(firstName, lastName);
    }



}
