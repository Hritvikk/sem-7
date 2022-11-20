Sem 7

/*
Recursive fibbonacci:
Time Complexity: O(n*2n)
Auxiliary Space: O(n), For recursion call stack.
Iterative fibbonacci:
Time Complexity: O(n) 
Auxiliary Space: O(1)
*/


Huffman Coding :
Time complexity: O(nlogn) where n is the number of unique characters.
If there are n nodes, extractMin() is called 2*(n – 1) times. extractMin() takes O(logn) time as it calls minHeapify(). So, overall complexity is O(nlogn).



Fractional Knapsack :
Time Complexity: O(N * log N)
Auxiliary Space: O(N)



0/1 Knapsack :
Time Complexity: O(N*W). 
where ‘N’ is the number of weight element and ‘W’ is capacity. As for every weight element we traverse through all weight capacities 1<=w<=W.
Auxiliary Space: O(N*W). 
The use of 2-D array of size ‘N*W’.


N Queens
Time Complexity: O(N!)
Auxiliary Space: O(N^2)
 


