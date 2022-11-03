//  given 2 number a and b find a raise to the powr b.
import java.util.Scanner;
public class a_raiseTopower_b23 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b =scn.nextInt();
        int result =1;
        for(int i =1; i<=b; i++){
            result = result*a;
        }
        System.out.println(result);
    // int i=1;
    // while(i<=b){
    //     result *= a;
    //     i++;
    // }
    // System.out.println(result);
    
    }

}
