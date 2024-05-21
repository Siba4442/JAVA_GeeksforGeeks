import java.util.*;
import java.io.*;

class Geeks{
    
    // Function to print a and c
    //comment the line that outputs b
    void comment(int a, int b, int c){
        
        //Prints a
        System.out.println(a);
        //Prints b
        //System.out.println(b); 
        //Commented out the print statement
        //Prints c
        System.out.println(c);
    }
    
}


public class Q2_Learn_to_Comment {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase --> 0 ) {
            int a = new sc.nextInt();
            int b = new sc.nextInt();
            int c = new sc.nextInt();
            
            Geeks g = new Geeks();

            g.comment(a, b, c);
    }
    sc.close();
}
