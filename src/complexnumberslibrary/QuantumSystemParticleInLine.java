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
    
    ComplexOperation operation;
    
    public QuantumSystemParticleInLine() {
        operation = new ComplexOperation();
    }
    
    public double particleLikelihoodAtPoint(ComplexVector v, int pnt) {
        double norm = operation.complexVectorNorm(v);
        double modulus = operation.complexNumberModulus(v.getVector().get(pnt));
        
        return Math.pow(modulus, 2) / Math.pow(norm, 2);
    }
    
    public ComplexNumber amplitudeOfTransition(ComplexVector v1, ComplexVector v2) {
        ComplexNumber innerProduct = operation.innerProduct(v1, v2);
        
        double normVector1 = operation.complexVectorNorm(v1);
        double normVector2 = operation.complexVectorNorm(v2);
        
        double divider = normVector1*normVector2;
        
        return new ComplexNumber(innerProduct.getRealPart()/divider, innerProduct.getImaginaryPart()/divider);
    }
    
}
