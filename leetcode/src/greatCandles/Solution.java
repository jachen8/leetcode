package greatCandles;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		List<Boolean> greatestKid = new ArrayList <>();
		int max = 0;
		for(int i = 0; i < candies.length; i++) {
			if(candies[i] > max){
				max = candies[i];
			}
		}
		for(int i = 0; i < candies.length; i++) {
			greatestKid.add(candies[i] + extraCandies >= max);
		}
		return greatestKid;
	}
}
