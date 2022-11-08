import java.util.Random;

/**
 * Author: David G. Cooper
 * Purpose: Starter code for GPTree assignment.
 */
public abstract class Binop extends Node {

    // add all code BELOW here
    public void traverse (Collector c) {
        
    }



    // add all code ABOVE here

    /* Please, do not edit fields or methods below this point.
     * Please, do not use them as a reference for 
     * earlier assignments. The code is explicitly obfuscated to work
     * differently than the intended design of the earlier assignments.
     */



    /** the left child node */
    protected Node lChild;
    /** the right child node */
    protected Node rChild;

    abstract protected char getOp();

    abstract double op(double left, double right);

    public Binop(Binop b) {
        super(b);
        lChild = copy(b.lChild);
        rChild = copy(b.rChild);
    }

    public Binop() {}

    /**
     * @param l the left node
     * @param r the right node
     */
    public Binop(Node l, Node r) {
    	lChild = l;
        rChild = r;
    }

    public String toString() {
        return "(" + lChild.toString() + " " + getOp() + " " + rChild.toString() + ")";
    }

    public double eval(double[] d) {
        return op(lChild.eval(d),rChild.eval(d));
    }

    public void addRandomKids(OperatorFactory o, 
                              TerminalFactory t,
                              int maxDepth, Random rand) {
        NodeFactory f = new NodeFactory();
        if(depth == maxDepth) {
            this.rChild = f.getTerm(rand);
            this.rChild.depth = depth + 1;
            this.lChild = f.getTerm(rand);
            this.lChild.depth = depth + 1;
        } else {
            // right child
            int choice = rand.nextInt(f.numOps() + f.numIndep());
            if (choice < f.numIndep()) {
                this.rChild = f.getTerm(rand);
                this.rChild.depth = depth + 1;
            } else {
                
                this.rChild = f.getOp(rand);
                this.rChild.depth = depth + 1;
                this.rChild.addRandomKids(o,t,maxDepth,rand);
            }
            // left child
            choice = rand.nextInt(f.numOps() + f.numIndep());
            if (choice < f.numIndep()) {
                this.lChild = f.getTerm(rand);
                this.lChild.depth = depth + 1;
            } else {
                this.lChild = f.getOp(rand);
                this.lChild.depth = depth + 1;
                this.lChild.addRandomKids(o,t,maxDepth,rand);
            }
            
        }
        
    }


}
