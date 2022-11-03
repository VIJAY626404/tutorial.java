import java.util.Scanner;
public class checkNumber14 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = scn.nextInt();
        if(number>=0){
            System.out.println(" Positive number ");
        }
        
        else{
            System.out.println(" Negative and Just skipp this ");
        }
        
    }
    
}
