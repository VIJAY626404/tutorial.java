// package JAVA.W3resources.dataType;
import java.util.Scanner;
public class v2inch_cm_meter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the value of Inch : ");
        float inch = in.nextFloat();
     float meter = (float) (inch*2.54) ;
     float centimeter = (float)(inch*0.0254);
     System.out.println("Value of inch is :  "  +inch);
     System.out.println("Value of meter  is :  " +meter);
     System.out.println("Value of centimeter is :  " +centimeter);
      int g = 15;
    //   System.out.println(g%2);
    //   System.out.println(g%3);
    //   System.out.println(g/2);
    //   System.out.println(g/3);




    }
    
}
