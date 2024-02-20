Problem 1:
1. T(N) = 2T(N-1) + 1
a=2, b=1, k=0; a>1
T(N)=O(n^0*2^(n/1))=O(2^n)

2. T(N) = 3T(N-1) + n
a=3, b=1, k=1; a>1
T(N)=O(n^1*3^n/1)=O(n3^n)

3. T(N) = 9T(N/2) + n^2
a=9, b=2; f(n)=O(n^(log2(9)-e))=O(n^(3.17-e)), e>0
T(n)=THETA(n^(log2(9)))

4. T(N) = 100T(N/2) + n^(log2(cn) + 1)  (c is a constant)
T(N/2) = 100T(N/4) + (n/2)^(log2(cn) + 1)
T(N/4) = 100T(N/8) + (n/4)^(log2(cn) + 1)
...
T(N/2^k) = 100T(N/2^(k+1)) + (n/2^k)^(log2(cn) + 1)
T(N)=THETA(n^(log2(cn)+1))

6. T(N) = 4T(N/2) + n^2logn
a=4, b=2; f(n)=THETA(n^2logn), k=1, n^(logb(a))=n^(log2(4))=n^2
T(N)=THETA(n^2log^2(n))

7. T(N) = 5T(N/2) + n^2/logn
a=5, b=2; f(n)=n^2/logn, n^(logb(a))=n^(log2(5))=n^2.32
a * f(N/b) = 5 * f(n/2)
= 5 * (n/2)^2/log(n/2) <= c * f(n) = c*n^2/logn for c=2
T(N)=THETA(n^2/logn)
