import java.util.Scanner;
import java.util.StringJoiner;

public class string3 {
    /**
     * @param args
     */
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name  = sc.nextLine();
    String roll = sc.nextLine();
    String interest = sc.nextLine();
    System.out.println("Name is : " +name);
    System.out.println("Roll Number is : " +roll);
    System.out.println("Field of interest is : " +interest);
    
    System.out.println(name+interest);
    }
}
    
