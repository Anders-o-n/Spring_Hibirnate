package hibernate_test;
//import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

/*public class Test1 {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().addAnnotatedClass(Employee.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        //Employee employee = session.get(Employee.class,1); -получили человека
       // System.out.println(employee.getName());

       // Employee employee2 = new Employee("Alexander","Anderson","IT",100);
       // session.save(employee2); - сохраниили человека

       // List <Employee> list = session.createQuery("from Employee where  name = 'Alexander'").getResultList();
       // for (Employee emp : list ) {
       //    System.out.println(emp); - получили Александров
       // }

      //  Employee emp = session.get(Employee.class,1);
      //  emp.setSalary(500); - поменяли Алексу зп на 500

        //session.createQuery("update Employee  set salary = 1000 where  surname = 'Anderson' ")
        //                .executeUpdate(); - поменяли Андерсонам зп на 1000

        //Employee emp = session.get(Employee.class,1);
        //session.delete(emp); - удалили человека с айди 1

       // session.createQuery("delete Employee   where  surname = 'Anderson' ")
         //              .executeUpdate();  - удалили всех Андерсонов

        session.getTransaction().commit();
        factory.close();

    }
}*/
