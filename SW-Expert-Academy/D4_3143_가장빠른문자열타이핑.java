import java.util.*;
import java.io.*;

class Solution { 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	int TC = Integer.parseInt(br.readLine());
       	 	for(int t=1;t<=TC;t++) { 
        		String str = br.readLine();
        		StringTokenizer st = new StringTokenizer(str," ");
        		String str1 = st.nextToken(); int str1_len = str1.length();
        		String str2 = st.nextToken(); int str2_len = str2.length();
        		int count = 0;
        		int start = 0;
        		while(start < str1_len) { 
        			if(str1.substring(start,start+1).equals(str2.substring(0,1))) {
        				if(start <= str1_len-str2_len) { // 비교가능
        					if(str1.substring(start,start+str2_len).equals(str2)) {
        						start += str2_len; count++;
        					}
        					else {
        						start++; count++;
        					}
        				}
        				else {
        					count += str1_len-start; break;
        				}
        			}
        			else { // 
        				start++; count++;
        			}
        		}
        		System.out.println("#"+t+" "+count);
       	 	}
	}
}

