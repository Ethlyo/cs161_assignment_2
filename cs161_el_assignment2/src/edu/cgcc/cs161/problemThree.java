package edu.cgcc.cs161;
//Header
//Program Name: Input Pos Neg
//Author: Ethan Lyons
//Class: CS161
//Date: 1/17/2021
//Description: Prompts user for a number. Then tells the user whether the number is positive, negative, or zero.
// if the value is not the correct data type, it prompts the user for a number.
import java.util.Scanner;

public class problemThree {
	
	public static void main (String[] Args) {
		System.out.println("Please type a number");
		try {
			Scanner myObj = new Scanner(System.in);
			Float numbInp = ( myObj.nextFloat());
			myObj.close();
			if (numbInp == 0) {
				System.out.println("This number is zero");
			}
			else {
				if (numbInp > 0) {
				System.out.println("This number is positive");
				}
				else {
					System.out.println("This number is negative");
				}
			}
		}
		catch (Exception e) {
			System.out.println("Please restart and enter a valid number");	
		}
	}
}
/* FOOTER
 * Please type a number
 * 121
 * This number is positive
 */
 
