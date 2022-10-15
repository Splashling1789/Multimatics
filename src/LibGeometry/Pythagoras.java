package LibGeometry;
/**
 * The pythagorean theorem proves that in a right
 * triangle the sum of the two squares
 * on the legs equals the square on the
 * hypotenuse.
 *
 * l1^2 + l2^2 = h^2
 */

public class Pythagoras {


    /**
     * Get the hypotenuse of a right triangle with the values of its two legs
     * @param l1 A leg of the right triangle
     * @param l2 Another leg of the right triangle
     * @return The right triangle's hypotenuse
     */
    public double get_h(double l1, double l2) {
        return(Math.pow(l1, 2) + Math.pow(l2,2));
    }

    /**
     * Get a leg of a right triangle with the values of the hypotenuse and the other leg
     * @param l A leg of the right triangle
     * @param h The hypotenuse of the right triangle
     * @return The right triangle's other leg
     */
    public double get_l(double h, double l) {
        return(Math.pow(h, 2) - Math.pow(l,2));
    }
}
