package Lab4;

import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager1 extends Employee {
    void getDeptDetails();
}

class Head implements Manager1 {
    int empid, deptid;
    String empname, deptname;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter employee name: ");
        empname = sc.nextLine();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter department name: ");
        deptname = sc.nextLine();
    }

    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + empname);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class program4 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}
