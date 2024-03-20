package hw11;
import java.util.ArrayList;

public class HW11 {
	public int[][] floodFill(int[][] image, int sr, int sc, int color) {
	       // Your code here
		   int original = image[sr][sc];
		   int m=image.length;
		   int n=image[0].length;
		   if(original == color) return image;
		   image[sr][sc] = color;
		   if(sr<m-1 && image[sr+1][sc]==original)
			   image=floodFill(image, sr+1, sc, color);
		   if(sr>0 && image[sr-1][sc]==original) 
			   image=floodFill(image, sr-1, sc, color);
		   if(sc<n-1 && image[sr][sc+1]==original) 
			   image=floodFill(image, sr, sc+1, color);
		   if(sc>0 && image[sr][sc-1]==original) 
			   image=floodFill(image, sr, sc-1, color);
		   return image;

	    }
	
	public static void main(String args[]) {
		int[][] image = {
	            {1, 1, 1},
	            {1, 1, 0},
	            {1, 0, 1}
	        };
		HW11 h=new HW11();
		image=h.floodFill(image, 1, 1, 2);
				for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

	}
}
