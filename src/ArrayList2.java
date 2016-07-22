import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {

	static int sum(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			return first + sum(list);
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 1, 2, 4, 6, 8);
		int res1 = sum(new ArrayList<Integer>(list));

		System.out.println("Sum of all elements in list= " + res1);

	}
}