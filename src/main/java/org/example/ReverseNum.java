package org.example;

public class ReverseNum {
// The runtime of this function would be O(n),
// where n is the number of digits in the longer linked list.
// This is because for each digit, we need to traverse the linked list, add the corresponding digits, and create a new node for the result.
// Since each node can only be visited once, the total time complexity is proportional to the number of digits in the longer linked list, which is O(n).
//The sorting algorithm with the best runtime efficiency varies depending on the scenario.
//
//Best case scenario for Quick Sort is O(n log n) if the pivot element is chosen optimally,
// leading to a balanced partition.
//
//Worst case scenario for Quick Sort is O(n^2) if the pivot element is chosen poorly,
// leading to an imbalanced partition. In such a case, the performance of Quick Sort becomes similar to that of Insertion Sort.
//
//Average case scenario for Quick Sort is O(n log n),
// making it one of the most efficient sorting algorithms in terms of average case performance.

    public int recursiveSearch(String sought, String[] items, int startIndex) {
        if (startIndex >= items.length) {
            return -1;
        } else if (items[startIndex].equals(sought)) {
            return startIndex;
        } else {
            return recursiveSearch(sought, items, startIndex + 1);
        }
    }

    // To call the function:
    int result = recursiveSearch("hey", new String[] {"hey", "there", "you"}, 0);

//The runtime of this function is O(n) in the worst case,
// where n is the length of the items array. This is because in the worst case,
// the function must perform n recursive calls, one for each item in the array.



}

