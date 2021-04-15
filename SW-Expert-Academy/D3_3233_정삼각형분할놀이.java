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
            System.out.println("#"+t+" "+(long)(Math.pow((a/b), 2)));
        }
    }  
}
