package comp.learnJava.module02;

/*
   Use the Pythagorean theorem to finr the length
   of the hypotenuse given the lengths of the teo
   opposing sides.
 */

// Java's Primitive Types: Floating-Point Types
public class Hypo {
    public static void main(String[] args) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}
