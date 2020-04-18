import java.util.HashMap;

public class Day13ContiguousArray {
	public int findMaxLength(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();

		int zero = 0;
		int one = 0;
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zero++;
			} else {
				one++;
			}

			if (map.containsKey(zero - one)) {
				len = Math.max(len, i - map.get(zero - one));
			} else {
				map.put(zero - one, i);
			}
		}

		return len;
	}
}
