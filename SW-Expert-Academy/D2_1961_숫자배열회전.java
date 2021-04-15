import java.util.*;
import java.io.*;

class Solution { 
    static String[][] map = new String[7][7];
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {  
            N = Integer.parseInt(br.readLine());
            for(int i=0;i<N;i++) {
                String str = br.readLine();
        	StringTokenizer st = new StringTokenizer(str," ");
        	for(int j=0;j<N;j++) {
        	    map[i][j] = st.nextToken(); 
        	}
            }
            System.out.println("#"+t+" ");
            for(int i=0;i<N;i++) {
        	for(int j=N-1;j>=0;j--) {
           	    System.out.print(map[j][i]);
        	} System.out.print(" ");
        	for(int j=N-1;j>=0;j--) {
        	    System.out.print(map[N-1-i][j]);
        	} System.out.print(" ");
        	for(int j=0;j<N;j++) {
        	    System.out.print(map[j][N-1-i]);
        	} System.out.println();
            }
        }
    } 
}

