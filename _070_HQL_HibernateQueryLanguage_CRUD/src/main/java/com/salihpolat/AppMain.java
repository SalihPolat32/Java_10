package com.salihpolat;

import com.salihpolat.dao_repository.StudentDao;
import com.salihpolat.model_entity.Student;

import java.util.List;

public class AppMain {

    public static void main(String[] args) {


        Student student1 = new Student("Aysu", "ÇAĞIŞLAR","aaa@gmail.com");
        Student student2 = new Student("Burak", "DELİCE", "bbb@gmail.com");
        Student student3 = new Student("Mehmet Caner", "ÖKSÜZ", "ccc@gmail.com");

        Student student4 = new Student();
        student4.setFirstName("Gizem");
        student4.setLastName("KUŞÇUOĞLU");
        student4.setEmail("ddd@gmail.com");

        StudentDao studentDao = new StudentDao();

        studentDao.saveStudent(student1);
        studentDao.saveStudent(student2);
        studentDao.saveStudent(student3);
        studentDao.saveStudent(student4);

//        studentDao.insertStudent();

        Student student5 = new Student();
        student5.setFirstName("Aminenur");
        student5.setLastName("GÖYNÜK");
        student5.setEmail("eee@gmail.com");
        student5.setId(2);

        System.out.println("=============================================");

        studentDao.updateStudent(student5);

        System.out.println("=============================================");

        studentDao.deleteStudent(3);

        System.out.println("=============================================");
        System.out.println("---------------------------------------------");

        Student student6 = studentDao.getStudent(5);
        System.out.println(student6.getFirstName());

        System.out.println("---------------------------------------------");
        System.out.println("=============================================");

        List<Student> students = studentDao.getStudents();
        students.forEach(s -> System.out.println(s.getFirstName() + " " + s.getLastName() + " " + s.getEmail()));
    }
}