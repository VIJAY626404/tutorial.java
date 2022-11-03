import java.util.Scanner;

public class speed17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input distance in meter :");
        float distance = scn.nextFloat();

        System.out.print("Input hour : ");
        float h = scn.nextFloat();
        System.out.print("Inpute minute : ");
        float m = scn.nextFloat();
        System.out.print("Inpute second : ");
        float s = scn.nextFloat();
        float totalsecond = (h * 3600) + (m * 60) + s;
        float mps = distance / totalsecond;
        float kmph = (distance / 1000.0f) / (totalsecond / 3600.0f);
        float milph = kmph/1.609f;
        System.out.println("Your speed in meter/second is : " + mps);
        System.out.println("Your speed in km/h is : " + kmph);
        System.out.println("Your speed in miles/h is : " + milph);
    }

}
