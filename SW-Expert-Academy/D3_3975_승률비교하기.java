import java.util.*;
import java.io.*;

class Solution { 
    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
        	String str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str," ");
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int c = Integer.parseInt(st.nextToken());
        	int d = Integer.parseInt(st.nextToken());
        	
        	if((double)a/b > (double)c/d) System.out.println("#"+t+" ALICE");
        	else if((double)a/b == (double)c/d) System.out.println("#"+t+" DRAW");
        	else if((double)a/b < (double)c/d) System.out.println("#"+t+" BOB");
        }
    }  
}
