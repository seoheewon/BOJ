import java.io.*; 
import java.util.*;

public class Main {
	static int x, y, d, g;
	static int[][] map = new int[101][101];
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,-1,0,1};
	static int cnt = 0;
	static int[] dir = new int[1024]; // 10세대까지 가질 수 있는 방향의 갯수
	static int[] dirnum = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
	static int p,q;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());   
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			
			map[x][y] = 1;
			p = q = 1;
			dir[0] = d; 
			x += dx[dir[0]];
			y += dy[dir[0]];
			map[x][y] = 1;
			dragoncurve(x,y,d,g);		
		
			//dir[] 클리어
			Arrays.fill(dir, 0);
		}
		
		// 정사각형의 개수 찾기
		for(int i=0;i<=99;i++) {
			for(int j=0;j<=99;j++) {
				if(map[i][j] == 1 && map[i+1][j] == 1 && map[i][j+1] == 1 && map[i+1][j+1] == 1)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static void dragoncurve(int x, int y, int d, int g) {
		if(g>0) {
			dir[p] = dir[p-1]+1; if(dir[p] == 4) dir[p] = 0;
			x += dx[dir[p]]; y += dy[dir[p]]; map[x][y] = 1;
			q = 2*p;
			for(int i=p+1;i<q;i++) { // 3, 5, 9, ....
				dir[i] = dir[q-i-1] + 1; if(dir[i] == 4) dir[i] = 0;
				x += dx[dir[i]]; y += dy[dir[i]]; map[x][y] = 1;
			}
			p = q;	
			g--;
			dragoncurve(x,y,d,g);
		}
	}
}
