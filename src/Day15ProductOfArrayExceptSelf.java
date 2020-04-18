// [2, 3, 4, 5]
public class Day15ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] products = new int[n];
		// Calculate lefts and store in res.
		int left = 1;
		for (int i = 0; i < n; i++) {
			if (i > 0)
				left = left * nums[i - 1];
			products[i] = left;
		}
		// Calculate rights and the product from the end of the array.
		int right = 1;
		for (int i = n - 1; i >= 0; i--) {
			if (i < n - 1)
				right = right * nums[i + 1];
			products[i] *= right;
		}
		return products;
	}
}
