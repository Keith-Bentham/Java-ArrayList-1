import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {

	static int sum(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			return first + sum(list);
		}
	}

	static int CountEven(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first % 2 == 0)
				return 1 + CountEven(list);
			else
				return 0 + CountEven(list);
		}
	}

	static int CountTarget(ArrayList<Integer> list, int target) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first == target)
				return 1 + CountTarget(list, target);
			else
				return 0 + CountTarget(list, target);
		}
	}

	static boolean SearchTarget(ArrayList<Integer> list, int target1) {
		if (list.size() == 0)
			return false;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first == target1)
				return true;
			else
				return false;
		}
	}

	static boolean ContainsEvenNo(ArrayList<Integer> list) {
		if (list.size() == 0)
			return false;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first % 2 == 0)
				return true;
			else
				return ContainsEvenNo(list);
		}
	}

	static boolean ContainsOddno(ArrayList<Integer> list) {
		if (list.size() == 0)
			return false;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first % 2 != 0)
				return true;
			else
				return ContainsOddno(list);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 4, 6, 8);
		list.add(5);
			
		int res1 = sum(new ArrayList<Integer>(list));
		System.out.println("Sum of all elements in list= " + res1);

		int res2 = CountEven(new ArrayList<Integer>(list));
		System.out.println("Number of even elements in list= " + res2);

		boolean res5 = ContainsEvenNo(new ArrayList<Integer>(list));
		System.out.println("Contains an even number= " + res5);

		boolean res6 = ContainsOddno(new ArrayList<Integer>(list));
		System.out.println("Contains an odd number= " + res6);

		int maximum = Collections.max(list);
		System.out.println(maximum);

		int target = Console.readInt("Enter Target for number of number search in the list");
		int res3 = CountTarget(new ArrayList<Integer>(list), target);
		System.out.println("Number of elements in the list= " + res3);

		int target1 = Console.readInt("Enter Number to see if it's in the list");
		boolean res4 = SearchTarget(new ArrayList<Integer>(list), target1);
		System.out.println("Is it in the list= " + res4);
	}
}