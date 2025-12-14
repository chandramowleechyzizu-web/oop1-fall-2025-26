package Lab;
class Position {
    String title;
    double salary;

    Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String () {
        return title + " (Salary: " + salary + ")";
    }
}
class Employee {
    String name;
    Position pos;

    Employee(String name, Position pos) {
        this.name = name;
        this.pos = pos;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + pos);
    }
}
class Company {
    String cname;
    Employee[] list;
    int count = 0;

    Company(String cname, int size) {
        this.cname = cname;
        list = new Employee[size];
    }

    void TotalEmployee(Employee e) {
        if (count < list.length) {
            list[count] = e;
            count++;
        } else {
            System.out.println("error");
        }
    }

    void showAll() {
        System.out.println("Company: " + cname);
        for (int i = 0; i < count; i++) {
            list[i].show();
            System.out.println();
        }
    }
}
public class EmployeePosition {
    public static void main(String[] args) {

        Company c = new Company("Pran LTD", 3);

        Employee e1 = new Employee("bob", new Position("Manager", 50000));
        Employee e2 = new Employee("ben", new Position("Cashier", 30000));
        Employee e3 = new Employee("mikel", new Position("Assistant", 10000));

        c.TotalEmployee(e1);
        c.TotalEmployee(e2);
        c.TotalEmployee(e3);

        c.showAll();
    }
}