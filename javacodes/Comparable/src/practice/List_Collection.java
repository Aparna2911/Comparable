package practice;

import java.util.ArrayList;
import java.util.List;

public class List_Collection {
	public static void main(String[] args) {
		// Creating an ArrayList to store integers
		List<Integer> numbers = new ArrayList<>();

		// Adding elements to the list
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// Displaying the elements of the list
		System.out.println("Elements of the list:");
		for (int number : numbers) {
			System.out.println(number);
		}

		// Removing an element from the list
		numbers.remove(2); // Removing the element at index 2 (value 30)

		// Displaying the updated list
		System.out.println("\nElements of the list after removal:");
		for (int number : numbers) {
			System.out.println(number);
		}

		// Checking if the list contains a specific element
		int searchNumber = 40;
		if (numbers.contains(searchNumber)) {
			System.out.println("\nThe list contains " + searchNumber);
		} else {
			System.out.println("\nThe list does not contain " + searchNumber);

		}

		// Getting the size of the list
		int size = numbers.size();
		System.out.println("\nSize of the list: " + size);

	}

}
