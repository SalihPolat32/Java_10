package com.salihpolat.dao_repository;

import com.salihpolat.model_entity.Student;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDao {

    // CREAT - INSERT
    public void saveStudent(Student student) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();

        } catch (Exception e) {

            System.out.println("Hata: "+ e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    // READ ALL - SELECT
    public List<Student> getStudents() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Student", Student.class).list();
        }
    }
}