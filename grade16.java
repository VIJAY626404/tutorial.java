import java.util.Scanner;
public class grade16 {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       System.out.println(" Enter the your marks ");
       int mark = scn.nextInt();
       if(mark>90 && mark<=100){
        System.out.println(" Your Grade is  A+");
       }
       else if(mark>80 && mark<=90){
        System.out.println("Your Grade is A ");
       }
       else if(mark>70 && mark<=80){
        System.out.println("Your Grade is B+");
       }
       else if(mark>60 && mark<=70){
        System.out.println("Your Grade is B ");
       }
       else if(mark>50 && mark<=60){
        System.out.println(" Your Grade is C ");
       }
       else if(mark>40 && mark<=50){
        System.out.println(" Your Grade is D ");
       }
       else if(mark>30 && mark<=40){
        System.out.println(" Your Grade is E ");
       }
       else if(mark>0 && mark<=30){
        System.out.println(" Your Grade is F");
       }
       else{
        System.out.println(" You have entered default value");
       }

        
    }
    
}
