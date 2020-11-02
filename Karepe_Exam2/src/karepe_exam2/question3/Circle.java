package karepe_exam2.question3;

/**
 *
 * @author Nithya Karepe
 */
public class Circle {

    double radius;

    /**
     * @return the radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * @param radius
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Circle :\n" + "        Radius = %.2fcms\n" + "          Area = %.2fcm\u00b2\n"
                + " Circumference = %.2fcms\n", radius, Math.PI * radius * radius, 2 * Math.PI * radius);

    }

}
