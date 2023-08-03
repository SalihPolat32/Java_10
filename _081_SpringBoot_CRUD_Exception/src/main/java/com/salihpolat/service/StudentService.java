package com.salihpolat.service;

import com.salihpolat.model.Student;
import com.salihpolat.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getOneStudent(long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateOneStudent(Student studentInfo) {
        return studentRepository.save(studentInfo);
    }

    public String deleteOneStudent(Long id) {
        studentRepository.deleteById(id);
        return "Silinen Öğrencinin id'si: " + id + " Silme Başarılı!";
    }
}