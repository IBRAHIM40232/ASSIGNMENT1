package Tribe.oops;

import java.util.Scanner;

public class Replacecharacter {
	
	public static void main(String[]args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String org = scanner.nextLine();
			String replaced = org.replace("yy", "@");
			String replaced1 = org.replace("oo", "@");
			System.out.println(" String after replacement: " +replaced);
			System.out.println(" String after replacement: " +replaced1);
			scanner.close();
			
	}

}
