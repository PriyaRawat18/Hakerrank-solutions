/*The final sorted array should not be returned by the function, but instead be printed as space separated.

Input Format

The first line contains an integer n, the length of the first array.

The next n lines contain an integer each, the elements of the array.

The next line contains an integer m, the length of the second array.

The next m lines contain an integer each, the elements of the second array.

Constraints

1 <= n,m <= 100

1 <= arr[i] <= 1000, where arr[i] is the ith element

Output Format

Print the elements of the merged sorted array.

Sample Input 0

3
1
2
3
3
2
5
6
Sample Output 0

1 2 2 3 5 6*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[]=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[n+m];
        for(int i=0;i<n;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<m;i++){
            arr3[n+i]=arr2[i];
        }
        for(int i=0;i<n+m-1;i++){
            for(int j=0;j<n+m-i-1;j++){
                if(arr3[j]>arr3[j+1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j+1];
                    arr3[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n+m;i++){
            System.out.print(arr3[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
