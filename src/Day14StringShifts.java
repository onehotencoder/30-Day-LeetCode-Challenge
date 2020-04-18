public class Day14StringShifts {

	public String stringShift(String s, int[][] shift) {
		int totalRightShift = 0;
		int totalLeftShift = 0;
		for (int[] i : shift) {
			if (i[0] == 0)
				totalLeftShift += i[1];
			else
				totalRightShift += i[1];
		}
		return rotate(s, (totalRightShift - totalLeftShift) % s.length());
	}

	public String rotate(String s, int offset) {
		if (offset > 0)
			return s.substring(s.length() - offset) + s.substring(0, s.length() - offset);
		else
			return s.substring(Math.abs(offset), s.length()) + s.substring(0, Math.abs(offset));
	}

}
