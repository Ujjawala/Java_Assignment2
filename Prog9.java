package Assignment2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.*;

public class Prog9 {
    public static void main(String[] arg){
        try {
            File file = new File("//home//user//Documents//Java//Downloads//FileDemo.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder st = new StringBuilder("");
            String s;
            String key;
            Map<String,Integer> map = new HashMap<>();
            while ((s = br.readLine()) != null){
                String[] str = s.split("\\s+|,\\s*|\\.\\s*");
                for (int i = 0; i < str.length; i++){
                    if (map.get(str[i]) == null){
                        map.put(str[i], 1);
                    }
                    else {
                        map.put(str[i], map.get(str[i]) + 1);
                    }
                }
            }
            for (Map.Entry< String,Integer> me:map.entrySet()) {
                System.out.print(me.getKey() + " -> ");
                System.out.println(me.getValue());
            }
        }catch (Exception e){
            System.out.println("ex");
        }
    }
}
