from typing import List


def findTheCity(self, n: int, edges: List[List[int]], distanceThreshold: int) -> int:
    dist=[]
    for i in range(n):
        dist.append([])
        for j in range(n):
            dist[i].append(float('inf'))

    for edge in edges:
        dist[edge[0]][edge[1]]=edge[2]
        dist[edge[1]][edge[0]]=edge[2]

    for v in range(n):
        dist[v][v]=0

    for k in range(n):
        for i in range(n):
            for j in range(n):
                if dist[i][j]>dist[i][k]+dist[k][j]:
                    dist[i][j]=dist[i][k]+dist[k][j]

    lowestCity=n;
    lowestCityCount=float('inf')
    for i in range(n):
        cityCount=0
        for j in range(n):
            if dist[i][j]<=distanceThreshold:
                cityCount+=1
        if cityCount<=lowestCityCount:
            lowestCityCount=cityCount
            lowestCity=i

    return lowestCity


edges=[[0,1,3],[1,2,1],[1,3,4],[2,3,1]]
n=4
distanceThreshold=4
print(findTheCity(None, n, edges, distanceThreshold))
edges=[[0,1,2],[0,4,8],[1,2,3],[1,4,2],[2,3,1],[3,4,1]]
n=5
distanceThreshold=2
print(findTheCity(None, n, edges, distanceThreshold))