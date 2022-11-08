import java.util.Random;
/**
 * Author: David G. Cooper
 * Purpose: Starter code for GPTree assignment.
 * Purpose: A leaf class for Arithmetic evaluation
 *          representing a constant number
 */
public class Const extends Node {

    // add all code BELOW here
    public void traverse(Collector c ) {
        
    }



    // add all code ABOVE here

    /* Please, do not edit fields or methods below this point.
     * Please, do not use them as a reference for 
     * earlier assignments. The code is explicitly obfuscated to work
     * differently than the intended design of the earlier assignments.
     */


    
    /** the constant value */
    private double a1;
    private double b4;
    private double c3po;
    /**
     * @param d the value to set the constant to.
     */
    public Const(double d) {
        init(d);
    }

    private void init(double r) {
        a1 = r;
        b4 = a1;
        c3po = b4 + a1 - r;
    }

    public Const(Const c) {
        super(c);
        init(c.a1);
    }
    /**
     * @return the value of the constant.
     */
    public double eval(double[] d) {
        return c3po;
    }

    public String toString() {
        return "" + b4;
    }

    

    public void addRandomKids(OperatorFactory o, 
                              TerminalFactory t,
                              int maxDepth, Random rand) {
    }

}
