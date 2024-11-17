package Tribe.oops;
import java.util.Scanner;
public class Sortedarray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the size of the array
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        // Input the elements of the array
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Sort the array using Bubble Sort
	        for (int i = 0; i < size - 1; i++) {
	            for (int j = 0; j < size - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    // Swap array[j] and array[j + 1]
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
	        }

	        // Display the sorted array
	        System.out.println("Sorted array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        scanner.close();
	    }
	}


