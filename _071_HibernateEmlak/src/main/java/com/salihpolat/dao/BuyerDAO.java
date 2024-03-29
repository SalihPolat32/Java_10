package com.salihpolat.dao;

import com.salihpolat.model.Buyer;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BuyerDAO {

    public void saveOrUpdateBuyer(Buyer buyer) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(buyer);

            transaction.commit();

        } catch (Exception ex) {

            if (transaction != null) {
                transaction.rollback();
            }

            ex.printStackTrace();

        }
    }

    public Buyer getBuyerById(Long id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Buyer.class, id);

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public List<Buyer> getAllBuyers() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("FROM Buyer", Buyer.class).list();

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public void deleteBuyerById(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Buyer buyer = session.get(Buyer.class, id);

            if (buyer != null) {
                session.delete(id);
            }

            transaction.commit();

        } catch (Exception ex) {

            if (transaction != null) {
                transaction.rollback();
            }

            ex.printStackTrace();

        }
    }
}