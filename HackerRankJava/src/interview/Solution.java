package interview;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int i=0,j=0;
        Scanner read=new Scanner(s);
        int n=read.nextInt();
        int t=read.nextInt();
        int[] width=new int[n];
        int[][] testCase=new int[t][2];
        read=new Scanner(br.readLine());
        for(i=0;i<n;i++)
        {
            width[i]=read.nextInt();
        }
         for(i=0;i<t;i++)
        {
            read=new Scanner(br.readLine());
            testCase[i][0]=read.nextInt();
            testCase[i][1]=read.nextInt();
        }
        for(i=0; i<testCase.length; i++)
        {
            int entry=testCase[i][0];
            int exit=testCase[i][1];
            int min=999;
            for(j=entry; j<=exit; j++)
            {
                min=Math.min(min, width[j]);   
            }
            System.out.println(min);
        }
    }
}