// write a java program to compare two given signed and unsigned numbers

public class singn_unsign6 {
    public static void main(String[] args) {
        int in2= Integer.MIN_VALUE;
        int in1= Integer.MAX_VALUE;
        System.out.println("Signed integer :" +in2+ " "+in1);
        int compare_signed_num = Integer.compare(in2 , in1);
        System.out.println("Result of comparing two signed number :  "  +compare_signed_num);
        int compare_unsigned_num = Integer.compareUnsigned(in2 , in1);
        System.out.println("Result of comparing two unsigned number :  "  +compare_unsigned_num);
      
        
    }
    
}
