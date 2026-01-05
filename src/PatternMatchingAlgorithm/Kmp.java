package PatternMatchingAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class Kmp {
    public static void main(String[] args) {
        String text = "aabaacaadaabaaba";
        String pattern = "aaba";
        int n = text.length();
        int m = pattern.length();
        int[] lps = new int[m];
        ArrayList<Integer> Ans = new ArrayList<>();
        Ans = Computekmp(text, pattern, lps);
       for(int num:Ans){
           System.out.print(num+" ");
       }
    }
    static ArrayList<Integer> Computekmp(String text,String pattern,int[] lps){
        int n = text.length();
        int m = pattern.length();
        ArrayList<Integer>res=new ArrayList<>();
        computelps(pattern,lps);
        int i=0;
        int j=0;
        while(i<n){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==m){
                    res.add(i-j);
                    j=lps[j-1];
                }
            }
            else{
                if(j!=0)j=lps[j-1];
                else i++;
            }
        }
        return res;
    }
    static void  computelps(String pattern,int[] lps){
        int len=0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
}
