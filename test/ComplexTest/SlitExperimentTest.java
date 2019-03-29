/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexTest;

import complexnumberslibrary.SlitExperiment;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Fabian Ardila
 */
public class SlitExperimentTest {

    public SlitExperimentTest() {
    }

    @BeforeClass
    public static void setUpClass() {}

    @Test
    public void multipleClassicProbabilisticSlitsTest() throws Exception {
        ArrayList<Double> probs = new ArrayList<>();
        probs.add(0.3333);
        probs.add(0.3333);
        probs.add(0.3333);
        probs.add(0.3333);
        probs.add(0.3333);
        probs.add(0.3333);
        
        int slist = 2;
        int targets = 6;
        
        ArrayList<Double> vectorState = new ArrayList<>();
        vectorState.add(1.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        vectorState.add(0.0);
        
        ArrayList<Object> results = SlitExperiment.multipleClassicProbabilisticSlits(slist, targets, probs, vectorState);
        
        ArrayList<Double> expected = new ArrayList<>();
        expected.add(0.0);
        expected.add(0.0);
        expected.add(0.0);
        expected.add(0.16665);
        expected.add(0.16665);
        expected.add(0.3333);
        expected.add(0.16665);
        expected.add(0.16665);
        
        assertEquals("multipleClassicProbabilisticSlitsTest failed.", true , results.get(1).equals(expected));
    }
}
