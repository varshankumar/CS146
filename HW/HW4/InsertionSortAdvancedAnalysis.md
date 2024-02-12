For insertion sort:

The best case would be if all the elements were already sorted in order. This would have a time complexity of O(n) since all n elements would be checked to see if it is greater than the previous element.

The average case would be if there were some elements in order and some elements not in order. In this case, the outer loop would still run n-1 times. The inner loop will run either once or at most i-1 times, where i is directly proportional to n. The algorithm would run (n-1) * (i-1 + x) times where the loop runs i-1 times for cases where the element is not sorted and once x times for the cases where the element is sorted. Since the term (i-1+x) is variable, we can denote it with n. (n-1) can be approximated to n as well. This would make the time complexity O(n^2) for the average case.

The worst case was if the array was sorted in the reverse order. The outer loop would run n-1 times. The inner loop would run i-1 times where i is directly proportional to n. The algorithm would run n * (i-1) times which can be approximated to n^2. Therefore, the time complexity would be O(n^2).
