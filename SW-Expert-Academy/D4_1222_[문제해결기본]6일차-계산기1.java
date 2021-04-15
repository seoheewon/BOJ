import java.util.*;
import java.io.*;

class Solution {
	static String[][] map = new String[8][8];
	static int N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=10;t++) { 
        	N = Integer.parseInt(br.readLine());
        	long sum = 0;
        	String str = br.readLine();
        	for(int i=0;i<N;i++) {
        		if(i%2==0) sum = sum + Integer.parseInt(str.substring(i, i+1));
        	}
        	System.out.println("#"+t+" "+sum); 
        }
	}
}

