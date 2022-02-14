package ZaurCourse.Employee;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }

//     public Employee(double salary3) {
//        this(0, null, 0, salary3, null);

//    }

    Employee (){
    }



//    double DvoinayaZP() {
//        salary *= 2;
//        return salary;
//    }

    public void getSurname() {
        System.out.println("SURNAME = " + surname);
            }

    public void getSalary() {
        System.out.println("SALARY = " + salary);
    }

    public void getId() {
        System.out.println("Id = " + id);
    }
}

class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 34, 121, "IT");
        Employee emp2 = new Employee(2, "Petrov", 31, 180.5, "Sales");

        Employee emp3 = new Employee(0, null, 0, 155.5, null);

//        System.out.println("Двойная зарплата сотрудника по фамилии "+ emp1.surname + " составляет: " + emp1.DvoinayaZP());
//        System.out.println("Двойная зарплата сотрудника по фамилии "+ emp2.surname + " составляет: " + emp2.DvoinayaZP());

        // Lesson7. Домашнее задание!!!!
        emp1.getSurname();
        emp2.getId();
        emp1.getSalary();

//        System.out.println(emp3.salary);

    }
}