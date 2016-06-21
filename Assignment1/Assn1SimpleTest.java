/*
 * A simple class that tests the methods in ArrayTransformations without using graphics.
 * Provided for Assignment 1, CISC 124, Winter 2015
 * Queen's University, M. Lamb
 */
public class Assn1SimpleTest {
    
    // Prints a two-dimensional array of integers.  Columns will line up as long
    // as the rows aren't too long and the values don't take more than 4 characters each.
    public static void printArray(int array[][]) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                // printf is a formatted printing method.  You aren't required to know about it.
                // The line below prints array[row][column], padding with blanks to 5 characters.
                System.out.printf("%5d", array[row][column]);
            } // end for
            System.out.println();
        } // end for
    } // end printArray
    
    
    public static void main(String args[]) {
        
        // A small 2D array of integers for testing
        int testArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        
        System.out.println("THE TESTING ARRAY:");
        printArray(testArray);
        
        ArrayTransformations.horizontalFlip(testArray);
        System.out.println("AFTER HORIZONTAL FLIP:");
        printArray(testArray);   
        // flip again to restore to original state
        ArrayTransformations.horizontalFlip(testArray);
   
        ArrayTransformations.verticalFlip(testArray);
        System.out.println("AFTER VERTICAL FLIP:");
        printArray(testArray);   
        // flip again to restore to original state
        ArrayTransformations.verticalFlip(testArray);
        
        int clockwise[][] = ArrayTransformations.rotateRight(testArray);
        System.out.println("ROTATED RIGHT:");
        printArray(clockwise);
        
        int counterClockwise[][] = ArrayTransformations.rotateLeft(testArray);
        System.out.println("ROTATED LEFT:");
        printArray(counterClockwise);
        
        System.out.println("ORIGINAL ARRAY -- SHOULD NOT BE CHANGED BY ROTATIONS");
        printArray(testArray);
        

    
        
      
    } // end main
} // end class