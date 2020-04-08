import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Day6GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> anagrams = new ArrayList<>();
		Map<String, List<String>> anagramsMap = new HashMap<>();

		for (String s : strs) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			String sorted = String.valueOf(chars);
			List<String> list;
			if (!anagramsMap.containsKey(sorted)) {
				list = new ArrayList<>();
			} else {
				list = anagramsMap.get(sorted);
			}
			list.add(s);
			anagramsMap.put(sorted, list);
		}
		anagrams.addAll(anagramsMap.values());
		return anagrams;
	}
}
