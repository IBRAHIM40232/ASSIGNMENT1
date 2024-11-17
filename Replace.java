package Tribe.oops;

import java.util.Scanner;

public class Replace {
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String org = scanner.nextLine();
		String replaced = org.replace(" ","_");
		System.out.println(" String after replacement: " +replaced);
		
		scanner.close();
		
	}

}
