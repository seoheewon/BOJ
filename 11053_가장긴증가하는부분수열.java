import java.io.*;
import java.util.*;

public class Main {
	static int[] dp = new int[1001];
	static int dap = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String A = br.readLine();
		StringTokenizer st = new StringTokenizer(A," ");
		int[] num = new int[N];
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<N;i++) {
			dp[i] = 1;
			for(int j=0;j<i;j++) {
				if(num[i] > num[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
				dap = Math.max(dap,  dp[i]);
			}
		}
		if(N == 1) System.out.println(1);
		else System.out.println(dap);
	}
}