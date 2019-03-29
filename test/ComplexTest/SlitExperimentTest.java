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
        
        ArrayList<Double> vector = new ArrayList<>();
        vector.add(1.0);
        vector.add(0.0);
        vector.add(0.0);
        vector.add(0.0);
        vector.add(0.0);
        vector.add(0.0);
        vector.add(0.0);
        vector.add(0.0);
        
        ArrayList<Object> results = SlitExperiment.multipleClassicProbabilisticSlits(slist, targets, probs, vector);
        
        ArrayList<ArrayList<Double>> m = (ArrayList<ArrayList<Double>>) results.get(0);
        
        System.err.println("\nVector: " + results.get(1));
    }
}
