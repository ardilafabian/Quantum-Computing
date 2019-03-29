/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexTest;

import complexnumberslibrary.*;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabian Ardila
 */
public class QuantumSystemParticleInLineTest {
    
    public QuantumSystemParticleInLineTest() {}
    
    @BeforeClass
    public static void setUpClass() {
    }

    @Test
    public void particleLikelihoodAtPointTest() {
        ComplexVector cv = new ComplexVector();
        
        cv.addComplexNumber(new ComplexNumber(-3, -1));
        cv.addComplexNumber(new ComplexNumber(0, -2));
        cv.addComplexNumber(new ComplexNumber(0, 1));
        cv.addComplexNumber(new ComplexNumber(2, 0));
        
        double res = QuantumSystemParticleInLine.particleLikelihoodAtPoint(cv, 2);
        
        assertEquals("particleLikelihoodAtPointTest failed.", true, 0.0526 == res);
    }
    
    @Test
    public void amplitudeOfTransitionTest() {
        ComplexVector cv1 = new ComplexVector();
        ComplexVector cv2 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(1, 0));
        cv1.addComplexNumber(new ComplexNumber(0, -1));
        
        cv2.addComplexNumber(new ComplexNumber(0, 1));
        cv2.addComplexNumber(new ComplexNumber(1, 0));
        
        ComplexNumber res = QuantumSystemParticleInLine.amplitudeOfTransition(cv1, cv2);
        
        //System.err.println("aaaaa ->"+res);
        
        assertEquals("amplitudeOfTransitionTest failed.", true, res.equals(new ComplexNumber(0, -1)));
    }
}
