import java.util.*;
public class profitLoss13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println(" Enter cost price ");
       int cp= sc.nextInt();
       System.out.println("Enter selling price ");
       int sp= sc.nextInt();
       int profit = sp - cp;
       int loss = cp- sp;
       if(sp>cp){
        System.out.println("Profit is " +profit);
       }
       else if(cp>sp){
        System.out.println("Loss is " +loss);
       }
       else if(cp==sp){
        System.out.println(" No profit and loss");
       }
     
    }
    
}
