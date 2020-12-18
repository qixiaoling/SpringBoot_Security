package com.example.Security.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Ana Smith"),
            new Student(3, "Jones Bond")
    );



    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable ("studentId") Integer studentId){
        return STUDENTS.stream().filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(()-> new IllegalStateException("Student"+studentId+"does not exists"));

    }

}
