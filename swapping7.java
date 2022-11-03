//  swapping two number without using third variable
import java.util.Scanner;

public class swapping7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping ");
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping ");
        System.out.println(a);
        System.out.println(b);

    }

}
