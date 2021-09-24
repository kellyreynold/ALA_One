/**
 * This is my code! It's goal is to practice abstract classes and interfaces and produce the area,
 * perimeter, and ratio of perimeter to area
 * CS 312 - ALA1
 * @author Kelly Reynolds
 * @version 1.0 9/24/21
 */

public class Tester
{
    public static void main( String [] args )
    {
        Math recOne = new Math( );
        recOne.Area( 3, 6 );
        recOne.Perimeter( 3, 6 );
        System.out.println( recOne.toString() );
        Ratio recOneRatio = new Ratio( );
        recOneRatio.ratioMath( );
        System.out.println( recOneRatio );

        Math recTwo = new Math( );
        recTwo.Area( 5, 3 );
        recTwo.Perimeter( 5, 3 );
        System.out.println( recTwo.toString() );
        Ratio recTwoRatio = new Ratio( );
        recTwoRatio.ratioMath( );
        System.out.println( recTwoRatio );
    }
}

/*
I decided to work on interfaces and abstract classes more.  I took ideas from the first two labs to do this
assignment.  I first made an abstract class called Numbers with two interfaces named Area and Perimeter.
I then created a Math class that contains the Area and Perimeter functions and extends the Numbers class.
I then created a Ratio class that extends the Math class to determine the ratio of the perimeter to the
area.  However, during testing this aspect of the code does not work.
 */
