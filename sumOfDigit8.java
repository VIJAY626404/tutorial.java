// write a program to print sum of digit in given number
import java.util.Scanner;
public class sumOfDigit8 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            sum+= num%10;
            num/=10;
       
        }
        
        
        System.out.println(" Sum of the given number is " +sum);
    }
}
