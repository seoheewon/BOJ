import java.util.*;
import java.io.*;

public class Main {
	static int N;
    static int[] num;
    static int[] imply;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			String[] str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]); 
			
			if(N == 0) { break; }
			
			num = new int[N];
			imply = new int[N];			
			
			for(int i=0;i<N;i++) {
					num[i] = Integer.parseInt(str[i+1]);
			}
			dfs(0,0);	
			System.out.println(); 
			// 각 테스트 케이스 사이에는 빈 줄을 하나 출력한다.
		}
	}
	
	public static void dfs(int start, int depth) {
		if(depth == 6) {
			print();
		}
		for(int i=start;i<N;i++) {
			imply[i] = 1;
			dfs(i+1,depth+1);
			imply[i] = 0;
		}
	}

	private static void print() {
		for(int i=0;i<N;i++) {
			if(imply[i] == 1) {
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
	}
}
