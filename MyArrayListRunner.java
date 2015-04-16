package lab5;

import java.util.Arrays;

public class MyArrayListRunner {
public static void main(String[] args) {
	MyArrayList array = new MyArrayList();
	System.out.println(array.size()); // initial size checking
	// array.get(0); // trying to get element from empty array - exception received
	// array.remove(-15); //// trying to remove element from empty array with incorrect index - exception received
	
	for (int i = 0; i<10; i++){ //adding 10 elements 
		array.add(new Integer(i));
	}
	array.add(15); // adding one element
	System.out.println(array);
	array.add(3, 55); // adding on specific position
	array.addAll(new Object[]{22,22,22}); //adding array in the end
	array.addAll(4, new Object[]{44,44,44});// adding array on specific position
	System.out.println(array);
	System.out.println(array.size());
	System.out.println(array.get(3)); // receiving element from specific position
	array.set(3, 0); // setting element on specific position with new value
	System.out.println(array); 
	array.remove(3); // removing element from specific position
	System.out.println(array);
	System.out.println(array.size()); 
	array.get(17);//trying to get element from out of bounds - exception received  
	
}
}
