package com.salihpolat;

import com.salihpolat.model.Customer;
import com.salihpolat.model.Orders;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class AppMain {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setTitle("Dr.");
        customer.setFirstName("Mehmet Caner");
        customer.setLastName("ÖKSÜZ");

        Orders order1 = new Orders("Kayısı", 254.223423F, new Date());
        Orders order2 = new Orders("Elma", 173.53234F, new Date());
        Orders order3 = new Orders("Armut", 395.23234F, new Date());

        customer.getOrders().add(order1);
        customer.getOrders().add(order2);
        customer.getOrders().add(order3);

        order1.setCustomer(customer);
        order2.setCustomer(customer);
        order3.setCustomer(customer);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

            session.save(customer);
            session.save(order1);
            session.save(order2);
            session.save(order3);

            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();

            System.err.println("Hata: " + e);

        } finally {

            session.close();

        }
    }
}