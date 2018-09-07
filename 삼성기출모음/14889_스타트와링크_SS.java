import java.io.*;
import java.util.*;

public class _SS_start_n_link {
	static int[][] skill = new int[21][21];
	static int[] st_arr = new int[11];
	static int[] li_arr = new int[11];
	static int N;
	static int dap = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			for(int j=0;j<N;j++) {
				skill[i][j] = Integer.parseInt(st.nextToken());
			}
		}
    // 순열로 찾기 ( 1부터 시작, 전체인원의 반만큼 재귀, 배열에 하나씩 넣기 )
		permutation(1,N/2,0);
		System.out.println(dap);
	}
	public static void permutation(int start, int cnt, int arr) {
		if(cnt == 0) { // 배열에 다 넣었으면 계산
			int n = 0; 
			for(int i=1;i<=N;i++) {
				int chk = 0;
				for(int j=0;j<N/2;j++) {
					if(i != st_arr[j]) chk++;
				}
				if(chk == N/2) li_arr[n++] = i;
			}
			
			int result = 0;
			for(int i=0;i<N/2;i++) {
				for(int j=0;j<N/2;j++) {
					result += skill[st_arr[i]-1][st_arr[j]-1];
					result -= skill[li_arr[i]-1][li_arr[j]-1];
				}
			}
			if(Math.abs(result) < dap) dap = Math.abs(result);
		}
		else {
			for(int i = start;i<=N-cnt+1;i++) {
				st_arr[arr] = i; 			
				permutation(i+1,cnt-1,arr+1); // 재귀재귀재귀~!!!
			}
		}
	}
}
