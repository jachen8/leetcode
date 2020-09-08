package subtractProductAndSum;

import java.util.ArrayList;

/*
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * 1 <= n <= 10^5
 */
public class Solution {
	public static int subtractProductAndSum(int n) {
		int sum = 0;
		int product = 1;
		while(n > 0) {
			sum = sum + (n % 10);
			product = product * (n % 10);
			n = n / 10;
		}
		return product - sum;
	}
	public static void main(String[] args) {
		int n = 1234;
		System.out.println(subtractProductAndSum(n));
	}
}
