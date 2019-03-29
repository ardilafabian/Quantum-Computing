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
public class Observable {
    
    public static ComplexNumber ObservableAverage(ComplexVector ket, ComplexMatrix observable) throws Exception {
        ComplexVector temp = ComplexOperation.action(observable, ket);
        
//        System.err.println("Action: \n" + temp);
        
        ComplexVector bra = ComplexOperation.complexVectorConjugation(temp);
        
        ComplexNumber res = ComplexOperation.innerProduct(bra, ket);
//        System.err.println("Bra:\n" + bra);
//        System.err.println("ket:\n" + ket);
//        System.err.println("After Inner product:" + res);
        
        return res;
    }
    
}
