public class Ratio extends Math
{
    private double ratio;

    /**
     * A constructor method to instantiate ratio to 0.0
     */
    public Ratio( )
    {
        ratio = 0.0;
    }

    /**
     * A method, ratioMath, that calculates the ratio of the perimeter to the area.
     */
    public void ratioMath( )
    {
        ratio = perimeter / area;
    }

    /**
     * A method, toString, that creates a human-readable String to present the data.
     */
    public String toString()
    {
        String newString = "The ratio of the perimeter to the area is: " + ratio;
        return newString;
    }
}
