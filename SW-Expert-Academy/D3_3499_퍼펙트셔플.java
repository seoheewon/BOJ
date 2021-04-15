import java.util.*;
import java.io.*;

class Solution {
	static String[] word = new String[1000];
    public static void main(String[] args) throws Exception {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {
        	int N = Integer.parseInt(br.readLine());
        	String str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str," ");
        	for(int i=0;i<N;i++) { word[i] = st.nextToken(); }
            System.out.print("#"+t+" ");
        	if(N%2 == 0) {
            	for(int i=0;i<N/2;i++) {
            		System.out.print(word[i]+" "+word[(N/2)+i]+" ");
            	}
        	}
        	else {
        		for(int i=0;i<N/2;i++) {
        			System.out.print(word[i]+" "+word[(N/2+1)+i]+" ");
        		} System.out.print(word[N/2]);
        	}
        	System.out.println();
        	Arrays.fill(word,"");
        }
    }
}
