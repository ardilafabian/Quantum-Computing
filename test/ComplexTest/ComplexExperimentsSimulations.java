/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexTest;

import complexnumberslibrary.ComplexMatrix;
import complexnumberslibrary.ComplexNumber;
import complexnumberslibrary.ComplexVector;
import complexnumberslibrary.MarblesExperiment;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabian Ardila
 */
public class ComplexExperimentsSimulations {
    
    public ComplexExperimentsSimulations() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void ComplexMarblesSimulation() {
        ComplexVector cv1;
        ComplexVector cv2;
        
        ComplexMatrix cmx1;
        ComplexMatrix cmx2;
        ComplexMatrix expected;
        
        cmx1 = new ComplexMatrix();
        cmx2 = new ComplexMatrix();
        expected = new ComplexMatrix();
        
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
    }
}
