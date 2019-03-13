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
    ComplexVector currentState;
    int clicks;
    ComplexOperation operation;
    
    public MarblesExperiment(ComplexMatrix adjacencyMatrix, ComplexVector currentSate, int clicks) {
        operation = new ComplexOperation();
        this.adjacencyMatrix = adjacencyMatrix;
        this.currentState = currentSate;
        this.clicks = clicks;
    }
    
    public ComplexVector getNewState() throws Exception {
        if (adjacencyMatrix.getMatrix().size() != adjacencyMatrix.getMatrix().get(0).getVector().size()) throw new Exception("Size Does not match!");
        for (int i = 0; i < clicks; i++) {
            ComplexVector res = operation.action(adjacencyMatrix, currentState);
            currentState = res;
        }
        return currentState;
    }

    public ComplexMatrix getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public void setAdjacencyMatrix(ComplexMatrix adjacencyMatrix) {
        this.adjacencyMatrix = adjacencyMatrix;
    }

    public ComplexVector getCurrentState() {
        return currentState;
    }

    public void setCurrentState(ComplexVector currentState) {
        this.currentState = currentState;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }
    
}
