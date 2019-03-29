/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexnumberslibrary;

import java.util.ArrayList;

/**
 *
 * @author Fabian Ardila
 */
public class SlitExperiment {

    private static ArrayList<ArrayList<Double>> doubleMatrixMult(ArrayList<ArrayList<Double>> m1, ArrayList<ArrayList<Double>> m2) {
        ArrayList<ArrayList<Double>> res = new ArrayList();

        for (int k = 0; k < m1.size(); k++) {
            ArrayList<Double> vector = new ArrayList();
            for (int i = 0; i < m2.size(); i++) {
                Double temp = 0.0;
                for (int j = 0; j < m1.size(); j++) {
                    temp = temp + (m1.get(k).get(j) * m2.get(j).get(i));
                }
                //System.out.println(temp);
                vector.add(temp);

            }
            res.add(vector);
        }
        return res;
    }

    private static ArrayList<Double> action(ArrayList<ArrayList<Double>> m, ArrayList<Double> v) throws Exception {
        if (m.get(0).size() != v.size()) {
            throw new Exception("Can not get the action when sizes do not match");
        }

        ArrayList<Double> res = new ArrayList();
        int rows = m.size();

        for (int i = 0; i < rows; i++) {
            Double temp = 0.0;
            for (int j = 0; j < v.size(); j++) {
                temp += m.get(i).get(j) * v.get(j);
            }
            res.add(temp);
        }
        return res;
    }

    private static ArrayList<ArrayList<Double>> setUpMatrix(int slits, int targets, ArrayList<Double> probabilities) {
        
        ArrayList<Double> probs = new ArrayList<>();
        ArrayList<Double> repeat = new ArrayList<>();
        int cont = 0;
        for (int i = 0; i < probabilities.size(); i++) {
            if (cont < targets) {
                probs.add(probabilities.get(i));
            } else {
                repeat.add(probabilities.get(i));
            }
            cont++;
        }
        
        ArrayList<ArrayList<Double>> matrix = new ArrayList();
        int sizeM = 8;
        for (int i = 0; i < sizeM; i++) {
            ArrayList<Double> temp = new ArrayList();
            for (int j = 0; j < sizeM; j++) {
                temp.add(0.0);
            }
            matrix.add(temp);
        }
        
        for (int i = 1; i < slits + 1; i++) {
            matrix.get(i).set(0, 1.0 / slits);
        }
        
        int currentSlit = 1;
        int currentCount = 0;
        for (int i = slits + 1; i < sizeM; i++) {
            System.err.println("Index1: " + i);
            matrix.get(i).set(i, 1.0);
            if (currentCount < targets - 1) {
                matrix.get(i).set(currentSlit, probs.get(i - (slits + 1)));
                currentCount++;
            } else {
                if (currentSlit < slits) {
                    matrix.get(i).set(currentSlit, probs.get(i - (slits + 1)));
                    currentCount = 1;
                    currentSlit++;
                    matrix.get(i).set(currentSlit, repeat.remove(0));
                } else {
                    matrix.get(i).set(currentSlit, probs.get(i - (slits + 1)));
                }
            }
            System.err.println("Index2: " + i);
        }
        
        matrix.get(5).set(2, 0.3333);
        matrix.get(6).set(2, 0.3333);
        matrix.get(6).set(1, 0.0);
        matrix.get(7).set(2, 0.3333);
        matrix.get(7).set(1, 0.0);
        
        return matrix;
    }

    public static ArrayList<Object> multipleClassicProbabilisticSlits(int slits, int targets, ArrayList<Double> probabilities, ArrayList<Double> initialState) throws Exception {
        
        ArrayList<ArrayList<Double>> matrix = setUpMatrix(slits, targets, probabilities);

        matrix = doubleMatrixMult(matrix, matrix);

        System.out.println("Matrix:");
        for (int i = 0; i < matrix.size(); i++) {
            System.out.println(matrix.get(i));
        }

        ArrayList results = new ArrayList();
        results.add(matrix);

        results.add(action(matrix, initialState));

        return results;
    }
}
