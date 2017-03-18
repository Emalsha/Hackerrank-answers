/* 
    HackerLand University has the following grading policy:

    Every student receives a grade in the inclusive range from 0 to 100.
    Any grade less than 40 is a failing grade.

Sam is a professor at the university and likes to round each student's grade according to these rules:

    If the difference between the grade and the next multiple 5 of is less than 3, round up grade to the next multiple of 5.
    If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

For example,grade=84 will be rounded to 85 but grade=29 will not be rounded because the rounding would result in a number that is less than 40.

Given the initial value of grade for each of Sam's n students, write code to automate the rounding process. For each grade, round it according to the rules above and print the result on a new line.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            
            if(grade < 38){
                System.out.println(grade);
            }else{
                int mod = grade % 5;
                if((5 - mod) < 3){
                    grade += 5 - mod;
                    System.out.println(grade);
                }else{
                    System.out.println(grade);
                }
            }
        }
    }
}
