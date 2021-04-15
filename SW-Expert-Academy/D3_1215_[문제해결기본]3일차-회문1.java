import java.util.*;
import java.io.*;

class Solution {
	static String[][] map = new String[8][8];
	static int count = 0, N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=10;t++) { 
        	N = Integer.parseInt(br.readLine());
        	for(int i=0;i<8;i++) {
        		String str = br.readLine();
        		for(int j=0;j<8;j++) {
        			map[i][j] = str.substring(j, j+1);
        		}
        	}
        	if(N == 1) {
        		System.out.println("#"+t+" 64");
        	}
        	else {
        		find(N,0);
        		find(N,1);
        	}
        	System.out.println("#"+t+" "+count); count = 0;
        }
	}
	public static void find(int n, int rc) {
		int half = n/2;
		boolean TF = true;
		if(rc == 0) { // 가로
			for(int i=0;i<8;i++) {
				for(int j=0;j<=8-N;j++) {
					TF = true;
					for(int k=1;k<=N/2;k++) {
						if(!map[i][j+k-1].equals(map[i][(j+N)-k])) { TF = false; }
					}
					if(TF == true) { count++; }
				}
			}
		}
		else { // 세로
			for(int i=0;i<8;i++) {
				for(int j=0;j<=8-N;j++) {
					TF = true;
					for(int k=1;k<=N/2;k++) {
						if(!map[j+k-1][i].equals(map[(j+N)-k][i])) { TF = false; }
					}
					if(TF == true) { count++; }
				}
			}
		}
	}
}

