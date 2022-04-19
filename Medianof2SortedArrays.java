/*Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Input Format

2
1 3
1
2
First line takes the length of the first Array.
Second line takes the input array.
Third line takes the input of the length of second array.
Fourth line takes the second inout array.
Constraints

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
Output Format

2
Single integer denoting the median of two sorted arrays.
Sample Input 0

2
1 3
1
2
Sample Output 0

2
Contest ends in 5 minutes
Submissions: 77
Max Score: 30
Difficulty: Medium
Rate This Challenge:

    
More
*/


// Java code for median with
// case of returning double
// value when even number of
// elements are present in
// both array combinely
import java.io.*;
 
class GFG
{
    static int []a = new int[]{900};
    static int []b = new int[]{10, 13, 14};
 
    // Function to find max
    static int maximum(int a, int b)
    {
        return a > b ? a : b;
    }
     
    // Function to find minimum
    static int minimum(int a, int b)
    {
        return a < b ? a : b;
    }
     
    // Function to find median
    // of two sorted arrays
    static double findMedianSortedArrays(int n,
                                         int m)
    {
         
        int min_index = 0,
            max_index = n, i = 0,
            j = 0, median = 0;
         
        while (min_index <= max_index)
        {
            i = (min_index + max_index) / 2;
            j = ((n + m + 1) / 2) - i;
         
            // if i = n, it means that Elements
            // from a[] in the second half is an
            // empty set. and if j = 0, it means
            // that Elements from b[] in the first
            // half is an empty set. so it is
            // necessary to check that, because we
            // compare elements from these two
            // groups. Searching on right
            if (i < n && j > 0 && b[j - 1] > a[i])    
                min_index = i + 1;
                     
            // if i = 0, it means that Elements
            // from a[] in the first half is an
            // empty set and if j = m, it means
            // that Elements from b[] in the second
            // half is an empty set. so it is
            // necessary to check that, because
            // we compare elements from these two
            // groups. searching on left
            else if (i > 0 && j < m && b[j] < a[i - 1])    
                max_index = i - 1;
     
            // we have found the desired halves.
            else
            {
                // this condition happens when we
                // don't have any elements in the
                // first half from a[] so we
                // returning the last element in
                // b[] from the first half.
                if (i == 0)        
                    median = b[j - 1];        
                 
                // and this condition happens when
                // we don't have any elements in the
                // first half from b[] so we
                // returning the last element in
                // a[] from the first half.
                else if (j == 0)        
                    median = a[i - 1];        
                else   
                    median = maximum(a[i - 1],
                                     b[j - 1]);        
                break;
            }
        }
         
        // calculating the median.
        // If number of elements is odd
        // there is one middle element.
        if ((n + m) % 2 == 1)
            return (double)median;
             
        // Elements from a[] in the
        // second half is an empty set.
        if (i == n)
            return (median + b[j]) / 2.0;
             
        // Elements from b[] in the
        // second half is an empty set.
        if (j == m)
            return (median + a[i]) / 2.0;
         
        return (median + minimum(a[i],
                                 b[j])) / 2.0;
    }
     
    // Driver code
    public static void main(String args[])
    {
        int n = a.length;
        int m = b.length;
         
        // we need to define the
        // smaller array as the
        // first parameter to
        // make sure that the
        // time complexity will
        // be O(log(min(n,m)))
        if (n < m)
            System.out.print("The median is : " +
                   findMedianSortedArrays(n, m));
        else
            System.out.print("The median is : " +
                   findMedianSortedArrays(m, n));
    }
}
 
// This code is contributed by
// Manish Shaw(manishshaw1)
