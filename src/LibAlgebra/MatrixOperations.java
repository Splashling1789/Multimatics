package LibAlgebra;


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
    public double[][] matricesProduct(double[][] A, double[][] B) {
        A=arrayToMatrix(A);
        B=arrayToMatrix(B);
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
            if(print_errors) System.out.println("ERROR: Matrices are not compatible");
            return null;
        }
    }

    /**
     * It checks if the given matrix is a squared matrix
     * @param A the matrix to check
     * @return true if it is squared
     */
    public boolean matrixIsSquare(double[][] A) {
        A=arrayToMatrix(A);
        return A.length == A[0].length;
    }

    public double[][] matrixAddition(double[][] A, double[][] B) {
        A=arrayToMatrix(A);
        B=arrayToMatrix(B);
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
            if(print_errors) System.out.println("ERROR: Matrices are not compatible");
            return null;
        }
    }
    public double[][] negativeMatrix(double[][] A) {
        A=arrayToMatrix(A);
        double[][] result= new double[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[i][j]= -A[i][j];
            }
        }
        return result;
    }

    public double[][] matrixNumberProduct(double a, double[][] A){
        A=arrayToMatrix(A);
        double[][] result= new double[A.length][A[0].length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[i][j]= a*A[i][j];
            }
        }
        return result;
    }
    public double matrixDeterminant(double[][] A) {
        A= arrayToMatrix(A);
        if (matrixIsSquare(A)) {
            if (A.length==1) return A[0][0];
            if (A.length==2) return A[0][0] * A[1][1] - A[0][1] * A[1][0];
            else if(A.length==3) return A[0][0]*A[1][1]*A[2][2] + A[0][1]*A[1][2]*A[2][0] + A[0][2]*A[1][0]*A[2][1] - A[0][2]*A[1][1]*A[2][0] - A[0][1]*A[1][0]*A[2][2] - A[0][0]*A[1][2]*A[2][1];
            else {
                //TODO Matrix determinant of superior order
                if(print_errors) System.out.println("WARN: Superior order determinants are not defined yet");
                return 0;
            }
        }
        else{
            if (print_errors) System.out.println("ERROR: Matrix is not compatible");
            return 0;
        }
    }

    public boolean matrixIsInvertible(double[][] A) {
        A= arrayToMatrix(A);
        return (matrixIsSquare(A) && matrixDeterminant(A)!=0);
    }

    //TODO Inverse matrix

    public double[][] transposedMatrix(double[][] A) {
        A=arrayToMatrix(A);
        double[][] result= new double[A[0].length][A.length];
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){
                result[j][i]= A[i][j];
            }
        }
        return result;
    }

    //TODO Adjugate, and adjugate matrix
    /*
    public double adjugate(int row, int column, double[][] A) {

    }

    public double[][] adjugateMatrix(double[][] A) {
        A=arrayToMatrix(A);

    }
     */

}
