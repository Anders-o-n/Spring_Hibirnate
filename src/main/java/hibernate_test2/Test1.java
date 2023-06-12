package hibernate_test2;
import hibernate_test2.entity.Detail;
import hibernate_test2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class);
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.openSession();
        Employee employee = new Employee("Alexander","Anderson","IT",120);
        Detail detail = new Detail("Toronto","277","megakotik@mail.ru");
        employee.setEmpDitail(detail);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        factory.close();

        //048

    }
}
