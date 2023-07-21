package com.salihpolat.dao;

import com.salihpolat.model.Seller;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class SellerDAO {

    public void saveOrUpdateSeller(Seller seller) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(seller);

            transaction.commit();

        } catch (Exception ex) {

            if (transaction != null) {
                transaction.rollback();
            }

            ex.printStackTrace();

        }
    }

    public Seller getSellerById(Long id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Seller.class, id);

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public List<Seller> getAllSellers() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("FROM Seller", Seller.class).list();

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public void deleteSellerById(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Seller seller = session.get(Seller.class, id);

            if (seller != null) {
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