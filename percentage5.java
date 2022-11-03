import java.util.Scanner;
public class percentage5 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int mark1= scn.nextInt();
        int mark2 = scn.nextInt();
        int mark3 = scn.nextInt();
        int total = mark1+mark2+ mark3 ;
         int percentage = ((total)/3);
         System.out.println(total);
         System.out.println(percentage + "%");
        //  System.out.println(percentage); this is not right way to calculate this
    }
}
