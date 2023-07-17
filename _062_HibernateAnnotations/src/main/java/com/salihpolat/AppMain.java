package com.salihpolat;

import com.salihpolat.model.Customer;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("Burak");
        customer.setLastName("DELİCE");
        customer.setAddress("Ankara");
        customer.setCreationDate(new Date());

        Customer customer2 = new Customer("Engin", "ERTİKMEN", "Adana", new Date());

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();
                session.save(customer);
                session.save(customer2);
                // session.update(customer);
                // session.delete(customer);
            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            System.err.println("Hata: " + e);

        } finally {

            session.close();

        }
    }
}