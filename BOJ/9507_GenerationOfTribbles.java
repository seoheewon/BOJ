import java.io.*;

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		long[] tc = new long[68];
		
		tc[0] = 1; tc[1] = 1; tc[2] = 2; tc[3] = 4;
		
		for(int i=0;i<T;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num>3) {
				for(int j=4;j<=num;j++) {
					tc[j] = tc[j-1] + tc[j-2] + tc[j-3] + tc[j-4];
				}
			}
			System.out.println(tc[num]);
		}	
	}
}
