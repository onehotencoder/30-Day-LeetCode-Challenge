
public class Day9BackspaceStringCompare {
	public boolean backspaceCompare(String S, String T) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int continuousBackspace = 0;
		// create a reversed stringbuilder object of S after removing backspaces
		for (int i = S.length() - 1; i >= 0; i--) {
			if (S.charAt(i) != '#' && continuousBackspace == 0)
				sb1.append(S.charAt(i));
			else if (S.charAt(i) != '#' && continuousBackspace > 0)
				continuousBackspace--;
			else if (S.charAt(i) == '#')
				continuousBackspace++;
		}
		continuousBackspace = 0;
		// create a reversed stringbuilder object of T after removing backspaces
		for (int i = T.length() - 1; i >= 0; i--) {
			if (T.charAt(i) != '#' && continuousBackspace == 0)
				sb2.append(T.charAt(i));
			else if (T.charAt(i) != '#' && continuousBackspace > 0)
				continuousBackspace--;
			else if (T.charAt(i) == '#')
				continuousBackspace++;
		}
		// if the strings are similar their reversed values should be similar too
		return sb1.compareTo(sb2) == 0;
	}
}
