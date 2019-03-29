/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumberslibrary;

/**
 *
 * @author Fabian Ardila
 */
public class QuantumSystemParticleInLine {
    
    public QuantumSystemParticleInLine() {}
    
    public static double particleLikelihoodAtPoint(ComplexVector v, int pnt) {
        double norm = ComplexOperation.complexVectorNorm(v);
        double modulus = ComplexOperation.complexNumberModulus(v.getVector().get(pnt));
        
        return (double)Math.round((Math.pow(modulus, 2) / Math.pow(norm, 2)) * 10000d) / 10000d;
    }
    
    public static ComplexNumber amplitudeOfTransition(ComplexVector v1, ComplexVector v2) {
        ComplexNumber innerProduct = ComplexOperation.innerProduct(v1, v2);
        
        double normVector1 = ComplexOperation.complexVectorNorm(v1);
        double normVector2 = ComplexOperation.complexVectorNorm(v2);
        
        double divider = normVector1*normVector2;
        
        return new ComplexNumber(innerProduct.getRealPart()/divider, innerProduct.getImaginaryPart()/divider);
    }
    
}
