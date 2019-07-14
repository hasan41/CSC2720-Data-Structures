import java.util.Random;
import java.util.Scanner;

/* 
 * @author: 
 * Hasan Naseer 
 * CSC 2420 - A01
 * June 19, 2019
 */
public class matrix022 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String end;
        String name;
        int size, sum;
        int[][] A, B;
        int[][] output;
      
        //User input his first name with NO space. Getting to know user more better!
        System.out.print("Please enter your first name: "); 
        name = sc.next();                                  
        
        while (true) {
            /*The code should display the user for the dimensions of the two square matrices, 
             * making sure that the user input is greater than or equal to 4 in the user input.
             * The output of the matrix A*B has to display by picking up random integers.
             */

            while (true) {
                System.out.println(name + "," + " Enter the matrix dimenstions[>=4]: ");
                size = sc.nextInt();
                if(size >= 4) {
                	break; /* If size is >= 4 then the program breaks
                	        * and moves to the next line which leads end the program*/
                }else {
                // If the above is not met, prompt the user for a new value.
                System.out.println(name + "," + " Please enter size greater than or equal to 4");
                }
            }
            A = new int[size][size]; //First Matrix (with dimensions)
            B = new int[size][size]; //Second Matrix (with dimensions)
            output = new int[size][size]; //Final output of Matrices (dimensions as an array)
            
            // Generating random integer numbers (ranging from 1 to 60) to fill both matrices.
            for(int i =0 ; i < size; ++i) {
                for(int j =0 ; j < size; ++j) {
                	//Picks random numbers, range from 1 - 60 for matrix A & B in the dimension user has gave earlier. 
                    A[i][j] = 1 + ran.nextInt(60); //Pick up random numbers for Matrix A ranging till 60
                    B[i][j] = 1 + ran.nextInt(60); //Pick up random numbers for Matrix B ranging from 1 to 60
                    sum = 0;
                    for(int k = 0; k < size; ++k) {
                        sum += A[i][k] * B[k][j];
                    }
                    output[i][j] = sum; 
                }
            }
            // 4. Display these two matrices on the screen.
            System.out.println("Matrix A: ");
            for(int i = 0; i < size; ++i) {
                for(int j = 0; j < size; ++j) {
                    System.out.printf("%3d ", A[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            
            System.out.println("Matrix B: ");
            for(int i = 0; i < size; ++i) {
                for(int j = 0; j < size; ++j) {
                    System.out.printf("%3d ", B[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            
            // Multiply the two matrices and display the result on the screen.
            System.out.println("Matrix A * B: "); // Gives the output of the matrices multiplied together 
            for(int i = 0; i < size; ++i) {
                for(int j = 0; j < size; ++j) {
                    System.out.printf("%6d ", output[i][j]);
                }
                System.out.println();
            }
            
            // Display user message asking if they want to repeat multiplying matrix's .
            System.out.print("Hello, " + name + " do you want to try again(y or n)? ");
            end = sc.next();
            if(end.equalsIgnoreCase("n")) { 
            	System.out.println("Peaceout, " + name);
            	System.exit(0); 
            	/*
            	* If user inputs 'n', the program breaks and 
            	* continues to the next line, which makes the
            	* program end. */
            	
            }
        }
       
    } 
}