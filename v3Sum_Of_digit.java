// import java.util.Scanner;
// public class v3Sum_Of_digit{
// public static void main(String[] args) {
//     Scanner di = new Scanner(System.in);
//     System.out.println("Enter the integer between 0 and 1000");
//     int num = di.nextInt();
//     int firstDigit = num%10;
//     int remainingNumber = num/10;
//     int secondDigit = remainingNumber%10;
//     remainingNumber = remainingNumber/10;
//     int thirdDigit = remainingNumber%10;
//     remainingNumber = remainingNumber/10;
//     int fourthDigit = remainingNumber%10;
//     remainingNumber = remainingNumber/10;
//     int sum = firstDigit+secondDigit+thirdDigit+fourthDigit ;
//     System.out.println(" Sum of all digits in " +num+  "  is :" +sum);

 
   
// }

// }

import java.util.Scanner;
public class v3Sum_Of_digit{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter your number ");
        int n= sc.nextInt();
        int sum =0;
        for(int i=0; i<n; i++){
            int firstDigit= n%10;
            sum+=firstDigit;
            n= n/10;
        }
        System.out.println("Sum of digit  is ");
        System.out.println(+sum);
    }
}