package EC_graph_adjacency;
import java.util.*;


public class GraphConversion {
	static ArrayList<ArrayList<Integer>> listToMatrix(ArrayList<ArrayList<Integer>> list) {
		int n = list.size();
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < n; i++) {
			matrix.add(new ArrayList<Integer>());
			for (int j = 0; j < n; j++) {
				matrix.get(i).add(0);
			}
		}
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					matrix.get(i).set(j, 0);
				} else if (list.get(i).contains(j)) {
					matrix.get(i).set(j, 1);
				}
				else {
					matrix.get(i).set(j, 0);
				}
			}
		}
		return matrix;
	}
	
	static ArrayList<ArrayList<Integer>> matrixToList(ArrayList<ArrayList<Integer>> matrix) {
		int n = matrix.size();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix.get(i).get(j) == 1) {
					list.get(i).add(j);
				}
			}
		}
		return list;
	}
	
	static ArrayList<ArrayList<Integer>> reverseDirectionAdjacencyList(ArrayList<ArrayList<Integer>> list) {
		ArrayList<ArrayList<Integer>> reverseList = new ArrayList<ArrayList<Integer>>();
		int n = list.size();

		for (int i = 0; i < n; i++) {
			reverseList.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < n; i++) {
			for (int j : list.get(i)) {
				reverseList.get(j).add(i);
			}
		}
		return reverseList;
	}
	
	static ArrayList<ArrayList<Integer>> reverseDirectionAdjacencyMatrix(ArrayList<ArrayList<Integer>> matrix) {
		ArrayList<ArrayList<Integer>> reverseMatrix = new ArrayList<ArrayList<Integer>>();
		int n = matrix.size();

		for (int i = 0; i < n; i++) {
			reverseMatrix.add(new ArrayList<Integer>());
			for (int j = 0; j < n; j++) {
				reverseMatrix.get(i).add(0);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				reverseMatrix.get(j).set(i, matrix.get(i).get(j));
			}
		}
		return reverseMatrix;
	}
	
	ArrayList<ArrayList<Integer>> matrix= new ArrayList<ArrayList<Integer>>();
	ArrayList<ArrayList<Integer>> list= new ArrayList<ArrayList<Integer>>();
	
	 public static void main(String[] args) {
		 
	        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
	        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 0)));
	        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1, 0, 0)));
	        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0)));
	        matrix.add(new ArrayList<>(Arrays.asList(0, 1, 0, 0, 1)));
	        matrix.add(new ArrayList<>(Arrays.asList(0, 0, 1, 1, 0)));

	        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	        list.add(new ArrayList<>());
	        list.add(new ArrayList<>(Arrays.asList(0, 2))); 
	        list.add(new ArrayList<>(Arrays.asList(3)));
	        list.add(new ArrayList<>(Arrays.asList(1)));
	        list.add(new ArrayList<>(Arrays.asList(2, 3)));
	        
	        System.out.println(listToMatrix(list));
	        System.out.println(matrixToList(matrix));
	        System.out.println(reverseDirectionAdjacencyList(list));
	        System.out.println(reverseDirectionAdjacencyMatrix(matrix));
	 }
}
