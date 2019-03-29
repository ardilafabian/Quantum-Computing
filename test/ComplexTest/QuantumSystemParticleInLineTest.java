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
}
