import java.util.Scanner;
public class max{
    

    
    public static void main (String args[]){
        int x, y ,sum;
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        x= sc.nextInt();
        System.out.println(" Enter the value of y :");
        y= sc.nextInt();
        
    if( x>y){

        System.out.println("greater number between x and y is: "+x);
        
    }
else
{
    System.out.println("greater number between x and y is: "+y);


}
sum =x+y;
System.out.println("Sum of x and y is : " +sum);


    }
    }
