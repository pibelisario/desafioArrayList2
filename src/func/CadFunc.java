package func;

import employee.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadFunc {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        boolean control = false;

        System.out.print("How many employees will be registred? ");
        int n = in.nextInt();

        System.out.println();

        Employee em = new Employee();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {


            System.out.println("Employee #" + (i + 1) + ":");

            System.out.print("Id: ");
            int id = in.nextInt();

            System.out.print("Name: ");
            in.nextLine();
            String name = in.nextLine();

            System.out.print("Salary: ");
            double salary = in.nextDouble();

            Employee employee = new Employee(id, name, salary);

            employees.add(employee);

            System.out.println();

        }

        System.out.println();

        System.out.print("Enter with the employee id that will have salary increase: ");
        int id = in.nextInt();

        int ans = positon(employees, id);

        if (ans == -1) {
            System.out.println("this id does not exist!");
        } else {

            System.out.print("Enter the percentage: ");
            double increase = in.nextDouble();
            System.out.println();
            employees.get(ans).increaseSalary(increase);
        }

        System.out.println();

        System.out.println("List of employees: ");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }


    }

    public static int positon(List<Employee> lis, int id) {
        for (int i = 0; i < lis.size(); i++) {
            if (lis.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
