package Assignment2;

public class Prog7 {
    public static void main(String[] arg){
        long x = 2147483647;
        for (int i = 1; ; i++){
            long fac = fact(i);
            if (fac <= x)
                System.out.println("The factorial of " + i + " is : " + fac);
            else {
                System.out.println("The factorial of " + i + " is out of range");
            }
        }
    }
    public static int fact(int x){
        if (x == 0)
            return 1;
        else
            return(x * fact(x-1));
    }
}
