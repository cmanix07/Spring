package com.cmani.springsecurity.student;

import com.cmani.springsecurity.entity.Student;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1, "Chintamani Prasad"),
            new Student(2, "Archana"),
            new Student(3, "Aadhaya"),
            new Student(4, "Ray"));

    @GetMapping
    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_TRAINEE')")
    public List<Student> getStudents(){
        System.out.println("Fetch students");
        return STUDENTS;
    }

    @PostMapping
    @PreAuthorize("hasAuthority('student:write')")
    public void registerStudent(@RequestBody Student student){
        System.out.println("Student registration");
    }

    @DeleteMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void deleteStudent(@PathVariable("studentId") Integer studentId){
        System.out.println("Student deleted "+studentId);
    }

    @PutMapping(path = "{studentId}")
    @PreAuthorize("hasAuthority('student:write')")
    public void updateStudent(@PathVariable("studentId") Integer studentId, @RequestBody Student student){
        System.out.println("Student updated" );
        System.out.println(String.format("%s, %s", studentId, student));

    }

}
