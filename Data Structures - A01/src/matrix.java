import java.util.Random;
import java.util.Scanner;
/* 
 * @author: 
 * Hasan Naseer 
 * CSC 2720 - A01
 * June 19, 2019
 */
 
public class matrix{
   public static void main(String args[]){
	   int n;
	   String name, end;
       Scanner sc = new Scanner(System.in);
       Random ran = new Random(); //Java Built in random integer selection number
       //User input his first name with NO space. Getting to know user more better!
       System.out.print("Please enter your first name: "); 
       name = sc.next();                                  
       
       while(true) {
    	   
    	   /*The code should display the user for the dimensions of the two square matrices, 
            * making sure that the user input is greater than or equal to 4 in the user input.
            * The output of the matrix A*B has to display by picking up random integers.
            */
    	   
       System.out.println(name + "," +" enter the base of squared matrices");
       while(true) {
           System.out.println(name + "," + " Please enter the matrix dimenstions[>=4]: ");
           n = sc.nextInt();
           if(n >= 4) {
           	break; /* If size is >= 4 then the program breaks
           	        * and moves to the next line which leads end the program*/
           }else {
           // If the above is not met, prompt the user for a new value.
            System.out.println(name + "," + " Please enter size greater than or equal to 4");
           }
       }
       int[][] a = new int[n][n];  //First Matrix (with dimensions)
       int[][] b = new int[n][n];  //Second Matrix (with dimensions)
       int[][] output = new int[n][n]; //Final output of Matrices (dimensions as an array)
     
       System.out.print("\n");
       //Matrix 1 
       System.out.println("Matrix 1: ");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               a[i][j] = ran.nextInt(60); //Pick up random numbers for Matrix 1 ranging from 1 to 60 
           }
       } 
       
       for(int i = 0; i < n; i++) {
           for(int j = 0; j < n; j++) {
               System.out.printf("%3d ", a[i][j]); //Loop through Matrix 1 dimensions given in an array, above by the user. 
           }
           System.out.println();
       }
       System.out.println();
       
       //Matrix 2
       System.out.println("Matrix 2: ");
       for (int i = 0; i < n; i++)
       {
           for (int j = 0; j < n; j++)
           {
               b[i][j] = 1 + ran.nextInt(60); //Pick up random numbers for Matrix 2 ranging from 1 to 60
           }
       }
       
       for(int i = 0; i < n; ++i) {
           for(int j = 0; j < n; ++j) {
               System.out.printf("%3d ", b[i][j]);
           }
           System.out.println();
       }
       System.out.println();
       
       System.out.println("Matrix (1 * 2): ");
       for (int i = 0; i < n; i++) {
           for (int j = 0; j < n; j++){
               for (int k = 0; k < n; k++)
               {
            	   output[i][j] = output[i][j] + a[i][k] * b[k][j]; /*Multiply Matrix 1 and 2 by the 
            	   													* output of variables given to each Matrix.
            	   													* Matrix 1 (i,j) * Matrix 2(k,j) */
               }
           }
       } 
       for (int i = 0; i < n; i++){
           for (int j = 0; j < n; j++){
               System.out.print(output[i][j] + " "); /*Loops the output through the dimensions given of Matrix 1 and 2 
                									  * Brings the output of dimensions given earlier by the user.
                									  * Dimensions are given in the loop as "n" */
           }
           System.out.println();
       } 
       
       // Display user message asking if they want to repeat multiplying matrix's .
       System.out.print("Hello, " + name + " do you want to try again(y or n)? ");
       end = sc.next();
       if(end.equalsIgnoreCase("n")) { 
       	System.out.println("Peaceout, " + name);
       	System.exit(0);  /*
       	* If user inputs 'n', the program breaks and 
       	* continues to the next line, which makes the
       	* program end. */
       	
       }
   }
   }
}
