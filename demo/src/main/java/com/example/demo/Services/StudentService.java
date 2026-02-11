package com.example.demo.service;

import com.example.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Ritesh", "Java"));
        students.add(new Student(2, "Amit", "Spring Boot"));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public Student addStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public String deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
        return "Student Deleted Successfully";
    }
}

