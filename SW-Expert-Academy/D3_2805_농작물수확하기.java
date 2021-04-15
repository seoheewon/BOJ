import java.util.*;
import java.io.*;

class Solution { 
	static int[][] map = new int[50][50];
	static int chk, N, sum = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
        	N = Integer.parseInt(br.readLine());
        	chk = (N-1)/2;
        	for(int i=0;i<N;i++) {
        		String str = br.readLine();
        		for(int j=0;j<N;j++) {
        			map[i][j] = Integer.parseInt(str.substring(j, j+1));
        			if(i<chk) {
        				if(j>=chk-i && j<=chk+i) { 
        					sum += map[i][j]; 
        				}
        			}
        			else if(i==chk) { sum += map[i][j]; }
        			else if(i>chk) {
        				if(j>=(i-chk) && j<=((N-1)-(i-chk))) {
        					sum += map[i][j];
        				}
        			}
        		}
        	}
        	System.out.println("#"+t+" "+sum);
        	chk=0; sum=0; 
        	for(int i=0;i<N;i++) {  for(int j=0;j<N;j++) { map[i][j] = 0; } }
        }
	}
}
