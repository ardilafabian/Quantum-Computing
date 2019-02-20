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
    
    public ComplexNumber complexNumberMultiplication(ComplexNumber cn1, ComplexNumber cn2) {
        
        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();
        
        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();
        
        double resultRp = (rp1*rp2) - (ip1*ip2); 
        double resultIp = (rp1*ip2) + (rp2*ip1);
        
        return new ComplexNumber(resultRp, resultIp);
        
    }
    
    public ComplexNumber complexNumberRest(ComplexNumber cn1, ComplexNumber cn2) {
        
        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();
        
        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();
        
        double resultRp = rp1 - rp2; 
        double resultIp = ip1 - ip2;
        
        return new ComplexNumber(resultRp, resultIp);
    }
    
    public ComplexNumber complexNumberDivision(ComplexNumber cn1, ComplexNumber cn2) {
        
        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();
        
        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();
        
        double resultRp = ((rp1 * rp2) + (ip1 * ip2)) / (Math.pow(rp2, 2) + Math.pow(ip2, 2)); 
        double resultIp = ((rp2 * ip1) - (rp1 * ip2)) / (Math.pow(rp2, 2) + Math.pow(ip2, 2));
        
        return new ComplexNumber(resultRp, resultIp);
        
    }
    
    public double complexNumberModulus(ComplexNumber cn) {
        
        double rp = cn.getRealPart();
        double ip = cn.getImaginaryPart();
        
        return Math.sqrt((Math.pow(rp, 2) + Math.pow(ip, 2)));
        
    }
    
    public ComplexNumber complexNumberConjugation(ComplexNumber cn) {
        
        double rp = cn.getRealPart();
        double ip = cn.getImaginaryPart();
        
        return new ComplexNumber(rp, ip * -1);
        
    }
    
    public ComplexNumber complexNumberPolarToCartesianRepresentation(double rho, double theta) {
        
        double rp = rho * Math.cos(theta);
        double ip = rho * Math.sin(theta);
        
        return new ComplexNumber(rp, ip);
        
    }
    
}
