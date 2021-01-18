package edu.cgcc.cs161;
//Header
//Program Name: Pass Fail
//Author: Ethan Lyons
//Class: CS161
//Date: 1/17/2021
//Description. A program that prompts the user for a value between 0-100. If the value is greater than 50
// the program prints "pass". If the value is less than 50 then the program prints "fail". A value outside
// the range prompts the user for another value. An incorrect value type prompts the user for a number.
import java.util.Scanner;

public class problemFour {
	
	public static void main (String[] Args) {
		System.out.println("Please type a number between 0-100");
		try {
			Scanner myObj = new Scanner(System.in);
			Float numbInp = ( myObj.nextFloat());
			myObj.close();
			if (numbInp > 100 || numbInp < 0) {
				System.out.println("Please restart and input a number between 0-100");
			}
			else {
				if (numbInp == 50) {
					System.out.println("This number is neither pass or fail");
				}
				else {
					if (numbInp > 50) {
					System.out.println("pass");
					}
					else {
						System.out.println("fail");
					}
				}
			}
			
		}
		catch (Exception e) {
			System.out.println("Please restart and enter a valid number");	
		}
	}
}
/* FOOTER
 * Please type a number between 0-100
 * 78
 * pass
 */