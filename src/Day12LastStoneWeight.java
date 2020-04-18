import java.util.Collections;
import java.util.PriorityQueue;

public class Day12LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		int remainingWeight = 0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int stone : stones)
			maxHeap.add(stone);
		while (maxHeap.size() > 1) {
			remainingWeight = maxHeap.remove() - maxHeap.remove();
			if (remainingWeight != 0)
				maxHeap.add(remainingWeight);
		}
		return maxHeap.isEmpty() ? 0 : maxHeap.remove();
	}
}
