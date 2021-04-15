import java.util.*;
import java.io.*;

class Solution { 
    static int[][] map = new int[10][10];
    static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {  
            N = Integer.parseInt(br.readLine());
            map[0][0] = 1;
            int cnt = 2;
            doit(0,0,0,cnt); // 0=동, 1=남, 2=서, 3=북
        	 
            System.out.println("#"+t);
            for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++) {
                    System.out.print(map[i][j]+" ");
                }System.out.println();
            }
            for(int i=0;i<10;i++) {
                for(int j=0;j<10;j++) {
        	    map[i][j] = 0;
        	} 
            }
        }
    } 
    public static void doit(int dir, int r, int c, int cnt) { 
        if(cnt<=N*N) {
	    switch(dir) {
	    case 0: // 동쪽으로 
	        if(c+1>=N || map[r][c+1]!=0) { doit(1,r,c,cnt); }
		else { map[r][c+1] = cnt; cnt++; doit(0,r,c+1,cnt); }
		break;
	    case 1: // 남쪽으로 
	        if(r+1>=N|| map[r+1][c]!=0) { doit(2,r,c,cnt); }
		else { map[r+1][c] = cnt; cnt++; doit(1,r+1,c,cnt); }
		break;
	    case 2: // 서쪽으로 
	        if(c-1<0|| map[r][c-1]!=0) { doit(3,r,c,cnt); }
		else { map[r][c-1] = cnt; cnt++; doit(1,r,c-1,cnt); }
		break;
	    case 3: // 북쪽으로 
	        if(r-1<0|| map[r-1][c]!=0) { doit(0,r,c,cnt); }
		else { map[r-1][c] = cnt; cnt++; doit(1,r-1,c,cnt); }
		break;	
            }
	}
    }
}
