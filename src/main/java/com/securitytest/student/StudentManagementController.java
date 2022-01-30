package com.securitytest.student;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class StudentManagementController {

    private static final List<Student> students = Arrays.asList(
            new Student(1, "James Bond"),
            new Student(2, "Maria Jones"),
            new Student(3, "Anna Smith")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        System.out.println("Management getting list of students + management/api/v1/students");
        return students;
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println("Management registering new student + management/api/v1/students");
        System.out.println(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable Integer studentId) {
        System.out.println("Management deleting student + management/api/v1/students + deleted studentId: " + studentId);
        System.out.println(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable Integer studentId, @RequestBody Student student) {
        System.out.println("Management updating student with id: " + studentId + " and name: " + student.getStudentName());
        System.out.println(String.format("%s %s", studentId, student));
    }
}
