package separate_classes;
import java.util.ArrayList;

class methodList {

	public methodList() {

	}

	int sum(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			return first + sum(list);
		}

	}

	static int addGreater(ArrayList<Integer> list, int target) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first > target)
				return first + addGreater(list, target);
			else
				return 0 + addGreater(list, target);
		}
	}

	static int countGreater(ArrayList<Integer> list, int target1) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first > target1)
				return 1 + countGreater(list, target1);
			else
				return 0 + countGreater(list, target1);
		}
	}

	static boolean allEven(ArrayList<Integer> list) {
		if (list.size() == 0)
			return false;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first % 2 == 0)
				return true;
			else
				return allEven(list);
		}
	}

	static boolean allGreater(ArrayList<Integer> list, int target3) {
		if (list.size() == 0)
			return false;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first > target3)
				return true;
			else
				return allGreater(list, target3);
		}
	}

	static int Maximum(ArrayList<Integer> list) {
		if (list.size() == 0)
			return 0;
		else {
			int first = (Integer) list.get(0);
			list.remove(0);
			if (first > Maximum(new ArrayList<Integer>(list))) {
				return first;
			} else {
				return Maximum(list);
			}
		}
	}
}
