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
    
    static ComplexMatrix adjacencyMatrix;
    static ComplexVector currentState;
    static int clicks;
    
    public MarblesExperiment(ComplexMatrix adjacencyMatrix, ComplexVector currentSate, int clicks) {
        this.adjacencyMatrix = adjacencyMatrix;
        this.currentState = currentSate;
        this.clicks = clicks;
    }
    
    public static ComplexVector getNewState() throws Exception {
        if (adjacencyMatrix.getMatrix().size() != adjacencyMatrix.getMatrix().get(0).getVector().size()) throw new Exception("Size Does not match!");
        for (int i = 0; i < clicks; i++) {
            ComplexVector res = ComplexOperation.action(adjacencyMatrix, currentState);
            currentState = res;
        }
        return currentState;
    }

    public static ComplexMatrix getAdjacencyMatrix() {
        return adjacencyMatrix;
    }

    public static void setAdjacencyMatrix(ComplexMatrix adjacencyMatrix) {
        MarblesExperiment.adjacencyMatrix = adjacencyMatrix;
    }

    public static ComplexVector getCurrentState() {
        return currentState;
    }

    public static void setCurrentState(ComplexVector currentState) {
        MarblesExperiment.currentState = currentState;
    }

    public static int getClicks() {
        return clicks;
    }

    public static void setClicks(int clicks) {
        MarblesExperiment.clicks = clicks;
    }
    
}
