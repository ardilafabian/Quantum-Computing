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
    
    public String getPolarRepresentation() {
        
        /* p -> rho */
        double rho = Math.sqrt( Math.pow(realPart, 2) + Math.pow(imaginaryPart, 2));
        double theta = Math.atan(imaginaryPart / realPart);
        
        return "( +" + rho + ", " + theta + " )";
        
    }
    
    public double getPhase() {
        return Math.atan(imaginaryPart / realPart);
    }
    
    @Override
    public String toString() {
        
        String number = "";
        boolean flag = true;
        boolean iflag  = true;
        
        if (realPart == 0) {
            flag = false;
            if (imaginaryPart == 0) {
                iflag = false;
                number += "0";
            } else if (iflag && imaginaryPart == -1) {
                iflag = false;
                number += "-i";
            } else if (iflag && imaginaryPart == 1) {
                iflag = false;
                number += "i";                
            } else if (iflag && imaginaryPart > 0) {
                iflag = false;
                number += imaginaryPart + "i";
            } else if (iflag && imaginaryPart < 0) {
                iflag = false;
                number += imaginaryPart + "i";
            }
        } else if (flag && imaginaryPart == 0) {
            flag = false;
            number += realPart;
        } else if (flag && imaginaryPart == 1) {
            flag = false;
            number += realPart + " + i";
        } else if (flag && imaginaryPart == -1) {
            flag = false;
            number += realPart + " - i";
        } else if (flag && imaginaryPart > 0) {
            number += realPart + " + " + imaginaryPart + "i";
        } else if (flag && imaginaryPart < 0) {
            number += realPart + " " + imaginaryPart + "i";
        }
        
        return number;
    }
}
