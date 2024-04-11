package lab7;

public class Lab7 {

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int[][] dist = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dist[i][j]=Integer.MAX_VALUE;
			}
		}


        for (int[] edge : edges) {
            dist[edge[0]][edge[1]] = edge[2];
            dist[edge[1]][edge[0]] = edge[2];
        }


        for (int v = 0; v < n; v++) {
            dist[v][v] = 0;
        }


        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][j] > dist[j][k] + dist[i][k]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }


        int lowestCity = n;
        int lowestCityCount = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int cityCount = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    cityCount++;
                }

            }
            if (cityCount <= lowestCityCount) {
                lowestCityCount = cityCount;
                lowestCity = i;

            }
        }
        return lowestCity;
    }

    public static void main(String args[]) {
        int[][] edges = {{0, 1, 2}, {0, 4, 8}, {1, 2, 3}, {1, 4, 2}, {2, 3, 1}, {3, 4, 1}};
        int n = 5;
        int distanceThreshold = 2;
        Lab7 test = new Lab7();
        System.out.println(test.findTheCity(n, edges, distanceThreshold));
		edges = new int[][]{{0, 1, 3}, {1, 2, 1}, {1,3 ,4}, {2,3,1}};
		distanceThreshold=4;
		n=4;
		System.out.println(test.findTheCity(n, edges, distanceThreshold));
    }
}
