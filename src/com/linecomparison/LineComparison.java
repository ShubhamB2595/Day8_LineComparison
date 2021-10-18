package com.linecomparison;
/*
 * calculating the length of line 
 */
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lineComparing();
		
	}
	
	//method for calculating length of line
	private static int lengthOfLine(int x1, int y1, int x2, int y2) {
		//calculating the length using given formula
		int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		//System.out.println("Length of the line: " + length);	//printing length of line		
		return length;
	}

	//method for comparing two lines
	private static void lineEquality() {
		Integer line1 = lengthOfLine(2, 2, 4, 5);
		System.out.println("Length of the line: " + line1);
		Integer line2 = lengthOfLine(1, 2, 3, 4);
		System.out.println("Length of the line: " + line2);
		boolean result = line1.equals(line2);
		if (result) {
			System.out.println("Line1 and line2 are equal in length");
		}
		else {
			System.out.println("Line1 and line2 are not equal in length");
		}
		
		return;
	}
	
	private static void lineComparing() {
		Integer line1 = lengthOfLine(1, 2, 3, 4);
		System.out.println("Length of the line: " + line1);
		Integer line2 = lengthOfLine(8, 6, 2, 2);
		System.out.println("Length of the line: " + line2);
		int result = line1.compareTo(line2);
		if (result == 1) {
			System.out.println("Length of line1 is greater line2");
		}
		else if (result == 0) {
			System.out.println("Length of line1 is equal to line2");
		}
		else {
			System.out.println("Length of line1 is less line2");
		}
	}
}
