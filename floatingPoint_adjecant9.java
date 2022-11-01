//  write a java program to get next floating-point adjacent in a direction of positive and negative infinity from a given float/double number
public class floatingPoint_adjecant9 {
    public static void main(String[] args) {
        float fn = 0.5f;
        System.out.println(" \n Initial floating number " + fn);
        float next_down = Math.nextDown(fn);
        float next_up = Math.nextUp(fn);
        System.out.println(" Float " + fn + " next down is " + next_down);
        System.out.println(" Float " + fn + " next up is " + next_up);

        double val = 0.5;
        System.out.println("\n Initial double number " + val);
        double nextdown = Math.nextDown(val);
        double nextup = Math.nextUp(val);
        System.out.println(" Double " + val + "next down is " + nextdown);
        System.out.println(" Double " + val + "next up is " + nextup);

    }

}
