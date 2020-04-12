package com.syntax.class10;

public class Task02 {

	public static void main(String[] args) {
		/*Create a 2D array 
		 * that first row will contain 4 names 
		 * and second row will contain grades. 
		 * Then you program should print name of the students that has A and B grade
		 */

		
		String [][]value= {
				{"Paty","Guljemal","Selbi","Bayramgul"},
				{"A","B","C","D"}
		} ;
			
		
		for (int i=0; i<value.length;i++) {
			for (int j=0;j<value[i].length;j++) {
				if (value[i][j].equals("A")) {
					System.out.println("Paty");
				}else if (value[i][j].equals("B")) {
					System.out.println("Guljemal");
				}
			}
			
		}
		
		
	}

}
