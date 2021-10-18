package com.linecomparison;
/*
 * calculating the length of line 
 */
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparison computation Program");
		lengthOfLine(2, 2, 4, 5);
	}
	
	//method for calculating length of line
	private static void lengthOfLine(int x1, int y1, int x2, int y2) {
		//calculating the length using given formula
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of the line: " + length);	//printing length of line		
		return;
	}

}
