package ADVANCED.Exercises2;

import java.util.Random;

// Testing the Math class methods.
public class MathTest {
    public static void main(String[] args) {
        System.out.printf("Math.abs( 23.7 ) = %f\n", Math.abs(23.7));
        System.out.printf("Math.abs( 0.0 ) = %f\n", Math.abs(0.0));
        System.out.printf("Math.abs( -23.7 ) = %f\n", Math.abs(-23.7));

        System.out.printf("Math.ceil( 9.2 ) = %f\n", Math.ceil(9.2));
        System.out.printf("Math.ceil( -9.8 ) = %f\n", Math.ceil(-9.8));

        System.out.printf("Math.cos( 0.0 ) = %f\n", Math.cos(0.0));

        System.out.printf("Math.exp( 1.0 ) = %f\n", Math.exp(1.0));
        System.out.printf("Math.exp( 2.0 ) = %f\n", Math.exp(2.0));

        System.out.printf("Math.floor( 9.2 ) = %f\n", Math.floor(9.2));
        System.out.printf("Math.floor( -9.8 ) = %f\n", Math.floor(-9.8));

        System.out.printf("Math.log( Math.E ) = %f\n", Math.log(Math.E));
        System.out.printf("Math.log( Math.E * Math.E ) = %f\n", Math.log(Math.E * Math.E));

        System.out.printf("Math.max( 2.3, 12.7 ) = %f\n", Math.max(2.3, 12.7));
        System.out.printf("Math.max( -2.3, -12.7 ) = %f\n", Math.max(-2.3, -12.7));

        System.out.printf("Math.min( 2.3, 12.7 ) = %f\n", Math.min(2.3, 12.7));
        System.out.printf("Math.min( -2.3, -12.7 ) = %f\n", Math.min(-2.3, -12.7));

        System.out.printf("Math.pow( 2.0, 7.0 ) = %f\n", Math.pow(2.0, 7.0));
        System.out.printf("Math.pow( 9.0, 0.5 ) = %f\n", Math.pow(9.0, 0.5));

        System.out.printf("Math.sin( 0.0 ) = %f\n", Math.sin(0.0));

        System.out.printf("Math.sqrt( 900.0 ) = %f\n", Math.sqrt(900.0));
        System.out.printf("Math.sqrt( 9.0 ) = %f\n", Math.sqrt(9.0));

        System.out.printf("Math.tan( 0.0 ) = %f\n", Math.tan(0.0));
    }
}
/*
Math.abs( 23.7 ) = 23,700000
Math.abs( 0.0 ) = 0,000000
Math.abs( -23.7 ) = 23,700000
Math.ceil( 9.2 ) = 10,000000
Math.ceil( -9.8 ) = -9,000000
Math.cos( 0.0 ) = 1,000000
Math.exp( 1.0 ) = 2,718282
Math.exp( 2.0 ) = 7,389056
Math.floor( 9.2 ) = 9,000000
Math.floor( -9.8 ) = -10,000000
Math.log( Math.E ) = 1,000000
Math.log( Math.E * Math.E ) = 2,000000
Math.max( 2.3, 12.7 ) = 12,700000
Math.max( -2.3, -12.7 ) = -2,300000
Math.min( 2.3, 12.7 ) = 2,300000
Math.min( -2.3, -12.7 ) = -12,700000
Math.pow( 2.0, 7.0 ) = 128,000000
Math.pow( 9.0, 0.5 ) = 3,000000
Math.sin( 0.0 ) = 0,000000
Math.sqrt( 900.0 ) = 30,000000
Math.sqrt( 9.0 ) = 3,000000
Math.tan( 0.0 ) = 0,000000

                   MathTest
    ----------------------------------------
    + main(args: String[]): void
    ----------------------------------------
*/