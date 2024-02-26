We can use heaps as priority queues by using the heap condition as the priority level. The element with the highest priority will be at the top because it will have the "max priority". To get the next element in the priority queue, we can remove the top element, which will be replaced by the second highest priority element. 

This diagram shows an example of a heap that can be used as a priority queue:
```
        16
      /    \
    14      10
   /  \    /  \
  8    7  9    3 
 / \  
2   4
```
If the numbers represent the level of priority for each element, then the element with the maximum priority is at the top. If we are done with the first element, we can remove it, and using heapify, we can get the element with the next highest priority at the top.
```
          14
        /    \
       8      10
     /  \    /  \
    4    7  9    3 
   /
  2 
```

After removing 16, the heap will be rearranged to get the next highest priority element, 14, at the top.


It is possible to use a max heap as a min heap without writing a new implementation for a min heap. We can convert a max heap into a min heap by using heapsort with the inverse condition, the min becomes the max. We can remove the topmost element and swap it with the bottom-right-most element. We can repeat this heapify process with the opposite condition, checking if the children are smaller than the parent, instead of checking if the children are greater than the parent. 

Pseudocode:
```
Heap(max_heap):
 	while heap.max>heap.max.left or heap.max>heap.max.right:
		min_heap.append(max_heap.poll())
		max_heap.heapify()
 ```
