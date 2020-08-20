package runningSum;

/**
 * Running Sum of 1d Array
 * returns the running sum of a given array
 * example: input: [1,2,3]
 * output: [1,3,6]
 * 
 * @author Jachen
 * 8/19/20
 *
 */
class RunningSum {
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum = nums[i] + sum;
			nums[i] = sum;
		}
		return nums;
	}
	public static void main(String[] args) {
	}
}
