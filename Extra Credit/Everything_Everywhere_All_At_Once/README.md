Adjacency List to Adjacency Matrix:
- Count number of verticies, n= length of list
- Create matrix (2D list) of n*n size and initialize all values to 0
- Loop through the adjacency list
  - For each vertex list i
    - For each vertex j in i
      - if j is in i, then matrix[i][j]=1
      - else matrix[i][j]=0

Adjacency Matrix to Adjacency List:
- Count number of verticies, n=length of matrix
- Create list (2D list) of n size with initial values of empty lists
- Loop though the adjacency matrix
  - For each vertex i
    - For each neighbor j of i
      - if matrix[i][j] is 1, then add j to i's list

Reversing Directions For Adjacency List:
- Create adjacency list with same size
- Loop though original adjacency list
    - For each vertex list i
      - For each neighbor j
        - Add i to j's list

Reversing Directions For Adjacency Matrix:
- Create adjacency matrix of same size
- Loop through original matrix
  - For each vertix index i
    - For each neighbor index j
      - set the new matrix[i][j] to original matrix[j][i]
