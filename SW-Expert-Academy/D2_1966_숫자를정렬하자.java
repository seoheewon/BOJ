import java.util.*;
import java.io.*;

class Solution {
	static int[] arr;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int n = Integer.parseInt(br.readLine());
			arr = new int[n];
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int k = 0;
			while(st.hasMoreTokens()) {
				arr[k++] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			System.out.print("#"+(i+1));
			for(int x=0;x<n;x++) {
				System.out.print(" "+arr[x]);
			}System.out.println();
		}
	}
}
