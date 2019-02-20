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
    
    public List<ComplexNumber> getVector() {
        return vector;
    }
    
    public void addComplexNumber(ComplexNumber cn) {
        vector.add(cn);
    }

    @Override
    public String toString() {
        
        String result = "";
        
        for (int i = 0; i < vector.size(); i++) {
            if (i == 0) {
                result += "[ " + vector.get(i) + " ]";
            } else {
                result += "\n[ " + vector.get(i) + " ]";
            }
        }
        
        return result;
    }
    
}
