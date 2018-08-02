import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.print(str.charAt(0));
		for(int i=1;i<str.length();i++) {
			if(i%10==0) 
				System.out.println();
			System.out.print(str.charAt(i));
		}
	}
}