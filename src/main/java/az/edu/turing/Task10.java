package az.edu.turing;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        //Buratino və bank
        System.out.println("Bnkdakı pulu daxil edin:");
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int n = 1;
        if (2 <= S && S <=100000000) {
            for(n=1;n>=1;n++) {
                n=S-(S-n);
                S=S*2+n;
                n++;
            }
            System.out.print("Buritononun yaşı: " + n);
        } else {
            System.out.print("Bele mebleğ yoxdur!");
        }
    }
}
