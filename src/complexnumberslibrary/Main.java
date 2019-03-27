/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumberslibrary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian Ardila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        ComplexOperation op = new ComplexOperation();
        
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        ComplexVector cv1;
        ComplexVector cv2;
        
        ComplexNumber scalar;
        double scalar2;
        
        ComplexMatrix cmx1;
        ComplexMatrix cmx2;
        
        /*-------------------------------------------------------------------------*/
        /*
        cmx1 = new ComplexMatrix();
        cmx2 = new ComplexMatrix();
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(3, 2));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(5, -6));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(1, 0));
        cv1.addComplexNumber(new ComplexNumber(4, 2));
        cv1.addComplexNumber(new ComplexNumber(0, 1));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(4, -1));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(4, 0));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(5, 0));
        cv1.addComplexNumber(new ComplexNumber(2, -1));
        cv1.addComplexNumber(new ComplexNumber(6, -4));
        cmx2.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(4, 5));
        cv1.addComplexNumber(new ComplexNumber(2, 0));
        cmx2.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(7, -4));
        cv1.addComplexNumber(new ComplexNumber(2, 7));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cmx2.addComplexEntry(cv1);
        
        System.out.println("--- Test Case 8: ---\n     A  = \n" + cmx1 + "\n     B = \n" + cmx2 + "\n\n");
        
        System.out.println("Matrix Multiplication: A x B ->\n" +op.complexMatrixMultiplication(cmx1, cmx2) + "\n\n");  */
        
        cmx1 = new ComplexMatrix();
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(0.7071, 0));
        cv1.addComplexNumber(new ComplexNumber(0.7071, 0));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(-0.7071, 0));
        cv1.addComplexNumber(new ComplexNumber(-0.7071, 0));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(0, 1));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(0.5774, 0));
        cv1.addComplexNumber(new ComplexNumber(0, 5164));
        cv1.addComplexNumber(new ComplexNumber(0, 0.6325));
        
        MarblesExperiment marbles = new MarblesExperiment(cmx1, cv1, 1);
        
        System.out.println(marbles.getNewState());
        //System.out.println(op.complexNumberMultiplication(new ComplexNumber(0, 1), new ComplexNumber(0, 0.6325)));
    }
    
}
