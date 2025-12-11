package Lab1;


import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Display Name");
        String name=sc.nextLine();
        System.out.println("Display Roll No");
        int roll=sc.nextInt();
        System.out.println("Display Section");
        int section=sc.nextInt();
        sc.nextLine();
        System.out.println("Display Branch");
        String branch=sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Section: " + section);
        System.out.println("Branch: " + branch);
    }
}
