/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

Input Format

1 3 4 2 2
Single line of integers, that are the elements of the input array.
Constraints

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
Output Format

2
Single integer, that is answer.
Sample Input 0

5
1 3 4 2 2
Sample Output 0

2
*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
      }
      for(int i=0;i<n;i++){
        int temp = arr[i];
        for(int j=i+1;j<n;j++){
          if(temp == arr[j]){
          System.out.println(temp);
        }
        }
      }
    }
}
