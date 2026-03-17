package com.library.main;

import com.library.config.HibernateUtil;

public class LibraryApp {

    public static void main(String[] args) {

        try{

            HibernateUtil.getSessionFactory();

            System.out.println("Hibernate Connection Successful");

        }catch(Exception e){

            System.out.println("Hibernate Connection Failed");
            e.printStackTrace();

        }

    }

}