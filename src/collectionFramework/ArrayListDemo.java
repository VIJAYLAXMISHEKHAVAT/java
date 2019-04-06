package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//Create an ArrayList, default size of arrayList is 10, In this example we create size 100
		// <> put what type of data we need to storeS
		ArrayList<String> cars = new ArrayList<String>(100);
		
		//how do we add items to list
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("Tesla");
		
		//size 
		int size =cars.size();
		System.out.println("Size of the Array List is: " +size);
		
		//Get 
		System.out.println("The item of index is: " +cars.get(1));
		
		//how to iterate Arraylist using for loop
		for(int i=0; i<size; i++) {
			System.out.println("Item on index " + "is " +cars.get(i));
			
		}
		
		//how to iterate using For-each loop
		for(String car: cars) {
			System.out.println("The item is:" +car);
		}
		System.out.println("\n next loop example");
		//remove item from array list
		cars.remove(size -1);
		for (String car:cars) {
			System.out.println("The item is: " +car);
		}

	}

}
