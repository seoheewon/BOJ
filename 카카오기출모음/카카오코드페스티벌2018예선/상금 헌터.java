import java.io.*;
import java.util.*;

public class Money {
	static int a = 0;
	static int b = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			a = festival1(Integer.parseInt(st.nextToken())); 
			b = festival2(Integer.parseInt(st.nextToken()));	
			System.out.println(a+b);
		}		
	}
	static int festival1(int n) {
		if(n == 0) return 0;
		else if(n<=1) return 5000000;
		else if(n<=3) return 3000000;
		else if(n<=6) return 2000000;
		else if(n<=10) return 500000;
		else if(n<=15) return 300000;
		else if(n<=21) return 100000;
		else return 0;
	}
	static int festival2(int n) {
		if(n == 0) return 0;
		else if(n<=1) return 5120000;
		else if(n<=3) return 2560000;
		else if(n<=7) return 1280000;
		else if(n<=15) return 640000;
		else if(n<=31) return 320000;
		else return 0;
	}
}