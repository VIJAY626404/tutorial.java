import java.util.Scanner;
public class linesADD4 {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int t = scn.nextInt();
        // int i =1;
        // while(i<=t){
        //     int a = scn.nextInt();
        //     int b = scn.nextInt();
        //     System.out.println(a+b);
        //     i++;
        // }
        for(int i=1; i<=t; i++){
            int a = scn.nextInt();
            int b= scn.nextInt();
            System.out.println(a+b);
        }
    }
    
}
