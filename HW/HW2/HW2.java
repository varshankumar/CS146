package hw2;

public class HW2 {
static String[] versions= 
{"g","g","g","g","b","b","b","b","b","b","b"};

static boolean isBadVersion(int version) {
	if(versions[version].equals("g")){
		return false;
	}
	return true;
}

public static void main(String[] args) {
	if(isBadVersion(0)) {
		System.out.println(0);
		return;
	}
	
	int n=versions.length;
	int last_good=0;
	int first_bad=n-1;
	int ind=n/2;
	
	while(0<ind & ind<n) {
		if(isBadVersion(ind) & !isBadVersion(ind-1)) {
			System.out.println(ind);
			return;
		}
		else if(isBadVersion(ind)) {
			first_bad=ind;
			ind=(last_good+ind)/2;
		}
		else {
			last_good=ind;
			ind=(ind+first_bad)/2;
		}
	}
}
}
