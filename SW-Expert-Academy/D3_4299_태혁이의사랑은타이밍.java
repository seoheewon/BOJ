import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws Exception {
 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {
        	String str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str," ");
        	int hour = 0; int min = 0; 
        	int D = Integer.parseInt(st.nextToken());
        	int H = Integer.parseInt(st.nextToken());
        	int M = Integer.parseInt(st.nextToken());
        	if(D==11 && H==11 && M==11) { System.out.println("#"+t+" 0"); }
        	else if((D==11 && H<11) || (D==11 && H==11 && M<11)) { System.out.println("#"+t+" -1"); }
        	else {
        		if(D==11) {
        			if(H==11) { System.out.println("#"+t+" "+(M-11)); }
        			else { System.out.println("#"+t+" "+(49+M+(24-(H+1)))); }
        		}
        		else {
        			min = 49 + M; hour = 12 + ((D-12)*24) + H;
        			System.out.println("#"+t+" "+((hour*60)+min));
        		}
        	}
        }
    }
}
