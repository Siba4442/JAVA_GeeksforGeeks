import java.util.*;
import java.io.*;
import java.lang.*;
public class Q1_Length_of_String {
    public static void main(String[] args) throws IOException {
    //Reading input using BufferedReader class 
    BufferedReader read = new BufferedReader ((new InputStreamReader(System.in)));
    //coverting the String to Integer for
    //total count of testcases
    int t = Integer.parseInt(read.readLine());
    while(t-->0)
        {
        //Reading the String
        String str = read.readLine();
        //calling the method of lengthString
        //the result
        System.out.println(new Solution().lengthString(str));
        //of class StringLength and printing
        }
    }
}
// } Driver Code Ends {

//User function Template for Java

class Solution
{
    // Complete the function
    // str: input string
    public static int lengthString(String str)
    {
        // find the length of string
        return str.length();
    }
}