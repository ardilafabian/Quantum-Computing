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
        
        cp1 = new ComplexNumber(3, -1);
        cp2 = new ComplexNumber(1, 4);
        
        System.out.println("--- Test Case 1: ---\n     c1  = " + cp1 + "\n     c2 = " + cp2 + "\n\n");
        
        System.out.println("Sum -> c1 + c2 = " + op.complexNumberSum(cp1, cp2) + "\n");
        System.out.println("Multiplication -> c1 + c2 = " + op.complexNumberMultiplication(cp1, cp2) + "\n");
        System.out.println("Rest -> c1 + c2 = " + op.complexNumberRest(cp1, cp2) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(-2, 1);
        cp2 = new ComplexNumber(1, 2);
        
        System.out.println("--- Test Case 2: ---\n     c1  = " + cp1 + "\n     c2 = " + cp2 + "\n\n");
        
        System.out.println("Division -> c1 + c2 = " + op.complexNumberDivision(cp1, cp2) + "\n\n");
        
        /*-------------------------------------------------------------------------*/
        
        cp1 = new ComplexNumber(1, -1);
        
        System.out.println("--- Test Case 3: ---\n     c  = " + cp1 + "\n\n");
        
        System.out.println("Modulus -> |c| = " + op.complexNumberModulus(cp1) + "\n");
        System.out.println("Conjugation -> c = " + op.complexNumberConjugation(cp1) + "\n\n");
        
    }
    
}
