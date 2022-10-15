package LibAlgebra;


/**
 * An object which represents a complex number: a + bi, being a and b real numbers, and i^2=-1
 *
 */
    public class ComplexNumber {
        double real;
    double imaginary;

    /**
     * It builds a complex number (a + bi).
     * @param a The real part of the complex number.
     * @param b The imaginary part of the complex number.
     */
    public ComplexNumber(double a, double b) {
        this.imaginary =b;
        this.real=a;

    }

    /**
     * It says whether you can parse this complex number to a real number.
     * @return A bool that confirms whether you can parse this complex number
     */
    public boolean canParse()  {
        return this.imaginary == 0;
    }

    /**
     * @return the real part of the complex number
     */
    public double getReal() {
        return this.real;
    }

    /**
     * @return the imaginary part of the complex number
     */
    public double getImaginary(){
        return this.imaginary;
    }

    /**
     * It parses a complex number to a string.
     *
     * @return A string with the following syntax a+bi
     */
    public String stringParse() {
        String sign="";
        if (this.imaginary >=0) sign="+";
        return (this.real + sign + this.imaginary +"i");
    }

    //TODO Complex numbers basic operations
}
