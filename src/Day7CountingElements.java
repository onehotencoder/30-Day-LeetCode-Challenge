import java.util.HashSet;
import java.util.Set;

class Day7CountingElements {
	public int countElements(int[] arr) {
		int count = 0;
		Set<Integer> set = new HashSet<>();
		for (int e : arr) {
			set.add(e);
		}
		for (int e : arr) {
			if (set.contains(e + 1))
				count++;
		}
		return count;
	}
}
