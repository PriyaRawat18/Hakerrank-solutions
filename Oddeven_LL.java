/*The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

Input Format

The first line contains an integer N, the number of elements in the list.

The next line contains N space separated integer elemnts of the list.

Constraints

1 <= n <= 100, where n denotes the elements of linked list

Output Format

Print the rearranged Linked List

Sample Input 0

5
1
2
3
4
5
Sample Output 0

1 3 5 2 4*/



import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

        public class Solution {
            public static void main(String args[] ) throws Exception {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++){
                    arr[i]=sc.nextInt();
                }
                for(int i=0;i<n;i+=2){
                    System.out.print(arr[i]+" ");
                }
                for(int i=1;i<n;i+=2){
                    System.out.print(arr[i]+" ");
                }
                /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            }
        }
