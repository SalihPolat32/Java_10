package com.salihpolat.dao;

import com.salihpolat.model.Property;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class PropertyDAO {

    public void saveOrUpdateProperty(Property property) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(property);

            transaction.commit();

        } catch (Exception ex) {

            if (transaction != null) {
                transaction.rollback();
            }

            ex.printStackTrace();

        }
    }

    public Property getPropertyById(Long id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Property.class, id);

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public List<Property> getAllProperties() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("FROM Property", Property.class).list();

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public void deletePropertyById(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Property property = session.get(Property.class, id);

            if (property != null) {
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