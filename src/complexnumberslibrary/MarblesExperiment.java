/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumberslibrary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabian Ardila
 */
public class MarblesExperiment {
    
    ComplexMatrix adjacencyMatrix;
    ComplexVector currentSate;
    int clicks;
    
    public MarblesExperiment(ComplexMatrix adjacencyMatrix, ComplexVector currentSate, int clicks) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.currentSate = currentSate;
        this.clicks = clicks;
    }
    
    public ComplexVector getNewState() {
        
        return null;
    }

    public ComplexMatrix getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(ComplexMatrix adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public ComplexVector getCurrentSate() {
        return currentSate;
    }

    public void setCurrentSate(ComplexVector currentSate) {
        this.currentSate = currentSate;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
    
}
