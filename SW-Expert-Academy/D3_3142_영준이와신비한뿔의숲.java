import java.util.*;
import java.io.*;

class Solution { 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
            int x=0,y=0;
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            y = N-M; x = (2*M)-N;
            System.out.println("#"+t+" "+x+" "+y);
        }
    }  
}
