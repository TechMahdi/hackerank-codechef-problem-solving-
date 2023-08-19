import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
     Scanner input = new Scanner(System.in);
     int n;
     n=input.nextInt();
     for(int i=1;i<=10;i++)
     {
         //int c= num*i;
        // N x i = result.
         
         System.out.printf("%d x %d = %d\n",n,i,n*i);
     }
    }
}
