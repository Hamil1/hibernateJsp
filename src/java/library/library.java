package library;


import model.dao.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hamil
 */
public class library {
    
    public void openConectionHibernate(){
        SessionFactory sf = HibernateUtil.getSessionFactory();;
        Session sesion = sf.openSession();
        Transaction tx = sesion.beginTransaction();
    }
    
    
}
