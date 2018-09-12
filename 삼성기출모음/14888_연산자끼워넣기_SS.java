import java.io.*;
import java.util.*;

public class O_SS_putOpertor_14888 {
	static int[] num = new int[11];
	static int[] op = new int[4];
	static int[] imp = new int[11];
	static int N;
	static int maxnum = Integer.MIN_VALUE;
	static int minnum = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		for(int i=0;i<N;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		str = br.readLine();
		st = new StringTokenizer(str," ");
		for(int i=0;i<4;i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}		
		/////////////////// 여기까지 입력받는거 끝남  ////////////////////
		imp[0] = num[0];
		if(N == 2) { // 연산자 한 개 있을 떄
			for(int i=0;i<4;i++) {
				if(op[i] == 1) { operation(i, 1); }
				minnum = imp[1]; 
				maxnum = imp[1]; 
			}
		}
		else { dfs(1); }
    
		System.out.println(maxnum);
		System.out.println(minnum);
	}
	public static void dfs(int n) {
		if(n == N) {
			if(minnum > imp[n-1]) { minnum = imp[n-1]; }
			if(maxnum < imp[n-1]) { maxnum = imp[n-1]; }
		}
		for(int i=0;i<4;i++) {
			if(op[i] > 0) { 
				op[i]--;
				operation(i, n);
				dfs(n+1); 
				op[i]++;
			}
		}
	}
	public static void operation(int o, int n) {
		switch(o) {
		case 0:
			imp[n] = imp[n-1] + num[n];
			break;
		case 1:
			imp[n] = imp[n-1] - num[n];
			break;
		case 2:
			imp[n] = imp[n-1] * num[n];
			break;
		case 3:
			if(imp[n-1] < 0) { imp[n] = -(Math.abs(imp[n-1])/num[n]);}
			else { imp[n] = imp[n-1] / num[n]; }
			break;
		}
	}
}
