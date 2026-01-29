package Lab2;

import java.util.Scanner;

public class program1 {
    public static void OddEven(int num){
        int even =0;
        int odd=0;

        int digit=0;
        while(num>0) {
            digit = num % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num = num / 10;
        }

        System.out.println("The number of even numbers are:" +even);
        System.out.println("The number of odd numbers are:" +odd);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        OddEven(num);

    }

}
