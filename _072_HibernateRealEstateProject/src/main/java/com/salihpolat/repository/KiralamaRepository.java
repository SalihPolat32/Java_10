package com.salihpolat.repository;

import com.salihpolat.model.Kiralama;
import com.salihpolat.model.Kisi;
import com.salihpolat.utility.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class KiralamaRepository {

    public void kiradakiEvler() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.createQuery("FROM Ev", Kisi.class).list();

        } catch (Exception e) {

            e.printStackTrace();
            // return null;

        }
    }

    public Kiralama kiralamaOlustur(Kiralama kiralama) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.save(kiralama);

            transaction.commit();

        } catch (Exception e) {

            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }
        return kiralama;
    }
}