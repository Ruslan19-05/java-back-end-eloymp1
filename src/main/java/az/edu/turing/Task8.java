package az.edu.turing;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        //input
        //rubleri verin
        System.out.println("Enter your qurater : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = "";
        //prosess
        if (number <= 12) {
            if (number >= 1 && number <=3 ) {
                result = ("First");
            } else if (number >= 7 && number <= 9) {
                result = ("Thrid");
            } else if (number >= 10 && number <= 12) {
                result = ("Forth");
            } else
                result = ("Second");
            if (number >= 13) {
                System.out.println("Not has this month");
            }
            //output
            System.out.print(result);

        }
    }
}

