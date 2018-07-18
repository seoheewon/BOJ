import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] P = new int[N+1]; // 붕어빵 개수별 가격
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		for(int i=1;i<=N;i++) {
			P[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=2;i<=N;i++) {
			int end = i/2;
			for(int j=1;j<=end;j++) {
				if(P[i] < P[j]+P[i-j]) P[i] = P[j]+P[i-j];
			}
		}
		System.out.println(P[N]);
	}
}
