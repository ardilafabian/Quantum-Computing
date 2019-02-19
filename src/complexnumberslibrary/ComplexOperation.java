/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumberslibrary;

/**
 *
 * @author Fabian Ardila
 * 
 * rp = real part
 * ip = imaginary part
 * 
 * cn = complex number
 * 
 */
public class ComplexOperation {
    
    public ComplexNumber complexNumberSum(ComplexNumber cn1, ComplexNumber cn2) {
        
        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();
        
        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();
        
        double resultRp = rp1 + rp2;
        double resultIp = ip1 + ip2;
        
        return new ComplexNumber(resultRp, resultIp);
        
    }
    
}
