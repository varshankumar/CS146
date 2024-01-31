package lab2;

import java.util.*;

public class lab2 {
	
	public static void main(String args[]) {
		String s="heart";
		String t="earth";
		
		char[] sa=s.toCharArray();
		char[] ta=t.toCharArray();		
		Arrays.sort(sa);
		Arrays.sort(ta);

		if(Arrays.equals(sa, ta)) System.out.println("YES");
		else System.out.println("NO");
	}
}
