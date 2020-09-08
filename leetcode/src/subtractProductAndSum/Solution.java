package subtractProductAndSum;

import java.util.ArrayList;

/*
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * 1 <= n <= 10^5
 */
public class Solution {
	public static int subtractProductAndSum(int n) {
		ArrayList<Integer> digits = new ArrayList<>();
//		for(int i = 0; i < digits.size(); i++) {
//			digits.add(i);
//			System.out.println(digits.get(i));
//		}
		while(n > 9) {
			digits.add(n % 10);
			n = n / 10;
		}
		int sum = 0;
		int product = 1;
		for(int i = 0; i < digits.size(); i++) {
			System.out.println(digits.get(i));
			sum += digits.get(i) + sum;
			product = digits.get(i) * product;
		}
		return product - sum;
	}
	public static void main(String[] args) {
		int n = 1000;
		System.out.println(subtractProductAndSum(n));
	}
}
