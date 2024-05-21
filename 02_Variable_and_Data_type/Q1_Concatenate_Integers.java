import java.util.Scanner;
class Q1_Concatenate_Integers {

    public static void concatenate(int a, int b) {
        // Complete the code below to concatenate a and b
        String ans = Integer.toString(a) + Integer.toString(b);
        // Complete the code above to concatenate a and b
        System.out.println(ans);
    }

    public static void main (String args []) {
        Scanner scn = new Scanner(System.in) ;
        int t = scn.nextInt();
        while(t --> 0) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            concatenate(a, b);
        }
        scn.close();
    }

}
