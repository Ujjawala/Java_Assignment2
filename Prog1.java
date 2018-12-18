package Assignment2;

import java.util.Scanner;

public class Prog1 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        if (rev.toString().equals(s)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
