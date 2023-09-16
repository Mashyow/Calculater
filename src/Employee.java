public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee(int id2, String surname2, int age2, double salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    double uveli() {
        salary *= 2;
        return salary;
    }
}

    class EmployeeTest {
        public static void main(String[] args) {
            Employee emp1 = new Employee(1, "Konstantin", 25, 555.55, "IT");
            Employee emp2 = new Employee(2, "Petr", 27, 888.55, "Sales");

            emp1.uveli();
            System.out.println("Привет" + emp1.surname);
            emp2.uveli();
            System.out.println("Привет" + emp2.surname);
        }
    }









