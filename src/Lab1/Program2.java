package Lab1;

import java.util.Scanner;

public class Program2 {
    public static void Grade(int num){
        if(num>=90 && num<=100){
            System.out.println("Grade obtained : O");

        }
        else if(num>=80){
            System.out.println("Grade obtained : E");
        }
        else if(num>=70){
            System.out.println("Grade obtained : A");
        }
        else if(num>=60){
            System.out.println("Grade obtained : B");
        }
        else{
            System.out.println("Grade obtained : C");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number obtained");
        int num=sc.nextInt();
        Grade(num);


    }
}
