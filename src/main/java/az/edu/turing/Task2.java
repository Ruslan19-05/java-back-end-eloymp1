package az.edu.turing;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //input
        //iki a və b ədələri verilir.Ədədlərin mütləq qiymətcə 10pow9 -aşmır
        System.out.println("enter first number: ");
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2=scanner.nextInt();
        int sum;
        if(number1<=Math.pow(10,9) && number2<=Math.pow(10,9)){
            sum=number1*number1 +number2*number2;
            System.out.println(sum);
        }
    }
}