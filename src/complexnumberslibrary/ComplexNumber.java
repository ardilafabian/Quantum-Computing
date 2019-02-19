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
public class ComplexNumber {
    
    private double realPart;
    private double imaginaryPart;
    
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }
    
    @Override
    public String toString() {
        
        String number = "";
        boolean flag = true;
        
        if (imaginaryPart == 0) {
            flag = false;
        } else if (flag && imaginaryPart == 1) {
            flag = false;
            number += " + i";
        } else if (flag && imaginaryPart == -1) {
            flag = false;
            number += " - i";
        } else if (flag && imaginaryPart > 0) {
            number += " + " + imaginaryPart + "i";
        } else if (flag && imaginaryPart < 0) {
            number += " - " + imaginaryPart + "i";
        }
        
        return number;
    }
}
