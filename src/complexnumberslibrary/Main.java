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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComplexOperation op = new ComplexOperation();
        
        ComplexNumber cp1;
        ComplexNumber cp2;
        
        ComplexVector cv1;
        ComplexVector cv2;
        
        ComplexNumber scalar;
        double scalar2;
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(3, -1);
        cp2 = new ComplexNumber(1, 4);
        
        System.out.println("--- Test Case 1: ---\n     c1  = " + cp1 + "\n     c2 = " + cp2 + "\n\n");
        
        System.out.println("Sum: c1 + c2 = " + op.complexNumberSum(cp1, cp2) + "\n");
        System.out.println("Multiplication: c1 + c2 = " + op.complexNumberMultiplication(cp1, cp2) + "\n");
        System.out.println("Rest: c1 + c2 = " + op.complexNumberRest(cp1, cp2) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(-2, 1);
        cp2 = new ComplexNumber(1, 2);
        
        System.out.println("--- Test Case 2: ---\n     c1  = " + cp1 + "\n     c2 = " + cp2 + "\n\n");
        
        System.out.println("Division: c1 + c2 = " + op.complexNumberDivision(cp1, cp2) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(1, -1);
        
        System.out.println("--- Test Case 3: ---\n     c  = " + cp1 + "\n\n");
        
        System.out.println("Modulus: |c| = " + op.complexNumberModulus(cp1) + "\n");
        System.out.println("Conjugation: c = " + op.complexNumberConjugation(cp1) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(1, 1);
        
        System.out.println("--- Test Case 4: ---\n     c  = " + cp1 + "\n\n");
        
        System.out.println("Cartesian to Polar representation: " + cp1 + " -> " + cp1.getPolarRepresentation() + "\n");
        System.out.println("Polar to Cartesian representation: ( 1.414213562 , 0.785398163 )" + 
                            " -> " + op.complexNumberPolarToCartesianRepresentation(1.414213562, 0.785398163) + "\n");
        System.out.println("Phase of c: " + cp1.getPolarRepresentation() + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cv1 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(6, -4));
        cv1.addComplexNumber(new ComplexNumber(7, 3));
        cv1.addComplexNumber(new ComplexNumber(4.2, -8.1));
        cv1.addComplexNumber(new ComplexNumber(0, -3));
        
        cv2 = new ComplexVector();
        
        cv2.addComplexNumber(new ComplexNumber(16, 2.3));
        cv2.addComplexNumber(new ComplexNumber(0, -7));
        cv2.addComplexNumber(new ComplexNumber(6, 0));
        cv2.addComplexNumber(new ComplexNumber(0, -4));
        
        System.out.println("--- Test Case 5: ---\n     V  = \n" + cv1 + "\n     W = \n" + cv2 + "\n\n");
        
        System.out.println("Vector Sum: V + W -> \n" + op.complexVectorSum(cv1, cv2) + "\n\n");
        System.out.println("Vector Inverse: -V -> \n" + op.complexVectorInverse(cv1) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cv1 = new ComplexVector();
        
        cv1.addComplexNumber(new ComplexNumber(6, 3));
        cv1.addComplexNumber(new ComplexNumber(0, 0));
        cv1.addComplexNumber(new ComplexNumber(5, 1));
        cv1.addComplexNumber(new ComplexNumber(4, 0));
        
        scalar = new ComplexNumber(3, 2);
        scalar2 = 4;
        
        System.out.println("--- Test Case 6: ---\n     Saclar #1 = " + scalar + "\n"
                            + "     Scalar #2 = " + scalar2 + "\n     V  = \n" + cv1 + "\n\n");
        
        System.out.println("Vecor by scalalr #1: c x V[j] ->\n" +op.complexVectorByScalar(cv1, scalar));
        System.out.println("Vecor by scalalr #2: n x V[j] ->\n" +op.complexVectorByScalar(cv1, scalar2));
        
    }
    
}
