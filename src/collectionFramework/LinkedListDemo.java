package collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) {

		//Create an ArrayList, default size of arrayList is 10, In this example we create size 100
		// <> put what type of data we need to storeS
		LinkedList<String> cars = new LinkedList<String>();
		
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
		
		/* Array List - is exactly like Array - looks like - {0,1,2,3,4,5,6}
		 * Linked List - [0]>[1]>[2]
		 * Array List - when you have to add from the end and remove from the end and getting is fast
		 * Linked List - when you have to add from the beginning and remove from the beginning. 
		 */
		
		//List is an interface
		List<Integer> lList=new LinkedList<>();
		List<Integer> aList=new ArrayList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
		
		
		

	}

	public static void runDuration(List<Integer>list, String listType) {
		System.out.println("\nBegining of the duration method for " +listType);
		
		long startTime = System.currentTimeMillis();
		for(int i=10; i<10000; i++) {
			list.add(i);
		}
		
		long endTime = System.currentTimeMillis();
		long duration =endTime - startTime;
		System.out.println("Duration of the list " +listType + "is " +duration +"ms");
		
		
	}
}
