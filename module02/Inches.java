package comp.learnJava.module02;

// Java's Primitive Types - Integers
/*
   Compute the number of cubic inches
   in 1 cubic mile.
 */
public class Inches {
    public static void main(String[] args) {
        long ci;
        long im;

        // 1 Mile = 5280 feet
        // 1 foot = 12 inches

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}
