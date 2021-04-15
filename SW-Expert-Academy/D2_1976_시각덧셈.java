import java.util.*;
import java.io.*;

class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int m1 = Integer.parseInt(st.nextToken());
			int s1 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());
			int s2 = Integer.parseInt(st.nextToken());

			if(s1+s2>=60) {
				if(m1+m2+1>12) {
					System.out.println("#"+(i+1)+" "+(m1+m2-11)+" "+(s1+s2-60));
				}
				else {
					System.out.println("#"+(i+1)+" "+(m1+m2+1)+" "+(s1+s2-60));
				}
			}
			else {
				if(m1+m2>12) {
					System.out.println("#"+(i+1)+" "+(m1+m2-12)+" "+(s1+s2));
				}
				else {
					System.out.println("#"+(i+1)+" "+(m1+m2)+" "+(s1+s2));
				}
			}
		}
	}
}
