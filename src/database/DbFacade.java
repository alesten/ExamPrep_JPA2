package database;

import entity.Employee;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import javax.persistence.EntityManager;

public class DbFacade {

    private DbConnector dbConnector = DbConnector.Instance();

    public Person addPerson(String firstName, String lastName) {
        EntityManager em = dbConnector.getEm();

        Person person = new Person();

        person.setFirstName(firstName);
        person.setLastName(lastName);

        try {
            em.getTransaction().begin();

            em.persist(person);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return person;
    }

    public Person editPerson(Person person) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.merge(person);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return person;
    }

    public Person findPerson(long id) {
        EntityManager em = dbConnector.getEm();

        Person person;

        try {
            em.getTransaction().begin();

            person = em.find(Person.class, id);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return person;
    }

    public void deletePerson(long id) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.remove(em.find(Person.class, id));

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Student addStudent(String firstName, String lastName) {
        EntityManager em = dbConnector.getEm();

        Student student = new Student();

        student.setFirstName(firstName);
        student.setLastName(lastName);

        try {
            em.getTransaction().begin();

            em.persist(student);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return student;
    }

    public Student editStudent(Student student) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.merge(student);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return student;
    }

    public Student findStudent(long id) {
        EntityManager em = dbConnector.getEm();

        Student student;

        try {
            em.getTransaction().begin();

            student = em.find(Student.class, id);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return student;
    }

    public void deleteStudent(long id) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.remove(em.find(Student.class, id));

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public Employee addEmployee(String firstName, String lastName) {
        EntityManager em = dbConnector.getEm();

        Employee employee = new Employee();

        employee.setFirstName(firstName);
        employee.setLastName(lastName);

        try {
            em.getTransaction().begin();

            em.persist(employee);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return employee;
    }

    public Employee editEmployee(Employee employee) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.merge(employee);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return employee;
    }

    public Employee findEmployee(long id) {
        EntityManager em = dbConnector.getEm();

        Employee employee;

        try {
            em.getTransaction().begin();

            employee = em.find(Employee.class, id);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return employee;
    }

    public void deleteEmployee(long id) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.remove(em.find(Employee.class, id));

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public PhDStudent addPhDStudient(String firstName, String lastName) {
        EntityManager em = dbConnector.getEm();

        PhDStudent phDStudent = new PhDStudent();

        phDStudent.setFirstName(firstName);
        phDStudent.setLastName(lastName);

        try {
            em.getTransaction().begin();

            em.persist(phDStudent);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return phDStudent;
    }

    public PhDStudent editPhDStudient(PhDStudent phDStudent) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.merge(phDStudent);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return phDStudent;
    }

    public PhDStudent findPhDStudient(long id) {
        EntityManager em = dbConnector.getEm();

        PhDStudent phDStudent;

        try {
            em.getTransaction().begin();

            phDStudent = em.find(PhDStudent.class, id);

            em.getTransaction().commit();
        } finally {
            em.close();
        }

        return phDStudent;
    }

    public void deletePhDStudient(long id) {
        EntityManager em = dbConnector.getEm();

        try {
            em.getTransaction().begin();

            em.remove(em.find(PhDStudent.class, id));

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
