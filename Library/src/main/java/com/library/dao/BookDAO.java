package com.library.dao;

import com.library.config.HibernateUtil;
import com.library.entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class BookDAO {

    public void addBook(Book book){

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(book);

        tx.commit();
        session.close();

    }

    public List<Book> getAllBooks(){

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Book> books = session.createQuery("from Book", Book.class).list();

        session.close();

        return books;

    }

}