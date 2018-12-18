package Assignment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.stream.Stream;

public class Prog8 {
    public static void main(String[] arg){
        File folder = new File("//home//user//Documents//Java//Downloads//");
        File[] listOfFiles = folder.listFiles();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(s)) {
                    System.out.println("File " + listOfFiles[i].getName());
                    String path = folder + "//" + listOfFiles[i].getName();
                    File file = new File(path);
                    System.out.println(folder + "/" + listOfFiles[i].getName());
                    InputStream is = new FileInputStream(path);
                    System.out.println(file.length());
                    byte[] arr = new byte[(int)path.length()];
                    int readCount = 0;
                    while((readCount = is.read(arr)) > 0){
                        System.out.println(new String(arr, 0, readCount-1));
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
