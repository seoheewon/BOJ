import java.util.*;
import java.io.*;

public class Main {
	static int[] alpha = new int[26];
	static boolean noman = true;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i=0;i<N;i++) {
			String name = br.readLine();
			int n = name.charAt(0)-97; //¼Ò¹®ÀÚ'a'=97
			alpha[n]++;
		}
		for(int i=0;i<26;i++) {
			if(alpha[i]>=5) { System.out.print((char)(i+97)); noman = false; }
		}
		if(noman == true) System.out.println("PREDAJA"); 
	}
}
