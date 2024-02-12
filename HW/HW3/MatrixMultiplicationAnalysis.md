MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B):                                         1
    raise ValueError("Matrix multiplication is not defined.")      1

  rows_A ← number of rows in A                                     1
  cols_A ← number of columns in A                                  1
  cols_B ← number of columns in B                                  1
  result ← matrix of size rows_A x cols_B filled with zeros        1

  for i from 1 to rows_A do:                                       rows_A
    for j from 1 to cols_B do:                                     cols_B
      sum ← 0                                                      rows_A * cols_B
      for k from 1 to cols_A do:                                   rows_A * cols_B * cols_A
        sum ← sum + A[i][k] * B[k][j]                              rows_A * cols_B * cols_A
    result[i][j] ← sum                                             rows_A * cols_B  
  return result                                                    1

7+ rows_A + cols_B + 2* rows_A * cols_B + 2 * rows_A * cols_B * cols_A

rows_A, cols_A, and cols_B are all variables and can be approximated as N.
7 + 2N + 2N^2 + 2N^3

The highest-order term is 2N^3 so the function is cubic.
