import java.io.*;
import java.util.*;

public class O_SS_slope_14890 {
	static int[][] map = new int[101][101];
	static int N, L;
	static int dap = 0;
	static int start;
	static int wid = 1, updown = 0;
	static boolean TF;
	
	public static boolean updownStair(int i, int j, int n) {
		if(map[i][j] == start) { // 높이가 같으면 일단 넓이만 생각하기
			wid++; start = map[i][j]; 
			return true;
		}
		else { // 높이가 다를때
			if(Math.abs(map[i][j]-start) > 1) { return false; } // 높이가 1초과하면 바로 아웃
			else {
				if(map[i][j] > start) { // 오르는 계단
					if(updown == -1) { // 전에 내려오던 계단이 있었는지 확인
						if(wid>=(2*L)) {
							wid = 1;  updown = 1; start = map[i][j]; 
						} else { return false; }
					}
					else {
						if(wid>=L){
							wid = 1; updown = 1; start = map[i][j]; 							
						} else { return false; }
					}
				}
				else { // 내려가는 계단
					for(int p=1;p<L;p++) {
						if(n == 1) { // 가로줄
							if(map[i][j+p] != map[i][j]) return false;
						}
						else { // 세로줄
							if(map[i+p][j] != map[i][j]) return false;
						}
					}
					wid = 1; updown = -1; start = map[i][j];
					return true;
				}						
			}					
		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken()); // NxN
		L = Integer.parseInt(st.nextToken()); // 경사로 길이
		
		for(int i=0;i<N;i++) {
			str = br.readLine();
			StringTokenizer st1 = new StringTokenizer(str," ");
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st1.nextToken());
			}
		} 
		for(int i=0;i<N;i++) { 
			start = map[i][0]; // 가로줄의 기준
			wid = 1; updown = 0;
			int cnt = 0;
			for(int j=1;j<N;j++) { 
				TF = updownStair(i,j,1);
				if(TF == false) { break; }
				else { cnt++; }
			}
			if(cnt == N-1) { dap++; }
		} 
		for(int i=0;i<N;i++) { 
			start = map[0][i]; // 세로줄의 기준
			wid = 1; updown = 0;
			int cnt = 0;
			for(int j=1;j<N;j++) { 
				TF = updownStair(j,i,2);
				if(TF == false) { break; }
				else { cnt++; }
			}
			if(cnt == N-1) { dap++; }
		}
		System.out.println(dap);
	}
}
