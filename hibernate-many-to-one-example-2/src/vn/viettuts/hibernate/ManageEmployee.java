package vn.viettuts.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import vn.viettuts.hibernate.entity.Address;
import vn.viettuts.hibernate.entity.Employee;

public class ManageEmployee {
    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        ManageEmployee ME = new ManageEmployee();

        // Add new address in db
        Address address = ME.addAddress("Nguyen Trai", "Ha Noi", "", "100000");

        // Add new employee in db
        Integer empID1 = ME.addEmployee("Ho", "Van A", 4000, address);

        // Add another new employee in db
        Integer empID2 = ME.addEmployee("Vo", "Van B", 3000, address);

        // Show list all employees
        System.out.println("-----Show list all employees-----");
        ME.listEmployees();

        // Update employee's salary records
        System.out.println("-----Update employee 1-----");
        ME.updateEmployee(empID1, 5000);

        // Delete an employee from the database
        System.out.println("-----Delete employee 2-----");
        ME.deleteEmployee(empID2);

        // List down all the employees
        System.out.println("-----Show list all employees-----");
        ME.listEmployees();

    }

    // Method to add an address record in the database
    public Address addAddress(String street, String city, String state, String zipcode) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer addressID = null;
        Address address = null;
        try {
            tx = session.beginTransaction();
            address = new Address(street, city, state, zipcode);
            addressID = (Integer) session.save(address);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return address;
    }

    // Method to add an employee record in the database
    public Integer addEmployee(String fname, String lname, int salary, Address address) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;
        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary, address);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    // Method to list all the employees detail
    public void listEmployees() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM Employee").list();
            for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName() + ", ");
                System.out.print("Last Name: " + employee.getLastName() + ", ");
                System.out.println("Salary: " + employee.getSalary());
                Address add = employee.getAddress();
                System.out.println("Address ");
                System.out.println("\tStreet: " + add.getStreet());
                System.out.println("\tCity: " + add.getCity());
                System.out.println("\tState: " + add.getState());
                System.out.println("\tZipcode: " + add.getZipcode());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // Method to update salary for an employee
    public void updateEmployee(Integer EmployeeID, int salary) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, EmployeeID);
            employee.setSalary(salary);
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    // Method to delete an employee from the records
    public void deleteEmployee(Integer EmployeeID) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
