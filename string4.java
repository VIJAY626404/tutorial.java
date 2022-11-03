 import java.util.Scanner;
 public class string4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    //     System.out.println("Enter the numbers line : ");
    //   int n = sc.nextInt();
      
        while(sc.hasNextLine()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(a+b);

        }

    }
    
}
