package Assignment2;

public class Prog7Long {
    public static void main(String[] arg){
        long x = Long.MAX_VALUE;
        System.out.println(x);
        for (int i = 1; ; i++){
            long fac = fact(i);
            if (fac > 0){
                System.out.println("The factorial of " + i + " is : " + fac);
            }
            else {
                System.out.println("The factorial of " + i + " is out of range");
                break;
            }
        }
    }
    public static long fact(int x){
        if (x == 0)
            return 1;
        else
            return(x * fact(x-1));
    }
}
