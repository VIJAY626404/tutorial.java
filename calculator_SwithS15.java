import java.util.*;
 public class calculator_SwithS15 {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println(("Enter two numbers "));
        int a = scn.nextInt();
        int b = scn.nextInt();
   String operation = scn.next();
//    char operation= scn.next().char(0);
        switch(operation){
            case "addtion"  :
            System.out.println(a+b);
            break;
            case "substraction" :
            System.out.println(a-b);
            break;
            case "multipication" :
            System.out.println(a*b);
            break;
            case "division" :
            System.out.println(a/b);
            break;
            default :
            System.out.println(" Undefined Operation");


        }
    }
    
}
