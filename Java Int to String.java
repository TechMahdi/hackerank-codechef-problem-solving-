import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      //  Scanner input =new Scanner (System.in);
          //  int n;
            Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = Integer.toString(n);
         if (s1 instanceof String) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
