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
 * rp = real part ip = imaginary part
 *
 * cn = complex number
 *
 */
public class ComplexOperation {

    public static ComplexNumber complexNumberSum(ComplexNumber cn1, ComplexNumber cn2) {

        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();

        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();

        double resultRp = (double)Math.round((rp1 + rp2) * 100d) / 100d;
        double resultIp = (double)Math.round((ip1 + ip2) * 100d) / 100d;

        return new ComplexNumber(resultRp, resultIp);

    }

    public static ComplexNumber complexNumberMultiplication(ComplexNumber cn1, ComplexNumber cn2) {

        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();

        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();

        double resultRp = 0;
        double resultIp = 0;
        if (rp1 != 0 && rp2!=0 && ip1!=0 && ip2!=0) {
            resultRp = (rp1 * rp2) - (ip1 * ip2);
            resultIp = (rp1 * ip2) + (rp2 * ip1);
        } else if (rp1==0 && rp2==0 && ip1!=0 && ip2!=0) {
            resultRp = -1 * ip1 * ip2;
        } else if (rp1!=0 && rp2!=0 && ip1==0 && ip2==0) {
            resultRp = rp1 * rp2;
        } else if (rp1!=0 && rp2==0 && ip1==0 && ip2!=0) {
            resultIp = rp1 * ip2;
        } else if (rp1==0 && rp2!=0 && ip1!=0 && ip2==0) {
            resultIp = rp2 * ip1;
        }
        
        ComplexNumber res = new ComplexNumber(resultRp, resultIp);
        
        //System.out.println("Mult: "+cn1+" x " + cn2 + " = " + res);

        return res;

    }

    public static ComplexNumber complexNumberRest(ComplexNumber cn1, ComplexNumber cn2) {

        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();

        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();

        double resultRp = rp1 - rp2;
        double resultIp = ip1 - ip2;

        return new ComplexNumber(resultRp, resultIp);
    }

    public static ComplexNumber complexNumberDivision(ComplexNumber cn1, ComplexNumber cn2) {

        double rp1 = cn1.getRealPart();
        double ip1 = cn1.getImaginaryPart();

        double rp2 = cn2.getRealPart();
        double ip2 = cn2.getImaginaryPart();

        double resultRp = ((rp1 * rp2) + (ip1 * ip2)) / (Math.pow(rp2, 2) + Math.pow(ip2, 2));
        double resultIp = ((rp2 * ip1) - (rp1 * ip2)) / (Math.pow(rp2, 2) + Math.pow(ip2, 2));

        return new ComplexNumber(resultRp, resultIp);

    }

    public static double complexNumberModulus(ComplexNumber cn) {

        double rp = cn.getRealPart();
        double ip = cn.getImaginaryPart();

        return Math.sqrt((Math.pow(rp, 2) + Math.pow(ip, 2)));

    }

    public static ComplexNumber complexNumberConjugation(ComplexNumber cn) {

        double rp = cn.getRealPart();
        double ip = cn.getImaginaryPart();

        return new ComplexNumber(rp, ip * -1);

    }
    
    public static ComplexVector complexVectorConjugation(ComplexVector cv) {
        int len = cv.getVector().size();
        
        ComplexNumber temp;
        for (int i = 0; i < len; i++) {
            temp = cv.getVector().get(i);
            temp = ComplexOperation.complexNumberConjugation(temp);
            cv.getVector().set(i, temp);
        }
        
        return cv;
    }

    public static ComplexNumber complexNumberPolarToCartesianRepresentation(double rho, double theta) {

        double rp = rho * Math.cos(theta);
        double ip = rho * Math.sin(theta);

        return new ComplexNumber(rp, ip);

    }

    public static ComplexVector complexVectorSum(ComplexVector cv1, ComplexVector cv2) {

        ComplexVector cvResult = new ComplexVector();
        ComplexNumber cn1;
        ComplexNumber cn2;

        if (cv1.getVector().size() != cv2.getVector().size()) {
            System.err.println("It's not possible to sum vector with different leght.");
        } else {
            for (int i = 0; i < cv1.getVector().size(); i++) {
                cn1 = cv1.getVector().get(i);
                cn2 = cv2.getVector().get(i);
                cvResult.addComplexNumber(ComplexOperation.complexNumberSum(cn1, cn2));
            }
        }

        return cvResult;

    }

    public static ComplexVector complexVectorByScalar(ComplexVector cv, ComplexNumber scalar) {

        ComplexVector cvResult = new ComplexVector();

        for (ComplexNumber complexNumber : cv.getVector()) {
            cvResult.addComplexNumber(ComplexOperation.complexNumberMultiplication(complexNumber, scalar));
        }

        return cvResult;

    }

    public static double complexVectorNorm(ComplexVector v) {
        double res = 0;
        for (int i = 0; i < v.getVector().size(); i++) {
            res = res + (v.getVector().get(i).getRealPart() * v.getVector().get(i).getRealPart()) + (v.getVector().get(i).getImaginaryPart()* v.getVector().get(i).getImaginaryPart());
        }
        return Math.sqrt(res);
    }

    public static ComplexVector complexVectorByScalar(ComplexVector cv, double scalar) {

        ComplexNumber complexScalar = new ComplexNumber(scalar, 0);

        return ComplexOperation.complexVectorByScalar(cv, complexScalar);

    }

    public static ComplexVector complexVectorInverse(ComplexVector cv) {

        return ComplexOperation.complexVectorByScalar(cv, -1);

    }

    public static ComplexMatrix complexMatrixSum(ComplexMatrix cmx1, ComplexMatrix cmx2) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        if (cmx1.getMatrix().size() != cmx2.getMatrix().size()) {
            System.err.println("It's not possible to sum vector with different leght.");
        } else {

            for (int i = 0; i < cmx1.getMatrix().size(); i++) {
                cmxResult.addComplexEntry(
                        ComplexOperation.complexVectorSum(cmx1.getMatrix().get(i), cmx2.getMatrix().get(i)));
            }

        }

        return cmxResult;

    }

    public static ComplexMatrix complexMatrixInverse(ComplexMatrix cmx) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        for (int i = 0; i < cmx.getMatrix().size(); i++) {
            cmxResult.addComplexEntry(ComplexOperation.complexVectorInverse(cmx.getMatrix().get(i)));
        }

        return cmxResult;

    }

    public static ComplexMatrix complexMatrixByScalar(ComplexMatrix cmx, ComplexNumber cn) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        for (int i = 0; i < cmx.getMatrix().size(); i++) {
            cmxResult.addComplexEntry(ComplexOperation.complexVectorByScalar(cmx.getMatrix().get(i), cn));
        }

        return cmxResult;

    }

    public static ComplexMatrix complexMatrixByScalar(ComplexMatrix cmx, double cn) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        for (int i = 0; i < cmx.getMatrix().size(); i++) {
            cmxResult.addComplexEntry(ComplexOperation.complexVectorByScalar(cmx.getMatrix().get(i), cn));
        }

        return cmxResult;

    }

    public static ComplexMatrix complexMatrixMultiplication(ComplexMatrix cmx1, ComplexMatrix cmx2) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        if (cmx1.getMatrix().get(0).getVector().size() != cmx2.getMatrix().size()) {
            System.err.println("Matrices length are not equal, it is not possible to multiply.");
        } else {
            for (int i = 0; i < cmx1.getMatrix().size(); i++) {
                ComplexVector cvEntry = new ComplexVector();
                for (int k = 0; k < cmx1.getMatrix().get(i).getVector().size(); k++) {
                    ComplexNumber cn = new ComplexNumber(0, 0);
                    for (int j = 0; j < cmx1.getMatrix().get(i).getVector().size(); j++) {

                        ComplexNumber cn1 = cmx1.getMatrix().get(i).getVector().get(j);
                        ComplexNumber cn2 = cmx2.getMatrix().get(j).getVector().get(k);

                        cn = ComplexOperation.complexNumberSum(cn, ComplexOperation.complexNumberMultiplication(cn1, cn2));
                    }
                    cvEntry.addComplexNumber(cn);
                }
                cmxResult.addComplexEntry(cvEntry);
            }
        }

        return cmxResult;

    }

    public static ComplexVector action(ComplexMatrix m, ComplexVector v) throws Exception {
        if (m.getMatrix().get(0).getVector().size() != v.getVector().size()) {
            throw new Exception("Can not get the action when sizes do not match");
        }

        ComplexVector res = new ComplexVector();
        int rows = m.getMatrix().size();

        for (int i = 0; i < rows; i++) {
            ComplexNumber temp = new ComplexNumber(0, 0);
            for (int j = 0; j < v.getVector().size(); j++) {
                temp = complexNumberSum(temp, complexNumberMultiplication(m.getMatrix().get(i).getVector().get(j), v.getVector().get(j)));
            }
            res.addComplexNumber(temp);
        }
        return res;
    }

    public static ComplexNumber innerProduct(ComplexVector cv1, ComplexVector cv2) {

        ComplexNumber result = new ComplexNumber(0, 0);

        if (cv1.getVector().size() != cv2.getVector().size()) {
            System.err.println("Vectors length are not equal, it is not possible to gte Inner Product.");
        } else {
            for (int i = 0; i < cv1.getVector().size(); i++) {
                ComplexNumber resultMultiplication = ComplexOperation.complexNumberMultiplication(cv1.getVector().get(i), cv2.getVector().get(i));
                result = ComplexOperation.complexNumberSum(result, resultMultiplication);
                //System.err.println("Suuum: " + result);
            }
        }

        return result;

    }

    //TODO: finish!
    public static ComplexMatrix complexTensorProduct(ComplexMatrix cmx1, ComplexMatrix cmx2) {

        ComplexMatrix cmxResult = new ComplexMatrix();

        for (int i = 0; i < cmx1.getMatrix().size(); i++) {
            for (int j = 0; j < cmx1.getMatrix().get(i).getVector().size(); j++) {
                for (int k = 0; k < cmx2.getMatrix().size(); k++) {
                    for (int l = 0; l < cmx2.getMatrix().size(); l++) {

                    }
                }
            }
        }

        return cmxResult;

    }

}
