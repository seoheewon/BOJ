import java.io.*;
import java.util.*;
import java.math.*;

public class O_chickenDeliver_15686 {
	static int N, M, c1=0, c2=0, result=0, dap=Integer.MAX_VALUE;
	static int[][] city; // 도시 맵
	static int[][] distance; // 집에 따른 치킨집의 거리
	static int[][] H; // 집 좌표
	static int[][] C; // 치킨집 좌표
	static int[] chk; // 치킨집 선택하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		city = new int[N][N];
		distance = new int[2*N][13];
		H = new int[2*N][2];
		C = new int[13][2];
		chk = new int[M];
        for(int i=0;i<N;i++) {
        	str = br.readLine();
        	st = new StringTokenizer(str," ");
        	for(int j=0;j<N;j++) {
        		city[i][j] = Integer.parseInt(st.nextToken()); 
        		if(city[i][j] == 1) { H[c1][0] = i; H[c1][1] = j; c1++; }
        		else if(city[i][j] == 2) { C[c2][0] = i; C[c2][1] = j; c2++; }
        	}
        }
        for(int i=0;i<c1;i++) {
        	for(int j=0;j<c2;j++) {
        		distance[i][j] = (int) ( Math.abs(C[j][0]-H[i][0]) + Math.abs(C[j][1]-H[i][1]) );
        	}
        } // 각각의 집의 각각의 치킨집 거리 구하기
        // 치킨집 선택하기
        select(0,0);
        System.out.println(dap);
	}
	public static void select(int n, int start) { // n <= M(가능한 치킨집개수)
		if(n < M) {
			for(int i=start;i<c2-M+n+1;i++) {
				chk[n] = i;
				select(n+1,start+1);
			}
		}
		else {
			result = 0;
			for(int i=0;i<c1;i++) {
				int small=Integer.MAX_VALUE;
				for(int j=0;j<M;j++) {
					if(distance[i][chk[j]] < small) { small = distance[i][chk[j]]; }
				}
				result += small;
			}
		}
		if(dap > result) dap = result;
	}
}
