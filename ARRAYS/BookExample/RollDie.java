package ARRAYS.BookExample;

// Roll a six-sided die 6000 times.
import java.util.Random;

public class RollDie
{
    public static void main( String args[] )
    {
        Random randomNumbers = new Random(); // random number generator
        int frequency[] = new int[ 7 ]; // array of frequency counters

        // roll die 6000 times; use die value as frequency index
        for ( int roll = 1; roll <= 6000; roll++ )
            ++frequency[ 1 + randomNumbers.nextInt( 6 ) ];

        System.out.printf( "%s%10s\n", "Face", "Frequency" );

        // output each array element's value
        for ( int face = 1; face < frequency.length; face++ )
            System.out.printf( "%4d%10d\n", face, frequency[ face ] );
    } // end main
} // end class RollDie
/*
Face Frequency
   1       991
   2       972
   3       948
   4      1027
   5      1054
   6      1008

+---------------------------+
|          RollDie          |
+---------------------------+
| - randomNumbers: Random   |
| - frequency: int[]        |
+---------------------------+
| + main(args: String[]): void |
+---------------------------+

 */