/**
 * Code for Coordinates class.
 * Concrete class
 * @version 1.0.0
 * @author aprasad72
 */
public class Coordinates {

    private final double latitude;
    private final double longitude;
    /**
     * @param longitude double value part of coordinates
     * @param latitude double value part of coordinates
     * constructor takes in two doubles
     * should be assigned to latitude and longitude respectively
     */
    public Coordinates(double longitude, double latitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     * @param other an object used for comparison with Coordinates object
     * @return true/false (boolean) if Coordinate objects are equivelent
     * equivelent based on content not location
     */
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinates)) {
            return false;
        }
        Coordinates that = (Coordinates) other;
        return this.latitude == that.latitude
               && this.longitude == that.longitude;
    }
    /**
     * @return String notation of Coordinates object
     * (only longitude and latitude)
     */
    public String toString() {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }
    /**
     * @return latitude double value of Coordinates object
     */
    public double getLat() {
        return latitude;
    }
    /**
     * @return longitude double value of Coordinates object
     */
    public double getLon() {
        return longitude;
    }
}
