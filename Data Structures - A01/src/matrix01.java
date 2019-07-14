import java.util.*;

public class matrix01 {
	public static void main(String[] args) {
		int [][] a = { {1,2,3,4} , 
				       {2,3,4,4} , 
				       {5,6,7,4} , 
				       {8,9,10,4} };
		
		int [][] b = { {12,20,32,4} , 
			           {25,3,14,4} , 
			           {55,624,75,4} , 
			           {428,49,222,4} };
		
		int r1 = 4 , c1 = 4;
		int r2 = 4 , c2 = 4;
		
		for(int i =0; i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int x = 0; x<b.length;x++) {
			for(int y=0;y<b[x].length;y++) {
				System.out.print(a[x][y] + " ");
			}
			System.out.println();
		}
	
		int [][] product = multiply(a ,b , r1, c1, c2); 
		output(product);
		
		System.out.println();
		
		ArrayList <Integer> d = new ArrayList <Integer>();
		d.add(4);
		d.add(5);
		d.add(6);
		d.add(10);

		System.out.println(d);
		Collections.swap(d, 0, 3);
		System.out.println(d);

		
	/*	ArrayList <Integer> r = new ArrayList <Integer>();
		r.add(10);
		r.add(6);
		r.add(5);
		r.add(4);
		
		System.out.println(r);  */
				
				
	}
	
	

	public static int[][] multiply(int[][] a, int[][] b, int r1, int c1, int c2) {
		int[][] product = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return product;
	}

	public static void output(int[][] product) {
		System.out.println("Final ouput of two 4x4 Matrix is: ");
		for (int[] row : product) {
			for (int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}
}

/* public static void main(String [] args) {
int row, column , row1, column1 , c , d , k;
int sum = 0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows and columns of first matrix");
row = sc.nextInt();
column = sc.nextInt();

int first [][] = new int [row][column];

System.out.println("Enter elements of first matrix");

  for (c = 0; c < row; c++)
     for (d = 0; d < column; d++)
        first[c][d] = sc.nextInt();
  
  System.out.println("Enter the number of rows and columns of second matrix");
  row1 = sc.nextInt();
  column1 = sc.nextInt();

  if (row != row1)
     System.out.println("The matrices can't be multiplied with each other.");
  else
  {
     int second[][] = new int[row1][column1];
     int multiply[][] = new int[row][column];

     System.out.println("Enter elements of second matrix");

     for (c = 0; c < row1; c++)
        for (d = 0; d < column1; d++)
           second[c][d] = sc.nextInt();

     for (c = 0; c < row; c++)
     {
        for (d = 0; d < column1; d++)
        {  
           for (k = 0; k < row1; k++)
           {
              sum = sum + first[c][k]*second[k][d];
           }

           multiply[c][d] = sum;
           sum = 0;
        }
     }

     System.out.println("Product of the matrices:");

     for (c = 0; c < row; c++)
     {
        for (d = 0; d < column1; d++)
           System.out.print(multiply[c][d]+"\t");

        System.out.println();
     }
  }

}
}   */

