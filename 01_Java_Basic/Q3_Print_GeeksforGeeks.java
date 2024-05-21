import java.util.*;
import java.io.*;

//Comment out the line System.out.println("Hello World");

class Geeks {
    static void print () {
        //Print Hello World
        //System.out.println("Hello World");
        //Print GeeksforGeeks
        System.out.println("GeeksforGeeks");
    }
}


public class Q3_Print_GeeksforGeeks {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while(testcase --> 0) {
            Geeks g = new Geeks();
            g.print();
        }
        sc.close();
    }
}

