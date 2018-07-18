import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		/*Scanner sc = new Scanner(System.in);
		int[] num = new int[2];
		for(int i=0;i<2;i++) {
			num[i] = sc.nextInt();
		}
		System.out.println((num[0]-1)+(num[0]*(num[1]-1)));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String T = br.readLine();
		StringTokenizer st = new StringTokenizer(T," ");
		int[] num = new int[2]; int i=0;
		
		while(st.hasMoreTokens()) {
			num[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		System.out.println((num[0]-1)+(num[0]*(num[1]-1)));
	}
}
