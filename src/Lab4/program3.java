package Lab4;

import java.util.Scanner;

interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        double earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + (int) earn);
    }

    public void deductions() {
        double ded = 0.12 * basic;
        System.out.println("Deduction - " + (int) ded);
    }

    public void bonus() {
        // Not implemented here
    }
}

class Substaff extends Manager {

    Substaff(double basic) {
        super(basic);
    }

    public void bonus() {
        double bon = 0.5 * basic;
        System.out.println("Bonus - " + (int) bon);
    }
}

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic salary: ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);
        s.earnings();
        s.deductions();
        s.bonus();
    }
}
