import java.util.Scanner ;
public class leapyear {
     public static void main (String args[]){
        int year;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of year");
        year = sc.nextInt();
        if(year%4==0){
         System.out.println("This  is leap year :" +year);
        }
        else if(year%100==0){
         System.out.println("This is leap year :" +year);
        }
        
        else{
         System.out.println(" This is not leap year :" +year);
        }



     }
    
}
