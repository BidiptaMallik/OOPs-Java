package Lab1;

import java.util.Scanner;

public class Program4 {
    public static void palindrome(int num){

        int reverse=0;
        int original=num;
        while(num>0){
            int temp=num%10;
            reverse=reverse+temp;
            reverse=reverse*10;
            num=num/10;

        }
        reverse=reverse/10;
        if(reverse==original){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }





    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        palindrome(num);
    }
}
