package hw1;

public class HW1 {
	public static void main(String args[]) {
		
		String s="level";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		
		if(s.equals(rev)) System.out.println("YES");
		else System.out.println("NO");
		
}
	
}
