package hw8;

import java.util.HashMap;

public class HW8 {
	
	public int longestPalindrome(String s) {
		int highestOdd=-1;
		int length=0;
		HashMap<Character, Integer> counts=new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++) {
			Integer c=counts.get(s.charAt(i));
			if(c!=null) {
				counts.remove(s.charAt(i));
				counts.put(s.charAt(i), c+1);
			}
			else {
				counts.put(s.charAt(i), 1);
			}
		}
		for(int j:counts.values()) {
			if(j%2==0) length+=j;
			else {
				if(j>highestOdd) highestOdd=j;
			}
		}
		if(highestOdd!=-1) length+=highestOdd;
		return length;
    }
	
	public static void main(String args[]){
		HW8 p=new HW8();
		System.out.println(p.longestPalindrome("abccccdd"));
		System.out.println(p.longestPalindrome("speediskey"));
	}

}
