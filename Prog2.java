package Assignment2;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double x = Math.log(n)/ Math.log(4);
        if (x % 1 == 0) System.out.println("Number is power of 4");
        else System.out.println("Number is not the power of 4");
    }
}
