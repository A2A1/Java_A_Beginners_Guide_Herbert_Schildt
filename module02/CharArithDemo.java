package comp.learnJava.module02;

// Java's Primitive Types: Characters
// Character variables can be handled like integers.
public class CharArithDemo {
    public static void main(String[] args) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);
        System.out.println("ch in ASCII is " + (int)ch);

        ch++;
        System.out.println("ch is now " + ch);
        System.out.println("ch in ASCII is " + (int)ch);

        ch = 90;
        System.out.println("ch is now " + ch);
        System.out.println("ch in ASCII is " + (int)ch);

        ch = 65;
        System.out.println("ch is now " + ch);
        System.out.println("ch in ASCII is " + (int)ch);

    }

}
