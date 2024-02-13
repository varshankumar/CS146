Problem 1:
10000000000n2^ vs n^3
n^3 is asymptotically greater because n^3 grows faster than n^2. We can ignore the coefficient because it does not contribute to the growth.

n^2 log(n) vs n(log(n))^10
We can use the log rules to manipulate the equations. We can take the log of both sides to get log(n^2)+log(log(n)) vs log(n)+log(log(n)^10)
2log(n)+log(log(n)) vs log(n)+10(log(log(n))
We can see that the log factors are too small to consider for the time complexity.
n^2 log(n) is asymptotically greater because the n^2 grows faster than n. The log(n) factors do not grow as fast as the n factors, so we only look at the n factors to check for growth.

n^logn vs 2^(sqrt(n))
2^(sqrt(n)) is asymptotically greater because 2^n grows faster than n^k.
 
2^n vs 2^(2n)
Both are asymptotically equal to each other. 2^(2n) can be rewritten as (2^2)^n. Since we can treat constants the same, both are asymptotically equivalent to O(2^n).


Problem 2:
The best case would be if the number is an even number because the function would return false in one iteration of the loop. The best case would have a time complexity of O(1).

The worst case would be if n is not a prime number. The terminal condition is i*i>n, i>sqrt(n). So the time complexity is O(sqrt(n)).

The average case would be if n is an odd prime number. The loop would iterate until a factor of n is found. The loop would at most increment sqrt(n) times. So the time complexity would be O(sqrt(n)).

