package Assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prog4 {
    public static void main(String[] arg){
        try {
            File file = new File("//home//user//Documents//Java//Downloads//file");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null){
                System.out.println(st.toUpperCase());
            }
            System.out.println("Length of file : " + file.length());
        }catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
