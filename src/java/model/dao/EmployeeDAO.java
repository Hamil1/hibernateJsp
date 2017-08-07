/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.Iterator;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Query;
import model.pojos.Employee;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;

/**
 *
 * @author hamil
 */
public class EmployeeDAO {
    
    public void createEmployee(){
        
        String firstName, lastName;
        Integer salary;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Introduzca el primer nombre: \n");
        firstName = keyboard.nextLine();
        System.out.print("Introduzca el segundo nombre: \n");
        lastName = keyboard.nextLine();
        System.out.print("Introduzca el salario: \n");
        salary = keyboard.nextInt();
        
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        
        
        
        
        try {
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            Employee empleado = new Employee(firstName, lastName, salary);
            sesion.save(empleado);
            tx.commit();
            sesion.close();
        } catch (Exception ex) {
            tx.rollback();
            throw new RuntimeException("Problemas para iniciar la sesión");
        }
        
    }
    
    public static void main(String[] args){
        
        EmployeeDAO ME = new EmployeeDAO();
        ME.createEmployee();
        
    }
    
    public void getAll(){
        SessionFactory sf = null;
        Session sesion = null;
        Transaction tx = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            sesion = sf.openSession();
            tx = sesion.beginTransaction();
            
            List empleados = sesion.createQuery("FROM Employee").list();
            Iterator iterator = empleados.iterator();
            while (iterator.hasNext()) {
                Employee empleado = (Employee) iterator.next();
                System.out.print("El nombre es: "+ empleado.getFirstName());
                System.out.print("\nEl Apellido es: "+ empleado.getLastName());
                System.out.print("\nEl salario es: "+ empleado.getSalary()+"\n");
            }
            
            tx.commit();
            sesion.close();
        } catch (Exception ex){
            tx.rollback();
            throw new RuntimeException("Hubo problemas para iniciar la sesion Hibernate");
        }
    }
    
}
