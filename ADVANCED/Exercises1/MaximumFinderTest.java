package ADVANCED.Exercises1;

public class MaximumFinderTest {
    public static void main(String[] args) {
        MaximumFinder maximumFinder = new MaximumFinder();
        maximumFinder.determineMaximum();
    }
}
/*  Enter three floating-point values separated by spaces: 5,45 8,56 17,5
    Maximum is: 17.5
UML :
                  MaximumFinderTest
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |creates
                        ↓
                                 MaximumFinder
          --------------------------------------------------------------

          --------------------------------------------------------------
           «constructor» Maximum( x : double , y : double , z : double )
           + determineMaximum():
          --------------------------------------------------------------
                         |
                         |uses
                         ↓
                       Scanner
          ----------------------------------
          ----------------------------------
          ----------------------------------
*/