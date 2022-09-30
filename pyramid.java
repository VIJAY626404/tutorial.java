import java.util.Scanner;
public class pyramid{
    public static void main(String args[]){
        int n, i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of number");
        n= sc.nextInt();
        for(i=0;i<n; i++){
            for(j=0; j<n; j++){
                if(i+j >=n-1){
                    System.out.print(" *");

                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
           
            

            }
    }
}