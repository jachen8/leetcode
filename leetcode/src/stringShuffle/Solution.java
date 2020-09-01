package stringShuffle;
import java.lang.StringBuilder;
/*
 * Given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 */

public class Solution {
	public static String restoreString(String s, int[] indices) {
		StringBuilder shuffled = new StringBuilder(s);
		for(int i = 0; i < indices.length; i++) {
			shuffled.setCharAt(indices[i], s.charAt(i));
		}
		return shuffled.toString();
	}
	public static void main(String[] args) {
		int[] indices = new int[] {4,5,6,7,0,2,1,3};
		Solution.restoreString("codeleet", indices);
	}
}

