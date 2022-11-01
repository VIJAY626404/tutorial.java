import java.util.Scanner;
public class v5_years_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of minutes is ");
        int minute = sc.nextInt();
        int year =minute/ (365*1440);
        int day = (minute/1440)%365;
        System.out.println(" Years are " +year);
        System.out.println(" Days are " +day);
        System.out.println((int) minute+ " minute is approximately " +year+ " years and  "+ day+" days");
        

    }
    
}
