package com.salihpolat.controller;

import com.salihpolat.exception.ResourceNotFoundException;
import com.salihpolat.model.Student;
import com.salihpolat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*")

// http://localhost:8080/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    // http://localhost:8080/api/v1

    @GetMapping
    public String getSelamlama() {
        return "Hoşgeldiniz";
    }


    // http://localhost:8080/api/v1/hello?studentFirstName=ISIM_BILGISI&studentLastName=SOYISIM_BILGISI

    @GetMapping("/hello")
    public String getHello(@RequestParam(value = "studentFirstName", defaultValue = "Dünya") String studentFirstName,
                           @RequestParam(value = "studentLastName") String studentLastName) {
        return "Merhaba " + studentFirstName + " " + studentLastName;
    }

    // http://localhost:8080/api/v1/students

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


    // http://localhost:8080/api/v1/students/1

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getOneStudent(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {

        return studentService.getOneStudent(id);
    }

    // POST - http://localhost:8080/api/v1/students

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // UPDATE - http://localhost:8080/api/v1/students

    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateOneStudent(@PathVariable(value = "id") Long id,
                                                    @RequestBody Student student) throws ResourceNotFoundException {
        Student studentInfo = studentService.getOneStudent(id).getBody();

        if (studentInfo != null) {
            studentInfo.setId(id);
            studentInfo.setFirstName(student.getFirstName());
            studentInfo.setLastName(student.getLastName());
            studentInfo.setEmail(student.getEmail());
            return studentService.updateOneStudent(studentInfo);
        }

        return null;
    }

    // DELETE - http://localhost:8080/api/v1/students

    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteOneStudent(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        return studentService.deleteOneStudent(id);
    }

}