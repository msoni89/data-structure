Binary Search: Search a sorted array by repeatedly dividing the search interval in half. 
Begin with an interval covering the whole array. 
If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half.
Repeatedly check until the value is found or the interval is empty.


For example, consider the following sequence of integers sorted in ascending order and say we are looking for the number 55:

[0,	5,	13,	19,	22,	41,	55,	68,	72,	81,	98]
