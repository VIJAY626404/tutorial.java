import java.util.Scanner;
public class checkSquare11 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int length =scn.nextInt();
        int breadth = scn.nextInt();
        if(length==breadth){
            System.out.println(" This is a perfect square");
        }
        else{
            System.out.println(" This is reactangle ");
        }
    }
    
}
