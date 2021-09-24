interface Area
{
    public void Area( double length, double width );
}

interface Perimeter
{
    public void Perimeter( double length, double width );
}

abstract public class Numbers implements Area, Perimeter
{

}
