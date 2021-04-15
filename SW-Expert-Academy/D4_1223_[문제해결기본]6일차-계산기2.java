import java.util.*;
import java.io.*;

class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1;t<=10;t++) { 
        	int N = Integer.parseInt(br.readLine());
        	Stack st1 = new Stack(); // 숫자 넣는곳
        	Stack st2 = new Stack(); // 기호 넣는곳
        	String str = br.readLine();
        	long sum = 0; int cnt = 0;
        	while(cnt < N) {
        		if(cnt%2==0) { 
        			st1.add(Integer.parseInt(str.substring(cnt,cnt+1))); cnt++;
        		}
        		else {
        			if(str.substring(cnt,cnt+1).equals("*")) {	
        				int n = (int) st1.pop(); cnt++;
        				st1.add(n*Integer.parseInt(str.substring(cnt,cnt+1))); cnt++;
        			}
        			else { 
        				st2.add(str.substring(cnt,cnt+1)); cnt++;
        			}
        		}
        	} 
        	int size = st1.size();
        	while(size-- > 0) {
        		sum += (Integer)st1.pop();
        	}
        	System.out.println("#"+t+" "+sum);
        }
	}
}

