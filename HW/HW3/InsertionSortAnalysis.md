InsertionSort(A,n)            1
for i=2 to n                  n-1
  key=A[i]                    n-1
  j=i-1                       n-1
  while j>0 and A[j]>key      (n-1)*i
    A[j+1]=A[j]               (n-1) * (i-1)
    j=j-1                     (n-1) * (i-1)
  A[j+1]                      n-1
1 + n-1 + n-1 + n-1 +(n-1)*i + (n-1) * (i-1) + (n-1) * (i-1) + n-1

This function is quadratic since the highest order term is (n-1) * i
