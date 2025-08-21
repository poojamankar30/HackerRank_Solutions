/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

A will consist at most 50 lower case english letters.

Sample Input
madam
Sample Output
Yes
*/

//Code:
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        boolean ispalindrome= true;
        int i=0; int j= A.length()-1;
        while(i<j){
            
            if(A.charAt(i)!=A.charAt(j)){
              ispalindrome=false;
              break;
            }
             i++;
             j--;
             
        }
           if(ispalindrome)
           System.out.println("Yes");
           else 
           System.out.println("No");
    }
}

//Output:
/*
Input (stdin)
madam
Your Output (stdout)
Yes
Expected Output
Yes*/
