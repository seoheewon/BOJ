import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	static int[][] RGB = new int[1001][3];
	static int[][] dap = new int[1000][3];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int T = Integer.parseInt(br.readLine());
		if(T==0) System.out.println("0");
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			RGB[i][0] = Integer.parseInt(st.nextToken());
			RGB[i][1] = Integer.parseInt(st.nextToken());
			RGB[i][2] = Integer.parseInt(st.nextToken());
		}
		dap[0][0] = RGB[0][0]; dap[0][1] = RGB[0][1]; dap[0][2] = RGB[0][2];
		for(int i=1;i<T;i++) {
			dap[i][0] = Math.min((RGB[i][0]+dap[i-1][1]),(RGB[i][0]+dap[i-1][2]));
			dap[i][1] = Math.min((RGB[i][1]+dap[i-1][0]),(RGB[i][1]+dap[i-1][2]));
			dap[i][2] = Math.min((RGB[i][2]+dap[i-1][0]),(RGB[i][2]+dap[i-1][1]));
		}
		System.out.println(Math.min(Math.min(dap[T-1][0],dap[T-1][1]),dap[T-1][2]));
	}
}
