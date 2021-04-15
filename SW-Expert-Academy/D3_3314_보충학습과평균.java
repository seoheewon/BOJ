import java.util.*;
import java.io.*;

class Solution { 
    public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
       	    int sum = 0;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            while(st.hasMoreTokens()) {
        	int num = Integer.parseInt(st.nextToken());
        	if(num<40) { sum += 40; }
        	else { sum += num; }
            }   System.out.println("#"+t+" "+(sum/5));
        }
    }  
}
