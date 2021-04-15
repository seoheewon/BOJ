import java.util.*;
import java.io.*;

public class Main {
	static int num = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] inout = new int[8];
		int big = 0;
		for(int i=0;i<8;i+=2) {
			String T = br.readLine();
			StringTokenizer st = new StringTokenizer(T," ");
			inout[i] = Integer.parseInt(st.nextToken());
			num = num - inout[i];
			if(num > big) big = num;
			inout[i+1] = Integer.parseInt(st.nextToken());
			num = num + inout[i+1];
			if(num > big) big = num;
		}
		System.out.println(big);
	}
}
