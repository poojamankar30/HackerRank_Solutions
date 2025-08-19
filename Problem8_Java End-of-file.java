/*
Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.

Sample Input

Hello world
I am a file
Read me until end-of-file.
Sample Output

1 Hello world
2 I am a file
3 Read me until end-of-file.
*/

//CODE:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int lineNo=1;
        while(sc.hasNext()){
        String Line=sc.nextLine();
      
         System.out.println(lineNo+" "+ Line);
        lineNo++;
        }
        
        sc.close();
    }
}

//OUTPUT:

Input (stdin)
Hello world
I am a file
Read me until end-of-file.
  
Your Output (stdout)
1 Hello world
2 I am a file
3 Read me until end-of-file.
  
Expected Output
1 Hello world
2 I am a file
3 Read me until end-of-file.
