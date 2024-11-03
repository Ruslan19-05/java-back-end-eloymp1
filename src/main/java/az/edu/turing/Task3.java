package az.edu.turing;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        //input
        //çıxışa göstərilən ədədin rəqəmlərindən böyüyün verin
        System.out.println("eded daxil et: ");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=0;
        int c=0;
        int d=0;
        if (a > 0) {
            c=a%10;
            d=a/100;
            a = a / 10;
            b = a % 10;
        }
        if(c==b && b==d) {
            System.out.print("=");
        }else if(c>b && c>d){
            System.out.print("A big number: ");
            System.out.println(c);
        }else if(b>c && b>d){
            System.out.print("A big number: ");
            System.out.println(b);
        }else {
            System.out.print("A big number: ");
            System.out.println(d);
        }
    }
}
