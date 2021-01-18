package edu.cgcc.cs161;
//Header
//Program Name: Pos Neg detector
//Author: Ethan Lyons
//Class: CS161
//Date: 1/17/2021
//Description: detects if the value initiated is positive, negative, or zero. It also detects if the value is bigger than one million.
public class problemOne {

	public static void main (String[] Args) {
		float a = 0.11f;
		if (a == 0.00f) {
			System.out.print("zero");
		}
		else {
			if (a > 0.00f) {
				System.out.print("positive");
			}
			else {
				System.out.print("negative");
			}
		}
		if (a > 1000000.00f) {
			System.out.print(" large");
		}
	}
}
/* Footer
* positive
*/