import java.util.*;
import java.io.*;

public class Solution {
	static String dap;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) {
        	 String str = br.readLine();
        	 find(str);
        	 System.out.println("#"+t+" "+dap);
        }
	} 
	public static void find(String str) {
		int length = str.length();
		if(length == 1) {
			dap = str;
		}
		else {
			int hap = 0;
			for(int i=0;i<length;i++) {
				hap += Integer.parseInt(str.substring(i, i+1));
			} find(String.valueOf(hap));
		}
i	}
}
