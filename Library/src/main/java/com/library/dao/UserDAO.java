package com.library.dao;

import com.library.config.HibernateUtil;
import com.library.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDAO {

    public User login(String username,String password){

        Session session = HibernateUtil.getSessionFactory().openSession();

        Query<User> query=session.createQuery(
                "from User where username=:u and password=:p", User.class);

        query.setParameter("u",username);
        query.setParameter("p",password);

        User user=query.uniqueResult();

        session.close();

        return user;
    }

    public void saveUser(User user){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(user);

        tx.commit();
        session.close();

    }

}