package az.edu.turing;

import java.util.Scanner;

public class Task1{

    public static void main (String[]args) {
        //input
        //eolymp simple problem 10-99 arası hər hansı bir natural ədəd
        System.out.println("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2;
        int number3;

        while (true) {
            if(number >=10 && number<=99) {
                System.out.println("Space between number : ");
                number3 = number % 10;
                number2 = number / 10;
                System.out.println(number2 + " " + number3);
                break;
            }else  {
                System.out.println("Wrong number,enter number again : ");
                number = scanner.nextInt();
            }
        }
    }
}