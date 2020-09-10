package com.cmani.springsecurity.student;

import com.cmani.springsecurity.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Chintamani Prasad"),
            new Student(2, "Archana"),
            new Student(3, "Aadhaya"),
            new Student(4, "Ray"));

    @GetMapping(path = "{studentId}")
    public Student getStudentById(@PathVariable("studentId") Integer studentId) {

        return STUDENTS.stream().filter(student -> studentId.equals(student.getId()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Student " + studentId + " does not exist."));
    }

}
