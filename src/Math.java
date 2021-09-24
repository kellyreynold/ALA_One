public class Math extends Numbers
{
    protected double area;
    protected double perimeter;

    /**
     * A constructor method to instantiate area and perimeter to 0.0
     */
    public Math( )
    {
        area = 0.0;
        perimeter = 0.0;
    }

    /**
     * A method, Area, overridden from the Numbers class that calculates the area.
     *
     * @param  length  a double that provides the length of the rectangle
     * @param  width  a double that provides the width of the rectangle
     */
    @Override
    public void Area( double length, double width )
    {
        area = length * width;
    }

    /**
     * A method, Perimeter, overridden from the Numbers class that calculates the perimeter.
     *
     * @param  length  a double that provides the length of the rectangle
     * @param  width  a double that provides the width of the rectangle
     */
    @Override
    public void Perimeter( double length, double width )
    {
        perimeter = ( 2 * length ) + ( 2 * width );
    }

    /**
     * A method, toString, that creates a human-readable String to present the data.
     */
    public String toString()
    {
        String newString = "The area of the rectangle is: " + area + " and the perimeter is: " + perimeter;
        return newString;
    }
}
