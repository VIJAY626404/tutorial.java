// write a program to calculate the factorial of given number
import java.util.Scanner;
public class factorial22 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println(" Enter number : ");
        int n = scn.nextInt();
        int fact =1;
        for(int i =1; i<=n; i++){
            if(i==1 || i==0){
                fact = 1;
            }
            fact =fact*i ;
        }
        System.out.print(" factoril of "+n+ " is "+fact);
   
    }

    
}
