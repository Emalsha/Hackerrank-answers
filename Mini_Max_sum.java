/*

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format

A single line of five space-separated integers.

Constraints

    #Each integer is in the inclusive range (1,10^9).

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mini_Max_sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] num = new long[5];
        num[0] = a;
        num[1] = b;
        num[2] = c;
        num[3] = d;
        num[4] = e;
        
        int i = 0;
        long min = 0;
        long max = 0;
        while(i < 5){
            int index = 0;
            long sum = 0;
            for(long n:num){
                if(index != i){
                    sum += n;    
                }
                index++;
            }
            i++;
            min = (min < 1 ? sum:min);
            if(sum >max){
                max = sum;
            }
            if(sum <min){
                min = sum;
            }
            System.out.println(sum);
        }
        
        System.out.print(min+" "+max);
        
    }
}
