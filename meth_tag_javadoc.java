package com.company.Meths_tags_javadoc;
/**
 * This calss is demonstrate what java class is and how it is used in java industry
 * @author Neha pande
 * @since 2021
 * @version 0.01
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="blank">java docs </a>
 *
 */

public class meth_tag_javadoc {
    /**
     * @param args These are the arguments supplied to the command line
     */
    /** This method is used to perfom division Operation of two number
     * @param a   This is first input
     * @param b   This is second input
     * @return  the division of two number
     * @throws ArithmeticException if b is 0
     * @deprecated this method is deprecated
     * {@code }  This is java doc
     */
    public static int div(int a, int b) throws ArithmeticException
    {
        int c= a/b;
        return c;

    }
    public static void main(String[] args) {
        System.out.println("This is My program");
        int k;
        try {
            k = div(10, 5);
            System.out.println(k);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Airthmatic Exception occurd");
            System.out.println(e);
        }



    }
}
