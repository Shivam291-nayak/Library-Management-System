package com.library.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name="issue_books")
public class IssueBook {

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
        this.userId = userId;
    }

    public int getBookId(){
        return bookId;
    }

    public void setBookId(int bookId){
        this.bookId = bookId;
    }

    public Date getIssueDate(){
        return issueDate;
    }

    public void setIssueDate(Date issueDate){
        this.issueDate = issueDate;
    }

    public Date getReturnDate(){
        return returnDate;
    }

    public void setReturnDate(Date returnDate){
        this.returnDate = returnDate;
    }

}