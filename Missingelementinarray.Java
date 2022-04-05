/*Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Input Format

N = 5 A[] = {1,2,3,5}

Constraints

1<=N<=10^6 1<=A[i]<=10^6

Output Format

4

Sample Input 0

5

1 2 3 5

Sample Output 0

4*/





import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n-1];

        for(int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }

        int ind=-1;

        int arr1[]=new int[n];

        for(int i=0;i<n;i++){

            arr1[i]=i+1;

        }

        for(int i=0;i<arr1.length;i++){

            int flag=0;

            for(int j=0;j<arr.length;j++){

                if(arr1[i]==arr[j]){

                    flag=1;

                    break;

                }

            }

            if(flag==0){

                System.out.println(arr1[i]);

                break;

            }

        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    }

}
