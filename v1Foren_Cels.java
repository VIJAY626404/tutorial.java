// package JAVA.W3resources.dataType;
import java.util.Scanner;
public class v1Foren_Cels {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Ferenhite value ");
        Float foren = sc.nextFloat();
        Float celsius = ((foren-32)*5)/9 ;
        System.out.println(celsius);
    }
    
}
