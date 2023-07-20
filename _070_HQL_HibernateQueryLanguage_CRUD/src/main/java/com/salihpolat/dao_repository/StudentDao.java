package com.salihpolat.dao_repository;

import com.salihpolat.model_entity.Student;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao {

    // SAVE - INSERT
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

    public void insertStudent() {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "INSERT INTO Student (email, firstName, lastName) SELECT firstName, lastName, email FROM Student";

            Query query = session.createQuery(hql);

            // FIXME Insert Sorgusunu Paremetreli Sorguya Çevir Paremetreleri Buraya Yaz

            int result = query.executeUpdate();

            System.out.println("Insert Sonuç: " + result);

            transaction.commit();

        } catch (Exception e) {

            System.out.println("Hata: "+ e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    public void updateStudent(Student student) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "UPDATE Student SET firstName =: first_name, lastName =: last_name, email =: email WHERE id =: id";

            Query query = session.createQuery(hql);

            query.setParameter("first_name", student.getFirstName());
            query.setParameter("last_name", student.getLastName());
            query.setParameter("email", student.getEmail());
            query.setParameter("id", student.getId());

            int result = query.executeUpdate();

            System.out.println("Update Sonuç: " + result);

            transaction.commit();

        } catch (Exception e) {

            System.out.println("Hata: "+ e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    public void deleteStudent(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "DELETE FROM Student WHERE id =: id";

            Query query = session.createQuery(hql);

            query.setParameter("id", id);

            int result = query.executeUpdate();

            System.out.println("Delete Sonuç: " + result);

            transaction.commit();

        } catch (Exception e) {

            System.out.println("Hata: "+ e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }

    public Student getStudent(int id) {

        Student student = null;
        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            String hql = "FROM Student WHERE id =: id";

            Query query = session.createQuery(hql);

            query.setParameter("id", id);

            // FIXME Tekil Sonuç Dönüşü Yap
            List results = query.getResultList();

            if ((results != null) && (!results.isEmpty())) {
                student = (Student) results.get(0);
            }

            transaction.commit();

        } catch (Exception e) {

            System.out.println("Hata: "+ e);
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return student;
    }

    // READ ALL - SELECT
    public List<Student> getStudents() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("FROM Student", Student.class).list();
        }
    }
}