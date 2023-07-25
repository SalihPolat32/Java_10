package com.salihpolat.repository;

import com.salihpolat.model.Kisi;
import com.salihpolat.utility.HibernateUtil;
import org.hibernate.Session;

public class KiralamaRepository {

    public void kiradakiEvler() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("from Ev ", Kisi.class).list();

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        }
    }
}