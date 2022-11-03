import java.util.Scanner;
public class absoluteValue12 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int number = scn.nextInt();
        if(number<0){
            number = number*-1;
        }
        System.out.println("Absolute value is " +number);
    }
    
}
