import java.util.*;
public class Array {
	public static void main(String [] args) {
		int [][] s1 = { {12,22,34}, {22,16,22}, {25,56,45} };
		System.out.print(s1[0][2] + ",");
		System.out.print(s1[1][2]);

		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			for(int j=i; j<3;j++) {
			System.out.println(s1[i][j]);
			}

	}
		System.out.print("-----------");
		
		System.out.println();
		int [] s2 = {22,42,41};
		for(int x=0;x<1;x++) {
			for(int y=x;y<3;y++) {
				System.out.println(s2[x]);
			}
		}
	}
}
