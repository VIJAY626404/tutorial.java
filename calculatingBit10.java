// find the total number of bits needed to be flipped to convert x to y.
import java.util.Scanner;
public class calculatingBit10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n= x^y;
        int count =0;
        while(n!=0){
            n= n&(n-1);
            count++;
        }
        System.out.println(count);
    }
    
}
