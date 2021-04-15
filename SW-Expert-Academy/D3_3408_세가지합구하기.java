import java.util.*;
import java.io.*;

public class Solution3 { 
    static long s1,s2,s3;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
        	long N = Integer.parseInt(br.readLine());
        	s1 = N*(N+1)/2;
   	        s2 = N * N; 
        	s3 = s1 * 2; 
        	System.out.println("#"+t+" "+s1+" "+s2+" "+s3);
        	s1=0;s2=0;s3=0;
        }
    }  
}
// s1 = 1 + 2 + 3 + 4 + ... <- n(n+1)/2
// s2 = 1 + 3 + 5 + 7 + ... <- 짝수만 N개면.. N*N
// s3 = 2 + 4 + 6 + 8 + ... <- 홀수만 N개면.. s1*2 
