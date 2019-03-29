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
import java.util.ArrayList;
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
    
    @Test
    public void MultipleComplexSimulation() throws Exception {
        ComplexVector cv1;
        ComplexVector expected;
        
        ComplexMatrix cmx1 = new ComplexMatrix();
        
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
        
        ComplexVector state = new ComplexVector();
        state.addComplexNumber(new ComplexNumber(0.5774, 0));
        state.addComplexNumber(new ComplexNumber(0, 5164));
        state.addComplexNumber(new ComplexNumber(0, 0.6325));
        
        MarblesExperiment marbles1 = new MarblesExperiment(state);
        
        ArrayList<ComplexMatrix> dynamicSet1 = new ArrayList<>();
        dynamicSet1.add(cmx1);
        dynamicSet1.add(cmx1);
        dynamicSet1.add(cmx1);
        
        ComplexVector res1 = marbles1.dynamicSimulation(dynamicSet1);
        
        //-----------------------------
         
        MarblesExperiment marbles2 = new MarblesExperiment(cmx1, state, 3);
        ComplexVector res2 = marbles2.getNewState();
        
        
        assertEquals("MultipleComplexSimulation", true , res1.equals(res2));
        assertEquals("MultipleComplexSimulation", true , res2.equals(res1));
    }
}
