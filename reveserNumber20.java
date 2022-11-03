// write a java programe to print reverse number of given number
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class reveserNumber20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" Enter your digit : ");
        int n = scn.nextInt();
        int reverse =0;
        while(n>0){
        reverse = reverse*10+n%10;
        n/=10;
        }
        System.out.printf(reverse+ " is reverse of given number " );
   

        
    }
}
