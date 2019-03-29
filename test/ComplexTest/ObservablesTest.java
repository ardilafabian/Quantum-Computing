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
public class ObservablesTest {
    
    public ObservablesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {}
    
    @Test
    public void ObservableAverageTest() throws Exception {
        ComplexVector ket = new ComplexVector();
        ComplexMatrix observable = new ComplexMatrix();
        ComplexVector v1 = new ComplexVector();
        
        ket.addComplexNumber(new ComplexNumber(0.707106781, 0));
        ket.addComplexNumber(new ComplexNumber(0, 0.707106781));
        
        v1.addComplexNumber(new ComplexNumber(1, 0));
        v1.addComplexNumber(new ComplexNumber(0, -1));
        observable.addComplexEntry(v1);
        
        v1 = new ComplexVector();
        v1.addComplexNumber(new ComplexNumber(0, 1));
        v1.addComplexNumber(new ComplexNumber(2, 0));
        observable.addComplexEntry(v1);
//        System.err.println("KET ->>> \n" + ket);
//        System.err.println("Observable ->>> \n" + observable);
        ComplexNumber res = Observable.ObservableAverage(ket, observable);
        
        assertEquals("ObservableAverageTest failed.", true, res.equals(new ComplexNumber(2.5, 0)));
    }
}
