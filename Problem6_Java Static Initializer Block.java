/*You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth B and height H. 
You should read the variables from the standard input.

Input Format:- There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Output Format:- If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input :
1
3
Sample output :
3

Sample input :
-1
2
Sample output :
java.lang.Exception: Breadth and height must be positive
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       boolean flag=false;
       int B;
       int H;
      
       Scanner sc= new Scanner(System.in);
       B= sc.nextInt();
       H= sc.nextInt();
       
       if(B>0 && B<=100 && H >0 && H<=100){
          flag=true;
       }else{
          System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
       
       if(flag){
         int area=B*H;
         System.out.println(area);
       }
    }
}
//OUTPUT:

Input (stdin)
1
3
Your Output (stdout)
3
Expected Output
3
