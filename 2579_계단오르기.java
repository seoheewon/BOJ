import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] stair = new int[300];
		int[] dp = new int[300];
		for(int i=0;i<T;i++) {
			stair[i] = sc.nextInt();
		}
		dp[0] = stair[0];
		dp[1] = stair[0]+stair[1];
		dp[2] = Math.max(stair[0]+stair[2],stair[1]+stair[2]);
		
		for(int i=3;i<T;i++) {
			dp[i] = Math.max(dp[i-2]+stair[i], stair[i-1]+stair[i]+dp[i-3]);
		}
		System.out.println(dp[T-1]);
	}
}
