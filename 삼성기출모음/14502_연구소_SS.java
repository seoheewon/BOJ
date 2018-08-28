import java.util.*;
import java.io.*;

public class O_SS_laboratory_14502 {
	static int[][] map;
	static int[] maparr;
	static int N,M, count;
	static int dap = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		maparr = new int[N*M];
		for(int i=0;i<N;i++) {
			str = br.readLine();
			st = new StringTokenizer(str," ");
			for(int j=0;j<M;j++) {
				maparr[(i*M)+j] = map[i][j] = Integer.parseInt(st.nextToken()); 
			}
		}
		
		// 3개의 벽을 세울 수 있는 모든 가지수
		for(int p=0;p<N*M-2;p++) {
			if(maparr[p] == 0) {
				maparr[p] = 3;
				
				for(int q=p+1;q<N*M-1;q++) {
					if(maparr[q] == 0) {
						maparr[q] = 3;
						
						for(int r=q+1;r<N*M;r++) {
							if(maparr[r] == 0) {
								// 클리어 하면서 전에꺼 지워지니까 다시...
								maparr[p] = maparr[q] = maparr[r] = 3;
								
								for(int i=0;i<N;i++) {
									for(int j=0;j<M;j++) {
										System.out.print(maparr[(i*M)+j]); 
									}	
									System.out.println();
								}	
								System.out.println("**************");

								// 여기서 이제 바이러스 퍼지는거 검사
								for(int s=0;s<N*M;s++) {
									if(maparr[s] == 2) virus_spread(s);
								}	

								// 바이러스 안 퍼진곳 갯수 세기
								findzone();
								if(count > dap) {
									dap = count;
								}
								count = 0;
							}							
							// 맵 다시 클리어 하는거 
							maparr_clear();
						}
					}
				}
			}
		}		
		System.out.println(dap);
	}
	
	// 다시 탐색을 위해 클리어 해주기
	public static void maparr_clear() {
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				maparr[(i*M)+j] = map[i][j]; 
			}			
		}		
	}
	
	// 바이러스 퍼지는 거 검사
	public static void virus_spread(int n) {
		// 서쪽 방향으로 퍼질때의 조건
		if(n-1>=0 && maparr[n-1]==0 && n%M!=0) { maparr[n-1] = 2; virus_spread(n-1); }
		// 동쪽 방향으로 퍼질때의 조건
		if(n+1<N*M && maparr[n+1]==0 && n%M!=M-1) { maparr[n+1] = 2; virus_spread(n+1); }
		// 북쪽 방향으로 퍼질때의 조건
		if(n-M>=0 && maparr[n-M]==0) { maparr[n-M] = 2; virus_spread(n-M); }
		// 남쪽 방향으로 퍼질때의 조건
		if(n+M<N*M && maparr[n+M]==0) { maparr[n+M] = 2; virus_spread(n+M); }
		
	}

	// 바이러스 안 퍼진 곳 찾기
	public static void findzone() {
		for(int i=0;i<N*M;i++) {
			if(maparr[i] == 0) count++;
		}
	}
}








