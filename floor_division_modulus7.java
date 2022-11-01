import java.util.*; 
public class floor_division_modulus7{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x =scn.nextInt();
        int y = scn.nextInt();
        System.out.println();
        System.out.println(" floor division using as  : " +(x / y));
        System.out.println(" floor division floorDiv()  method using as : " +Math.floorDiv(x , y));
        System.out.println();
        System.out.println(" modulus operator using as : " +(x % y));
        System.out.println("floor modulus floorMod() using as : " +Math.floorMod(x , y));

    }

}