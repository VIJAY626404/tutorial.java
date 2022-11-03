import java.util.Scanner;
public class max_min18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        // System.out.println(" Addition is : " + num1 +num2);
        // System.out.println(" Difference is : " + num1-num2);       these both are don't work
        System.out.println(num1-num2);
    
        System.out.printf(" Addition is : %d%n " , num1+num2);
        System.out.printf(" Difference is : %d%n" , num1-num2);
        System.out.printf(" Max is :  %d%n", Math . max(num1,num2));
        System.out.printf(" Min is :  %d%n", Math . min(num1,num2));


       
    }
    
}
