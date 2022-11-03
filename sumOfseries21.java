// write a java programe to pring sum of given series
// 1-2+3-4+5-6---------n
import java.util.*;
public class sumOfseries21 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print(" Enter the length of series  : ");
        int n =scn.nextInt();
        int sum =0;
        for(int i =1;i<=n; i++){
            if(i%2==0){
                sum = sum -i;

            }
            else{
                sum = sum+i;
            }
            
        }
        System.out.println(" sum of given series is ");
        System.out.println(sum);
    }
    
}
