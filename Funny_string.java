import java.io.*;
import java.util.*;

public class Funny_string {

    public static void sample(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        while(n>0){
            n--;
            String str = input.nextLine();

            int len = str.length();
            
            int sub[] = new int[len-1];
            char ca[] = str.toCharArray();
           
            for(int i = 1;i<len;i++){
                sub[i-1] = Math.abs((int)ca[i] - (int)ca[i-1]);
            }

            int di = 0;
            if(len % 2 == 1){
                di = (len / 2) + 1;
            }else{
                di = len / 2 ;
            }
           
           int x=0;
            while(di>x){
                
                if(sub[x] != sub[(len-2)-x]){
                    System.out.println("Not Funny");
                    break;
                }
                x++;
            }

            if(x == di){
                System.out.println("Funny");
            }

        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        sample();
    }
}