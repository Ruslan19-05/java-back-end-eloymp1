package az.edu.turing;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        //üç müxtəlif ədəd verilir .Onların medianını tapın
        System.out.println("eded daxil edin: ");
        Scanner scanner =new Scanner(System.in);
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        if(num1<1000 && num2<1000 && num3<1000){
            if(num1==num2 || num2==num3 || num3==num1) {
                System.out.println("Shev ededler daxil edilib!");
            }else if((num1>num2 && num1<num3)||(num1>num3 && num2>num1)){
                System.out.println("Median: "+num1);
            }else if((num2>num1 && num3>num2)||(num2>num3 && num1>num2)) {
                System.out.println("Median: "+num2);
            }else if((num3>num1 && num3<num2) ||(num3>num2 && num1>num3)){
                System.out.println("Median: "+num3);
            }
        }else {
            System.out.print("Shev ededler daxil edilib!");
        }
    }
}
