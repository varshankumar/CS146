package hw6;
import java.util.*;

public class Triplets {
	public List<List<Integer>> threeSum(int[] nums) {

	       // Your code here
		HashSet<ArrayList<Integer>> r=new HashSet<ArrayList<Integer>>();
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						ArrayList<Integer> a=new ArrayList<Integer>();
						a.add(nums[i]);
						a.add(nums[j]);
						a.add(nums[k]);
						r.add(a);
					}
				}
			}
			
		}
		return new ArrayList<List<Integer>>(r);
	    }
	
	public static void main(String args[]) {
		Triplets t=new Triplets();
		int[] arr= {-5,0,5,10,-10,0, 5, 5, -10, 5, 5};
		System.out.println(t.threeSum(arr));
	}
}
