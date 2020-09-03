package numSmall;
/*
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
 * That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * 
Return the answer in an array.
 */
public class Solution {
	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] count = new int[101];
		for(int i = 0; i < nums.length; i++) {
			count[nums[i]]++; //counts number of each value in nums
		}
		int countSum = 0;
		int[] totalNums = new int[101];
		for(int i =  0; i < count.length; i++) {
			if(count[i] > 0){
					countSum+=count[i];
					totalNums[i] = countSum;
			}
		}
		int[] result = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			result[i] = totalNums[nums[i]] - count[nums[i]];
		}
		return result;
		
	}
	public static void main(String[] args) {
		
	}

}
