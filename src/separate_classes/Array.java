package separate_classes;

import java.util.*;

public class Array {

	methodList al = new methodList();

	public void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 4, 6, 4, 2, 6, 2, 7, 13, 17, 1);

		int res1 = al.sum(new ArrayList<Integer>(list));
		System.out.println("Sum of all elements in list=" + res1);

		int res6 = al.Maximum(new ArrayList<Integer>(list));
		System.out.println("Maximum=" + res6);

		boolean res4 = al.allEven(new ArrayList<Integer>(list));
		System.out.println("All even in the list= " + res4);

		int target3 = Console.readInt("Enter Target");
		boolean res5 = al.allGreater(new ArrayList<Integer>(list), target3);
		System.out.println("Sum greater than target= " + res5);

		int target = Console.readInt("Enter Target");
		int res2 = al.addGreater(new ArrayList<Integer>(list), target);
		System.out.println("Sum greater than target= " + res2);

		int target1 = Console.readInt("Enter Target");
		int res3 = al.countGreater(new ArrayList<Integer>(list), target1);
		System.out.println("Count greater than the target= " + res3);

	}
}