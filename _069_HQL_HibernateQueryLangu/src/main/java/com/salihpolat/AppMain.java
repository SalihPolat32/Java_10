package com.salihpolat;

import com.salihpolat.model.Customer;
import com.salihpolat.model.CustomerDetail;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Date;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setTitle("MSc.Computer Engineer");
        customer.setFirstName("Burak");
        customer.setLastName("DELİCE");

        CustomerDetail customerDetail = new CustomerDetail();
        customerDetail.setAddress("Ankara");
        customerDetail.setPhone("555");
        customerDetail.setCreationDate(new Date());
        customerDetail.setCustomer(customer);
        customer.setCustomerDetail(customerDetail);

        Customer customer2 = new Customer("Dr.", "Engin", "ERTİKMEN");

        CustomerDetail customerDetail2 = new CustomerDetail("Adana", "555", new Date());
        customerDetail2.setCustomer(customer2);
        customer2.setCustomerDetail(customerDetail2);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = null;

        try {

            transaction = session.beginTransaction();

//            session.save(customer);
//            session.save(customer2);

            Query query = session.createQuery("FROM Customer");

            List<Customer> customerList = query.list();

            for (Customer cust : customerList) {
                System.out.println(cust.getTitle() + " " + cust.getFirstName() + " " + cust.getLastName());
            }

            System.out.println("=============================-WHERE ID-=============================");

            Query query2 = session.createQuery("FROM Customer WHERE id =: id");

            query2.setLong("id", 1);

            Customer cust2 = (Customer) query2.uniqueResult();

            System.out.println(cust2.getTitle() + " " + cust2.getFirstName() + " " + cust2.getLastName());

            System.out.println("=============================-UPDATE-=============================");

            query = session.createQuery("UPDATE Customer SET title =: title, firstName =: first_name, lastName =: last_name " +
                    "WHERE id =: id");

            query.setParameter("title", "Prof. Dr.");
            query.setParameter("first_name", "Gizem");
            query.setParameter("last_name", "KUŞÇUOĞLU");

            query.setLong("id", 1);

            int result = query.executeUpdate();

            System.out.println("Uptdate Sonucu: " + result);

            query = session.createQuery("FROM Customer");

            customerList = query.list();

            for (Customer cust : customerList) {
                System.out.println(cust.getTitle() + " " + cust.getFirstName() + " " + cust.getLastName());
            }

            System.out.println("=============================-DELETE-=============================");

            query = session.createQuery("DELETE FROM Customer WHERE id =: id");

            query.setLong("id", 1);

            int delete = query.executeUpdate();

            System.out.println("Delete Sonucu: " + delete);

            query = session.createQuery("FROM Customer");

            customerList = query.list();

            for (Customer cust : customerList) {
                System.out.println(cust.getTitle() + " " + cust.getFirstName() + " " + cust.getLastName());
            }

            transaction.commit();

        } catch (HibernateException e) {

            transaction.rollback();
            System.out.println("Hata: " + e);

        } finally {

            session.close();

        }
    }
}