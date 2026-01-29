package Lab2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class pragram5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            System.out.println("Enter details of student " + (i + 1));

            System.out.print("Roll: ");
            s[i].roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < s[minIndex].cgpa)
                minIndex = i;
        }

        System.out.println("\nStudent Details:");
        for (Student st : s) {
            System.out.println(st.roll + " " + st.name + " " + st.cgpa);
        }

        System.out.println("\nStudent with lowest CGPA: " + s[minIndex].name);
        sc.close();
    }
}
