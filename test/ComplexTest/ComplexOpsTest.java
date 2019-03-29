/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexTest;

import complexnumberslibrary.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabian Ardila
 */
public class ComplexOpsTest {

    public ComplexOpsTest() {
    }

//    @BeforeClass
//    public static void setUpClass() {
//    }
    @Before
    public void setUp() {
    }

    @Test
    public void complexSumTest() {
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        cp1 = new ComplexNumber(3, -1);
        cp2 = new ComplexNumber(1, 4);
        
        ComplexNumber res = ComplexOperation.complexNumberSum(cp1, cp2);
        
        assertEquals("coplexSumTest failed.", true, res.equals(new ComplexNumber(4,3)));
    }
    
    @Test
    public void complexMultiplicationTest(){
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        cp1 = new ComplexNumber(3, -1);
        cp2 = new ComplexNumber(1, 4);
        
        ComplexNumber res = ComplexOperation.complexNumberMultiplication(cp1, cp2);
        
        assertEquals("complexMultiplicationTest failed.", true, res.equals(new ComplexNumber(7, 11)));
    }
    
    @Test
    public void complexSubstractionTest(){
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        cp1 = new ComplexNumber(3, -1);
        cp2 = new ComplexNumber(1, 4);
        
        ComplexNumber res = ComplexOperation.complexNumberRest(cp1, cp2);
        
        assertEquals("complexSubstractionTest failed.", true, res.equals(new ComplexNumber(2, -5)));
    }
    
    @Test
    public void complexDivisionTest(){
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        cp1 = new ComplexNumber(-2, 1);
        cp2 = new ComplexNumber(1, 2);
        
        ComplexNumber res = ComplexOperation.complexNumberDivision(cp1, cp2);
        
        assertEquals("complexDivisionTest failed.", true, res.equals(new ComplexNumber(0, 1)));
    }
    
    @Test
    public void complexModulusTest(){
        ComplexNumber cp1;
        
        cp1 = new ComplexNumber(1, -1);
        
        double res = ComplexOperation.complexNumberModulus(cp1);
        
        assertEquals("complexModulusTest failed.", true, res == 1.4142135623730951);
    }
    
    @Test
    public void complexConjugationTest(){
        ComplexNumber cp1;
        
        cp1 = new ComplexNumber(1, -1);
        
        ComplexNumber res = ComplexOperation.complexNumberConjugation(cp1);
        
        assertEquals("complexConjugationTest failed.", true, res.equals(new ComplexNumber(1, 1)));
    }
    
    @Test
    public void complexCartesianToPolarRepresentationTest(){
        ComplexNumber cp1;
        
        cp1 = new ComplexNumber(1, 1);
        
        String res = cp1.getPolarRepresentation();
        
        assertEquals("complexCartesianToPolarRepresentationTest failed.", true, res.equals("( +1.4142135623730951, 0.7853981633974483 )"));
    }
    
    @Test
    public void complexPolarToCartesianRepresentationTest(){
        ComplexNumber cp1;
        
        cp1 = new ComplexNumber(1, 1);
        
        ComplexNumber res = ComplexOperation.complexNumberPolarToCartesianRepresentation(1.414213562, 0.785398163);
        
        assertEquals("complexPolarToCartesianRepresentationTest failed.", true, res.equals(new ComplexNumber(1.0000000001336302, 0.9999999993387337)));
    }
    
    @Test
    public void complexPhaseTest(){
        ComplexNumber cp1;
        
        cp1 = new ComplexNumber(1, 1);
        
        String res = cp1.getPolarRepresentation();
        
        assertEquals("complexPhaseTest failed.", true, res.equals("( +1.4142135623730951, 0.7853981633974483 )"));
    }
    
    @Test
    public void complexVectorAditionTest(){
        ComplexVector cv1;
        ComplexVector cv2;
        ComplexVector expected;
        
        cv1 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(6, -4));
        cv1.addComplexNumber(new ComplexNumber(7, 3));
        cv1.addComplexNumber(new ComplexNumber(4.2, -8.1));
        cv1.addComplexNumber(new ComplexNumber(0, -3));
        
        cv2 = new ComplexVector();
        
        cv2.addComplexNumber(new ComplexNumber(16, 2.3));
        cv2.addComplexNumber(new ComplexNumber(0, -7));
        cv2.addComplexNumber(new ComplexNumber(6, 0));
        cv2.addComplexNumber(new ComplexNumber(0, -4));
        
        expected = new ComplexVector();
        
        expected.addComplexNumber(new ComplexNumber(22, -1.7));
        expected.addComplexNumber(new ComplexNumber(7, -4));
        expected.addComplexNumber(new ComplexNumber(10.2, -8.1));
        expected.addComplexNumber(new ComplexNumber(0, -7));
        
        ComplexVector res = ComplexOperation.complexVectorSum(cv1, cv2);
        
        //System.err.println(res);
        
        assertEquals("complexVectorAditionTest failed.", true, res.equals(expected));
    }
    
    @Test
    public void complexVectorByComplexScalarTest(){
        ComplexVector cv1;
        ComplexNumber scalar;
        ComplexVector expected;
        
        cv1 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(6, 3));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(5, 1));
        cv1.addComplexNumber(new ComplexNumber(4, 0));
        
        scalar = new ComplexNumber(3, 2);
        
        expected = new ComplexVector();
        
        expected.addComplexNumber(new ComplexNumber(12, 21));
        expected.addComplexNumber(new ComplexNumber(0, 0));
        expected.addComplexNumber(new ComplexNumber(13,13));
        expected.addComplexNumber(new ComplexNumber(12, 8));
        
        ComplexVector res = ComplexOperation.complexVectorByScalar(cv1, scalar);
        
        System.err.println("Res:\n"+res);
        System.err.println("Expected:\n"+expected);
        
        assertEquals("complexVectorByComplexScalarTest failed.", true, res.equals(expected));
    }
    
    @Test
    public void complexVectorByRealScalarTest(){
        ComplexVector cv1;
        double scalar;
        ComplexVector expected;
        
        cv1 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(6, 3));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(5, 1));
        cv1.addComplexNumber(new ComplexNumber(4, 0));
        
        scalar = 4;
        
        expected = new ComplexVector();
        
        expected.addComplexNumber(new ComplexNumber(24, 12));
        expected.addComplexNumber(new ComplexNumber(0, 0));
        expected.addComplexNumber(new ComplexNumber(20,4));
        expected.addComplexNumber(new ComplexNumber(16, 0));
        
        ComplexVector res = ComplexOperation.complexVectorByScalar(cv1, scalar);
        
        //System.err.println(res);
        
        assertEquals("complexVectorByRealScalarTest failed.", true, res.equals(expected));
        
    }
    
    @Test
    public void compexMatrixAdition() {
        ComplexVector cv1;
        ComplexVector cv2;
        
        ComplexMatrix cmx1;
        ComplexMatrix cmx2;
        ComplexMatrix expected;
        
        cmx1 = new ComplexMatrix();
        cmx2 = new ComplexMatrix();
        expected = new ComplexMatrix();
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(6, 3));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(5, 1));
        cv1.addComplexNumber(new ComplexNumber(4, 0));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(6, -4));
        cv1.addComplexNumber(new ComplexNumber(7, 3));
        cv1.addComplexNumber(new ComplexNumber(4.2, -8.1));
        cv1.addComplexNumber(new ComplexNumber(0, -3));
        cmx1.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(4, -6));
        cv1.addComplexNumber(new ComplexNumber(9, 1));
        cv1.addComplexNumber(new ComplexNumber(2.2, -10.1));
        cv1.addComplexNumber(new ComplexNumber(2, -1));
        cmx1.addComplexEntry(cv1);
        
        //---------
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(1, 5));
        cv1.addComplexNumber(new ComplexNumber(3, 7));
        cv1.addComplexNumber(new ComplexNumber(36, 6));
        cv1.addComplexNumber(new ComplexNumber(4, 9));
        cmx2.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(2, 10));
        cv1.addComplexNumber(new ComplexNumber(4, -6));
        cv1.addComplexNumber(new ComplexNumber(-4.2, 11));
        cv1.addComplexNumber(new ComplexNumber(7, 3));
        cmx2.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(9, -1));
        cv1.addComplexNumber(new ComplexNumber(-9, 1));
        cv1.addComplexNumber(new ComplexNumber(5.3, 4));
        cv1.addComplexNumber(new ComplexNumber(-2, 3));
        cmx2.addComplexEntry(cv1);
        
        //---------
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(7, 8));
        cv1.addComplexNumber(new ComplexNumber(3, 7));
        cv1.addComplexNumber(new ComplexNumber(41, 7));
        cv1.addComplexNumber(new ComplexNumber(8, 9));
        expected.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(8, 6));
        cv1.addComplexNumber(new ComplexNumber(11, -3));
        cv1.addComplexNumber(new ComplexNumber(0, 2.9));
        cv1.addComplexNumber(new ComplexNumber(7, 0));
        expected.addComplexEntry(cv1);
        
        cv1 = new ComplexVector();
        cv1.addComplexNumber(new ComplexNumber(13, -7));
        cv1.addComplexNumber(new ComplexNumber(0, 2));
        cv1.addComplexNumber(new ComplexNumber(7.5, -6.1));
        cv1.addComplexNumber(new ComplexNumber(0, 2));
        expected.addComplexEntry(cv1);
        
        
        
        ComplexMatrix res = ComplexOperation.complexMatrixSum(cmx1, cmx2);
        
        assertTrue("compexMatrixAdition failed.", res.equals(expected));
    }
}
