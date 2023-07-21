package com.salihpolat.dao;

import com.salihpolat.model.Agent;
import com.salihpolat.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AgentDAO {

    public void saveOrUpdateAgent(Agent agent) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            session.saveOrUpdate(agent);

            transaction.commit();

        } catch (Exception ex) {

            if (transaction != null) {
                transaction.rollback();
            }

            ex.printStackTrace();

        }
    }

//    public void saveAgent () {}
//
//    public void UpdateAgent () {}

    public Agent getAgentById(Long id) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.get(Agent.class, id);

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public List<Agent> getAllAgents() {

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            return session.createQuery("FROM Agent", Agent.class).list();

        } catch (Exception ex) {

            ex.printStackTrace();

            return null;

        }
    }

    public void deleteAgentById(int id) {

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            // Önce Verilen id Üzerinden Kaydı Bul
            Agent agent = session.get(Agent.class, id);

            if (agent != null) {
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