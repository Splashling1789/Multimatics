package LibAlgebra;


import java.util.Arrays;

public class MatrixOperations {

    boolean print_errors;
    public MatrixOperations(boolean printErrors){
        this.print_errors = printErrors;
    }

    /**
     * It converts a two-dimensional array into another two-dimensional array with standard dimensions nxm by completing null values with zeros.
     * @param A The initial array
     * @return A two-dimensional array that represents a real matrix
     */
    public double[][] arrayToMatrix(double[][] A) {
        double[][] result = new double[A.length][A[0].length];

        for(int i = 0; i<A.length; i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                try {
                    result[i][j]= A[i][j];
                }
                catch (Exception e){
                    result[i][j]=0;
                }

            }
        }
        return result;
    }

    /**
     * It calculates the product of two matrices. Keep in mind that A needs to have the same number of columns that the number of rows of B
     * @param A Two-dimensional array that represents a matrix
     * @param B Two-dimensional array that represents a matrix
     * @return The product of AxB, or null if they are not compatible
     */
    public double[][] matrixProduct(double[][] A, double[][] B) {
        if(A[0].length == B.length) {
            double[][] result = new double[A.length][B[0].length];
            for(int i=0; i<A.length; i++){
                for(int j=0; j<B[0].length;j++){
                    result[i][j]=0;
                    for(int n=0; n<A[0].length;n++){
                        result[i][j] += A[i][n]*B[n][j];
                    }
                }

            }
            return result;
        }
        else {
            if(print_errors) System.out.println("ERROR: Matrixes are not compatible");
            return null;
        }
    }

    /**
     * It checks if the given matrix is a squared matrix
     * @param A the matrix to check
     * @return true if it is squared
     */
    public boolean matrixIsSquared(double[][] A) {
        return A.length == A[0].length;
    }
    //TODO Matrix basic operations
    public double[][] matrixAddition(double[][] A, double[][] B) {
        if(A.length == B.length && A[0].length == B[0].length){
            double[][] result = new double[A.length][A[0].length];
            for (int i=0; i<A.length; i++){
                for(int j=0; j<A[0].length; j++){
                    result[i][j] = A[i][j] + B[i][j];
                }
            }
            return result;
        }
        else {
            if(print_errors) System.out.println("ERROR: Matrixes are not compatible");
            return null;
        }

    }
    //TODO Matrix determinants

    //TODO Inverse matrix
}
