package goodPairs;

//runtime 2ms mem use 39.1mb

public class Solution {
	public int numIdenticalPairs(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j < nums.length; j++) {
				if(nums[i] == nums[j] && i < j) {
					count++;
				}
			}
		}
		return count;
	}
}

