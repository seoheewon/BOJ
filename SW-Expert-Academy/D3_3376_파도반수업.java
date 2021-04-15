import java.util.*;
import java.io.*;

class Solution { 
    static long[] len = new long[101];
    public static void main(String[] args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        len[0]=0; len[1]=1;len[2]=1; len[3]=1; len[4]=2;len[5]=2;
        len[6]=3; len[7]=4;len[8]=5; len[9]=7; len[10]=9;len[11]=12; 
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
            int N = Integer.parseInt(br.readLine());
            if(N<=11) {
                System.out.println("#"+t+" "+len[N]);
            }
            else {
                for(int i=12;i<=N;i++) {
        	    len[i] = len[i-1] + len[i-5]; 
        	}
        	System.out.println("#"+t+" "+len[N]);
            }
        }
    }  
}
