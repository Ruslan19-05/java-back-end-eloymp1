package az.edu.turing;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        //input
        //ədədin kənardakı rəqəmlərin cəmini tapın
        System.out.print("enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int a=0,b=0;
        if(num>999 && num<10000){
            a=num%10;
            while(num>0){
                b=num%10;
                num=num/10;
            }
            System.out.println(b);
            System.out.println(a);
            System.out.print("Sum:"+(a+b));
        }
    }
}