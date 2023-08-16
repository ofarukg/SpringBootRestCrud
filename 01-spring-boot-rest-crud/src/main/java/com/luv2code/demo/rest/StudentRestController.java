package com.luv2code.demo.rest;


import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class StudentRestController {
    private List<Student> theStudent;

    //define @PostConstruct to load the student data... only once

    @PostConstruct
    public void loadData(){

        theStudent = new ArrayList<>();

        theStudent.add(new Student("Poornima", "Patel"));
        theStudent.add(new Student("Mario", "Rossi"));
        theStudent.add(new Student("Mary", "Smith"));


    }


    // define endpoint for "/students" - return a list of students

    @GetMapping("/student")
    public List<Student> getStudents(){

        return theStudent;
    }


    // define endpoint or "/student/{studentId}" - return student at index
    @GetMapping("/student/{studentId}")
    public  Student getStudent (@PathVariable int studentId){

        // just index into the list...
        // check the studentId against the list size

        if((studentId >= theStudent.size()) || (studentId <0)){
            throw new StudentNotFoundException("Student id not found - " + studentId);
        }

        return theStudent.get(studentId);
    }

    //Add an exception handler using @ExceptionHandler





}
