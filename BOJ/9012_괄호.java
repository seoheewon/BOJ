import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int cnt = 0;
			String line = br.readLine();
			int tol = line.length();
			for(int j=0;j<tol;j++) {
				if(cnt<0) { break; }
				if(line.charAt(j) == '(') cnt++;
				else cnt--;
			}
			if(cnt == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}