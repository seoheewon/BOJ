// 모자른 카드의 개수를 구하는 것임

import java.util.*;
import java.io.*;

class Solution {
	static int[] S = new int[13];
	static int[] D = new int[13];
	static int[] H = new int[13];
	static int[] C = new int[13];
	static int[] arr = new int[4];
	static String str;
	static boolean flag = true;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {
        	str = br.readLine();
        	int length = str.length();
        	for(int i=0;i<length/3;i++) {
        		String s = str.substring(3*i, (3*i)+1);
        		int n = (3*i)+1; 
        		doit(s,n);
        		if(flag == false) { System.out.println("#"+t+" ERROR"); break; } 
        	}
        	if(flag == true) { 
        		find();
        		System.out.print("#"+t);
        		for(int i=0;i<4;i++) {
        			System.out.print(" "+arr[i]);
        		} System.out.println();
        	}
        	Arrays.fill(S,0); Arrays.fill(D,0); Arrays.fill(H,0); Arrays.fill(C,0); Arrays.fill(arr,0); flag=true;
        }
	}
	public static void doit(String s, int n) {
		int x = Integer.parseInt(str.substring(n,n+1));
		int y = Integer.parseInt(str.substring(n+1,n+2));
		int number = (10*x) + y;
		switch(s) {
		case "S": S[number-1]++; if(S[number-1]>=2) {flag=false;}
			break;
		case "D": D[number-1]++; if(D[number-1]>=2) {flag=false;}
			break;
		case "H": H[number-1]++; if(H[number-1]>=2) {flag=false;}
			break;
		case "C": C[number-1]++; if(C[number-1]>=2) {flag=false;}
			break; 
		}
	}
	public static void find() {
		int dap = 13;
		for(int i=0;i<13;i++) {
			if(S[i] != 0) dap = dap-S[i];
		} arr[0] = dap;
		dap = 13;
		for(int i=0;i<13;i++) {
			if(D[i] != 0) dap = dap-D[i];
		} arr[1] = dap;
		dap = 13;
		for(int i=0;i<13;i++) {
			if(H[i] != 0) dap = dap-H[i];
		} arr[2] = dap;
		dap = 13;
		for(int i=0;i<13;i++) {
			if(C[i] != 0) dap = dap-C[i];
		} arr[3] = dap;
	}
}
