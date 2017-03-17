/*
    John has discovered various rocks. Each rock is composed of various elements, and each element is represented by a lower-case Latin letter from 'a' to 'z'. An element can be present multiple times in a rock. 
    An element is called a gem-element if it occurs at least once in each of the rocks.

Given the list of 'N' rocks with their compositions, display the number of gem-elements that exist in those rocks.

Input Format

The first line consists of an integer,'N' , the number of rocks.
Each of the next 'N' lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.
*/


import java.io.*;
import java.util.*;

public class Gemstone {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner input = new Scanner(System.in);
        short n = input.nextShort();
        input.nextLine();

        String str = input.nextLine();
        Set<String> res = new HashSet<String>();
        Set<String> rm = new HashSet<String>();

        for(char c : str.toCharArray()){
            String s = Character.toString(c);
            res.add(s);
        }

        for(int i = 1;i < n; i++){
            String st = input.nextLine();
            for(String c:res){
                if(!st.contains(c)){
                    rm.add(c);
                }
            }
        }

        res.removeAll(rm);
        System.out.println(res.size());

    }
}