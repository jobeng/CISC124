/* Jessie Obeng Student# 10027227
   Class: CISC 124 
   Date: January 20, 2016
*/
public class ArrayTransformations {
	
	//Static method that accepts a two-dimensional array and 
	//flips all values horizontally
	//Iterates through each row, once row selected it swaps the outer column values
	public static void horizontalFlip(int[][] array)
	{
		for (int row=0; row < array.length; row++)
		{
			for (int column=0; column < (array[row].length/2); column++)
			{				
				//temp - holds value temporarily so that when it is overwritten 
				//by "array[row][array[row].length - column - 1]"
				//initial value is not lost and can replace the values at 
				//array[row][array[row].length - column - 1]
				int temp = array[row][column];
				array[row][column] = array[row][array[row].length - column - 1];
				array[row][array[row].length - column - 1] = temp;
			}
		}
	}
	
	//Method that accepts a two-dimensional array and 
	//flips all values vertically
	//Iterates through each row and swaps it 
	public static void verticalFlip(int array[][])
	{
		for (int row = 0; row < (array.length/2); row++)
		{
			//temp holds row temporarily so that when it is overwritten by "array[array.length -1 - row];"
			//initial row values are not lost and can replace the values at "array[array.length -1 - row];"
			int temp[] = array[row];
			array[row] = array[array.length -1 - row];
			array[array.length -1 -row] = temp;
		}
	}
	
	//Method that accepts a two-dimensional array as a parameter and return a two-dimensional array
	//Rotates all values clockwise
	public static int[][] rotateRight(int array[][])
	{
		//temp - temporary array where the row length of "array" 
		//becomes column length of temp and the column length of "array"
		//becomes the row length of temp
		int temp[][] = new int[array[0].length][array.length];
		
		//while "row" of temp is less than the number of columns in "array"
		for (int row = 0; row < array[0].length; row++)
		{
			//while "column" is less than number of rows in "array"
			for (int column = 0; column < array.length; column++)
			{
				temp[row][array.length -column -1] = array[column][row];
			}
		}	
		return temp;
	}
	
	//Method that accepts a two-dimensional array as a parameter and return a two-dimensional array
	//Rotates all values counter-clockwise
	public static int[][] rotateLeft(int array[][])
	{
		//temp - temporary array where the row length of "array" 
		//becomes column length of temp and the column length of "array"
		//becomes the row length of temp
		int temp[][] = new int[array[0].length][array.length];
		
		//while "row" of temp is less than the number of columns in "array"
		for (int row = 0; row < array[0].length; row++)
		{
			//while "column" is less than number of rows in "array"
			for (int column = 0; column < array.length; column++)
			{
				temp[row][array.length -column -1] = array[array.length -column -1][array[0].length -row -1];
			}
		}
		
		return temp;
	}
}
