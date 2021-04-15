import java.io.*;
import java.util.*;
import java.math.*;

public class O_wine_tasting_2156 {
	private static int[] wine;
	private static int[] dp;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		wine = new int[n+1];
		dp = new int[n+1];
		for(int i=1;i<=n;i++) {
			wine[i] = Integer.parseInt(br.readLine());
		}
		do_act(n);
	}
	public static void do_act(int n) {
		dp[1] = wine[1];
		if(n>=2) {
			dp[2] = wine[1]+wine[2];
		}
		for(int i=3;i<=n;i++) {
			dp[i] = Math.max(dp[i-1], Math.max(dp[i-2]+wine[i], dp[i-3]+wine[i-1]+wine[i]));
		}
		System.out.println(dp[n]);
	}
}
