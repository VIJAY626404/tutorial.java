 import java.util.Scanner;
public class operatorPrecedency6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        System.out.println(((((x+8)/3)%5)*5)) ;
    }
    
}
