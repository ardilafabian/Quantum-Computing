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
public class ComplexVector {
    
    private List<ComplexNumber> vector = new ArrayList<ComplexNumber>();
    
    public ComplexVector() {}
    
    public void addComplexNumber(ComplexNumber cn) {
        vector.add(cn);
    }    
    
}
