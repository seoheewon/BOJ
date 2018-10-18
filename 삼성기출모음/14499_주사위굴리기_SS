import java.util.*;
import java.io.*;

public class O_rollingDice_14499 {
	static int N, M, r, c, K;
	static int[][] map;
	static int[] dice = new int[6];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i=0;i<N;i++) {
			str = br.readLine();
			st = new StringTokenizer(str," ");
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		} // 여기까지 맵 입력
		
		// 이제 이동하는 명령어 입력
		str = br.readLine();
		st = new StringTokenizer(str," ");
		while(st.hasMoreTokens()) {
			move(Integer.parseInt(st.nextToken()));
		}
	}
	public static void move(int dir) {
		int tmp;
		if(dir == 1) { // 동쪽
			if(c+1<M) {
				c += 1;
				tmp = dice[0]; dice[0] = dice[3]; dice[3] = dice[5]; dice[5] = dice[2]; dice[2] = tmp;
				if(map[r][c] == 0) {
					map[r][c] = dice[5]; System.out.println(dice[0]);
				}
				else {
					dice[5] = map[r][c]; map[r][c] = 0; System.out.println(dice[0]);
				}
			}
		}
		else if(dir == 2) { // 서쪽
			if(c-1>=0) {
				c -= 1;
				tmp = dice[0]; dice[0] = dice[2]; dice[2] = dice[5]; dice[5] = dice[3]; dice[3] = tmp;
				if(map[r][c] == 0) {
					map[r][c] = dice[5]; System.out.println(dice[0]);
				}
				else {
					dice[5] = map[r][c]; map[r][c] = 0; System.out.println(dice[0]);
				}
			}
		}
		else if(dir == 3) { // 북쪽
			if(r-1>=0) {
				r -= 1;
				tmp = dice[0]; dice[0] = dice[1]; dice[1] = dice[5]; dice[5] = dice[4]; dice[4] = tmp;
				if(map[r][c] == 0) {
					map[r][c] = dice[5]; System.out.println(dice[0]);
				}
				else {
					dice[5] = map[r][c]; map[r][c] = 0; System.out.println(dice[0]);
				}
			}
		}
		else if(dir == 4) { // 남쪽
			if(r+1<N) {
				r += 1;
				tmp = dice[0]; dice[0] = dice[4]; dice[4] = dice[5]; dice[5] = dice[1]; dice[1] = tmp;
				if(map[r][c] == 0) {
					map[r][c] = dice[5]; System.out.println(dice[0]);
				}
				else {
					dice[5] = map[r][c]; map[r][c] = 0; System.out.println(dice[0]);
				}
			}
		}
	}
}
