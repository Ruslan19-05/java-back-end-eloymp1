package az.edu.turing;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        //basa dusmedim
        System.out.print("enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=num%10;
        int b=(num/10)%10;
        int c=num/100;
        // System.out.println(c);
        //System.out.println(b);
        //System.out.println(a);
    }
}
