import java.math.BigInteger;
import java.util.*;
public class BigInteger_valueConversion8 {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        BigInteger bigvalue = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println("BigInteger value is : " +bigvalue);
        Long longvalue=bigvalue.longValue();
        System.out.println("/n conversion of BigInterger to Long value is : " +longvalue);
        int intvalue= bigvalue.intValue();
        System.out.println("/n conversion of BigInteger to Integer value is : " +intvalue);
        Short shortvalue= bigvalue.shortValue();
        System.out.println("/n conversion of BigInteger to short value is : " +shortvalue);
        Byte bytevalue= bigvalue.byteValue();
        System.out.println("/n conversion of BigInteger to Byte value is : " +bytevalue);
        Long exact_value= bigvalue.longValueExact();
        System.out.println("/n conversion of BigInteger to Exact Long value is : " +exact_value);
    }
    
}
//    integer signum values are represant as positive , zero, negative ---> 1, 0, -1;