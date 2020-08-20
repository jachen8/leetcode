package arrayShuffle;
/**
 * Shuffle the Array
 * shuffles a given array by alternating each element of the second half of the array with the first half
 * 
 * example
 * input[1,2,3,4]
 * output[1,3,2,4]
 * 
 * @author Jachen
 * 8/19/20
 */
class Solution {
	public int[] shuffle(int[] nums, int n) {
		int[] shuf = new int[2*n];
		int start = 0;
		int mid = n;
		for(int i = 0; i < 2*n; i+=2) {
			shuf[i] = nums[start];
			shuf[i+1] = nums[mid];
			start++;
			mid++;
		}
		return shuf;
	}
}
