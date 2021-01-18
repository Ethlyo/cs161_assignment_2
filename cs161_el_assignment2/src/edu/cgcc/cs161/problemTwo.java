package edu.cgcc.cs161;
//Header
//Program Name: AND OR and NAND gates
//Author: Ethan Lyons
//Class: CS161
//Date: 1/17/2021
//Description: Shows uses of AND, OR, and NAND gates in more practical circumstances using a rock tumbler, a tool
// that checks if a food has dairy, and a security alarm.
public class problemTwo {

	public static void main (String[] Args) {
		andPolish();
		orDairy();
		nandAlarm();
	}
	public static void andPolish() { //this is supposed to be like a rock tumbler. If there are no rocks in the tumbler and the tumbler isn't on, then no rocks are being polished.
		String tumblerOn = "yes";
		String rocksInTumbler = "yes";
		if (tumblerOn == "yes" && rocksInTumbler == "yes") {
			System.out.println("Rocks are being polished! Please wait...");
		}
		else {
			System.out.println("Rocks are not being polished.");
		}
	}
	public static void orDairy() { //this is supposed to be like a tool that checks if a food item has dairy.
		String cheese = "no";
		String milk = "no";
		String yogurt = "yes";
		String butter = "no";
		if (cheese == "yes" || milk == "yes" || yogurt == "yes" || butter == "yes") {
			System.out.println("Has dairy. Should not be consumed by people with lactose intolerance");
		}
		else {
			System.out.println("Dairy free! People with lactose intolerance can consume this.");
		}
	}
	public static void nandAlarm() { //this is supposed to be like a security alarm. If either the door or window is open, the alarm goes off.
		String door = "Closed";
		String window = "Closed";
		if ( !(door == "Closed" && window == "Closed")) {
			System.out.println("Security Breach!");
		}
		else {
			System.out.println("Secured.");
		}
	}
}
/* FOOTER
 * Rocks are being polished! Please wait...
 * Has dairy. Should not be consumed by people with lactose intolerance
 * Secured.
 */