/**
 * This class represents a Lens and the corrosponding information such as the make, max aperture, and the focal length
 */
package Model;

public class Lens {
    private String make;
    private double maxAperture;
    private double focalLength;

    //auto generated constructor.
    public Lens(String make, double maxAperture, double focalLength) {
        this.make = make;
        this.maxAperture = maxAperture;
        this.focalLength = focalLength;
    }

    //auto generated getter and setter
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getMaxAperture() {
        return maxAperture;
    }

    public void setMaxAperture(double maxAperture) {
        this.maxAperture = maxAperture;
    }

    public double getFocalLength() {
        return focalLength;
    }

    public void setFocalLength(double focalLength) {
        this.focalLength = focalLength;
    }
}
