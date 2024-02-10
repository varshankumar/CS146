There are three loops in the code.
The outer loop runs rows_A times.
The second inner loop runs cols_B times.
The third inner loop runs cols_A times.

The total number of iterations would be rows_A * cols_B * cols_A times.

Since all these values are variable, we can denote them with n.
So the total number of iterations would be n * n * n or n^3.

Therefore, the time complexity would be O(n^3).
