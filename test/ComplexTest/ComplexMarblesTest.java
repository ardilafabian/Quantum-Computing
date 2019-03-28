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
public class ComplexMarblesTest {
    
    public ComplexMarblesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void ComplexMarblesSimulation() throws Exception {
        ComplexVector cv1;
        ComplexVector expected;
        
        ComplexMatrix cmx1;
        
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
        
        expected = new ComplexVector();
        expected.addComplexNumber(new ComplexNumber(0.41, 3651.46));
        expected.addComplexNumber(new ComplexNumber(-0.41, -3651.46));
        expected.addComplexNumber(new ComplexNumber(-0.63, 0));
        
        MarblesExperiment marbles = new MarblesExperiment(cmx1, cv1, 1);
        
        ComplexVector res = MarblesExperiment.getNewState();
        
        assertTrue("ComplexMarblesSimulation failed.", res.equals(expected));
    }
}
