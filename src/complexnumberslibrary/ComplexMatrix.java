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
public class ComplexMatrix {
    
    private List<ComplexVector> matrix = new ArrayList<ComplexVector>();
    
    public ComplexMatrix() {}
    
    public List<ComplexVector> getMatrix() {
        return matrix;
    }
    
    public void addComplexEntry(ComplexVector cv) {
        
        matrix.add(cv);
        
    }

    @Override
    public String toString() {
        
        String result = "";
        
        for (int i = 0; i < matrix.size(); i++) {
            
            if (i != 0) {
                result += "\n";
            }
            
            result += matrix.get(i).toStringForMatrix();
            
        }
        
        return result;
    }
    
}
