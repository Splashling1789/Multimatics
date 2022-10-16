import LibAlgebra.MatrixOperations;
import LibAlgebra.PolynomialEquation;
import LibGeometry.Pythagoras;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Pythagoras p = new Pythagoras();
        PolynomialEquation e = new PolynomialEquation(true);
        MatrixOperations m = new MatrixOperations(true);
        double[][] matrix = {{1, 0, 2,0},{0,1,1,1},{0,0,0,1}};
        double[][] A= m.arrayToMatrix(matrix);
        double[][] matrix2 = {{3,2},{1,0},{1,0},{0,2}};
        double[][] B= m.arrayToMatrix(matrix2);
        System.out.println(Arrays.deepToString(m.transposedMatrix(A)));

    }

}