import java.util.*;
import java.io.*;
 
class O_SS_robot_cleaner_14503 {
	static int N, M, r, c, d;
    static int map[][];
 
    static int dr[] = { -1, 0, 1, 0 };
    static int dc[] = { 0, 1, 0, -1 };
 
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken()); // 행
		M = Integer.parseInt(st.nextToken()); // 열
		map = new int[N][M]; // 벽과 공간
	
		str = br.readLine();
		st = new StringTokenizer(str," ");
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			st = new StringTokenizer(str," ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
		solve(r,c,d); 
		
		// 청소되어있는 곳 찾기, 외곽 제외
		int cnt = 0;
		for(int i=1;i<N-1;i++) {
			for(int j=1;j<M-1;j++) {
				if(map[i][j] == 2) cnt++;
			}
		}
		System.out.println(cnt);
    } 
 
    static void solve(int r, int c, int d) {
    	map[r][c] = 2;
    	int chk = 0;
        for(int i=0;i<4;i++) {
        	if(map[r+dr[(d+3)%4]][c+dc[(d+3)%4]] == 0) {
        		d = (d+3)%4;
        		r = r + dr[d];
        		c = c + dc[d];
            	solve(r,c,d);
            	break;
        	}
        	else {
        		chk++;
        		d = (d+3)%4;
        	}
        
	        if(chk == 4) { // 네 방향 모두 청소가 되어잇거나  
	        	if(d == 0) {
	        		if(map[r+1][c] != 1) {
	        			solve(r+1,c,d);
	        		} else { break; }
	        	}
	        	else if(d == 1) {
	        		if(map[r][c-1] != 1) {
	        			solve(r,c-1,d);
	        		} else { break; }
	        	}
	        	else if(d == 2) {
	        		if(map[r-1][c] != 1) {
	        			solve(r-1,c,d);
	        		} else { break; }
	        	} 
	        	else {
	        		if(map[r][c+1] != 1) {
	        			solve(r,c+1,d);
	        		} else { break; }
	        	}
	        }
        }
    } 
}
