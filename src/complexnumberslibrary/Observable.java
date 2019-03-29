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
    
    private static ComplexMatrix buildIdentity(ComplexNumber avg, int len) {
        ComplexMatrix res = new ComplexMatrix();
        ComplexVector cv;
        ComplexNumber cn;
        
        for (int i = 0; i < len; i++) {
            cv = new ComplexVector();
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    cn = avg;
                } else {
                    cn = new ComplexNumber(0, 0);
                }
                cv.addComplexNumber(cn);
            }
            res.addComplexEntry(cv);
        }
        
        return res;
    }
    
    public static ComplexNumber observableAverage(ComplexVector ket, ComplexMatrix observable) throws Exception {
        ComplexVector temp = ComplexOperation.action(observable, ket);
        
        ComplexVector bra = ComplexOperation.complexVectorConjugation(temp);
        
        ComplexNumber res = ComplexOperation.innerProduct(bra, ket);
        
        return res;
    }
    
    public static ComplexNumber observableVariance(ComplexVector ket, ComplexMatrix observable) throws Exception {
        ComplexNumber avg = Observable.observableAverage(ket, observable);
        ComplexMatrix identity = Observable.buildIdentity(avg, observable.getMatrix().size());
        
        ComplexMatrix mu = ComplexOperation.complexMatrixRest(observable, identity);
        
        ComplexMatrix mu2 = ComplexOperation.complexMatrixMultiplication(mu, mu);

        ComplexVector temp = ComplexOperation.action(mu2, ket);
        
        ComplexNumber res = ComplexOperation.innerProduct(ComplexOperation.complexVectorConjugation(ket), temp);
        
        return res;
    }
    
}
