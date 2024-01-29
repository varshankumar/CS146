package lab_1;

import java.util.HashMap;

public class Lab1 {
	public static void main(String args[]) {
	int[] nums= {0,1,2,3,7,8,9};
	int target=12;
	HashMap<Integer, Integer> pairs=new HashMap<Integer, Integer>();
	
	for(int i=0; i<nums.length; i++) {
		pairs.put(nums[i], target-nums[i]);
	}
	
	int first=0;
	for(int j:nums) {
		for(int k=1;k<nums.length;k++) {
		if(pairs.get(j)==nums[k]) {
			System.out.println(first+" "+k);
			return;
		}
	}
		first++;
	}
	}
}
