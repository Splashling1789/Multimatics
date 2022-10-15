package LibAlgebra;

public class PolynomialEquation {
    public boolean print_errors;

    public PolynomialEquation(boolean printErrors){
        this.print_errors =printErrors;
    }

    /**
     * It solves the two solutions of a second grade equation ax^2+b^x+c=0. It only works with real numbers solutions
     * @param a multiplier of x^2
     * @param b multiplier of x
     * @param c multiplier
     * @return An array with the two solutions of the equation
     *
     */
    public double[] secondGrade (double a, double b, double c) {
        double[] result = new double[2];
        try {
            double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
            result[0] = (-b + sqrt) / 2;
             result[1]= (-b - sqrt) / 2;

        }
        catch (Exception e) {
            if (print_errors) System.out.println("ERROR: The equation was given a complex solution");
        }
        return result;

    }
    /**
     * It solves the two solutions of a second grade equation ax^2+b^x+c=0. It works with complex numbers
     * @param a multiplier of x^2
     * @param b multiplier of x
     * @param c multiplier
     * @return An array of complex numbers with the two solutions of the equation
     *
     */

    public ComplexNumber[] secondGradeComplex (double a, double b, double c) {
        ComplexNumber[] result = new ComplexNumber[2];
        double sqrt = Math.pow(b, 2) - 4 * a * c;
        if(sqrt <0) {
            result[0] = new ComplexNumber(-b/2, Math.sqrt(-sqrt) /2);
            result[1]= new ComplexNumber(-b/2, -Math.sqrt(-sqrt) /2);

        }
        else {
            result[0] = new ComplexNumber(secondGrade(a,b,c)[0],0);
            result[1]= new ComplexNumber(secondGrade(a,b,c)[1], 0);
        }
        return result;

    }

}
