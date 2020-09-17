package xorInArray;
/*
 * Given an integer n and an integer start.

Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.

constraints 
1 <= n <= 1000
0 <= start <= 1000
n == nums.length
 */
public class Solution {
	public int xorOperation(int n, int start) {
	    int xorVal = 0;

	    for (int i = 0; i < n; i++) {
	    	xorVal ^= start + 2 * i;
	    }

	    return xorVal;
	}
}
