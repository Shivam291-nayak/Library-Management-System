package com.library.dao;

import com.library.entity.IssueBook;
import jakarta.persistence.*;
import java.util.Date;
import com.library.config.HibernateUtil;
import com.library.entity.IssueBook;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Entity
@Table(name="issue_books")
public class IssueBookDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int userId;
    private int bookId;

    @Temporal(TemporalType.DATE)
    private Date issueDate;

    @Temporal(TemporalType.DATE)
    private Date returnDate;

    public int getId(){
        return id;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId=userId;
    }

    public int getBookId(){
        return bookId;
    }

    public void setBookId(int bookId){
        this.bookId=bookId;
    }

    public Date getIssueDate(){
        return issueDate;
    }

    public void setIssueDate(Date issueDate){
        this.issueDate=issueDate;
    }

    public Date getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate=returnDate;
    }

    public void issueBook(IssueBook issue) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(issue);

        tx.commit();
        session.close();
    }
}