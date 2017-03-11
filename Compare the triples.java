/* 
Problem :

Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet A = (a0,a1,a2), and the rating for Bob's challenge to be the triplet B=(b0,b1,b2).

Your task is to find their comparison points by comparing a0 with b0 ,a1 with b1 and a2 with b2.

    If a0>b0, then Alice is awarded point.
    If a0<b0, then Bob is awarded point.
    If a0=b0, then neither person receives a point.

Comparison points is the total points a person earned.

Given and , can you compare the two challenges and print their respective comparison points?

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] compare(int a, int b){
        int a_val = 0;
        int b_val = 0;
        
        if(a>b){
            a_val = 1;
        }else if(a < b){
            b_val = 1;
        }
        
        int val[] = new int[2];
        val[0] = a_val;
        val[1] = b_val;
        
        return val; 
            
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        //Compare compare = new Compare();
        
        int[][] val = new int[3][2];
        val[0] = compare(a0,b0);
        val[1] = compare(a1,b1);
        val[2] = compare(a2,b2);
        
        int a = 0;
        int b = 0;
        
        for(int val_child[] :val){
            a += val_child[0];
            b += val_child[1];
        }
        
        System.out.print(a+" "+ b);
        
    }
}
