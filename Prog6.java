package Assignment2;

import java.util.Scanner;

public class Prog6 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int noOfStudent = scanner.nextInt();
        int[] grades = new int[noOfStudent];
        for (int i = 0; i < noOfStudent; i++){
            System.out.println("Enter the grade for student " + i+1 + ": ");
            grades[i] = scanner.nextInt();
            if (grades[i] < 0 || grades[i] > 100) {
                System.out.println("Wrong grade");
                break;
            }
        }
        average(grades);
        minimum(grades);
        maximum(grades);
    }
    public static void average(int[] grades){
        int avg = 0;
        for (int i = 0; i < grades.length; i++){
            avg += grades[i];
        }
        System.out.println("The average is " + avg/grades.length);
    }
    public static void minimum(int[] grades){
        int min = 100;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] < min) min = grades[i];
        }
        System.out.println("The minimum is " + min);
    }
    public static void maximum(int[] grades){
        int max = 0;
        for (int i = 0; i < grades.length; i++){
            if (grades[i] > max) max = grades[i];
        }
        System.out.println("The minimum is " + max);
    }
}
