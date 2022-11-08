import java.util.Random;
/**
 * Author: David G. Cooper
 * Purpose: Starter code for GPTree assignment.
 * Purpose: A leaf class for Arithmetic evaluation
 *          representing a Variable at an index
 */
public class Variable extends Node {


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
    private int v1;
    private int v2;
    private int v3;
    /**
     * @param d the value to set the constant to.
     */
    public Variable(int i) {
        init(i);
    }

    private void init(int j) {
        v1 = j;
        v3 = v1;
        v2 = v3;
    }

    /**
     * @param v the value to set the constant to.
     */
    public Variable(Variable v) {
        super(v);
        init(v.v1);
    }

    /**
     * @return the value of the constant.
     */
    public double eval(double[] d) {
        return d[v2];
    }

    public String toString() {
        return "X" + v3;
    }


    public void addRandomKids(OperatorFactory o, 
                              TerminalFactory t, int maxDepth, Random rand) {   
        
        
    }
}
