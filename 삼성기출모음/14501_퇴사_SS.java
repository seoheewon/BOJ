import java.util.*;
import java.io.*;

public class retire_14501 {
	static int[] dur;
	static int[] cash;
	static int N, dap, sum;
    public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            N = Integer.parseInt(br.readLine());
            dur = new int[N]; 
            cash = new int[N];
            for(int i=0;i<N;i++) {
            	String str = br.readLine();
            	StringTokenizer st = new StringTokenizer(str," ");
            	dur[i] = Integer.parseInt(st.nextToken());
            	cash[i] = Integer.parseInt(st.nextToken());
            }
            for(int i=0;i<N;i++) {
            	sum = 0;
        		solve(i);
        	}
            System.out.println(dap);
    }
    public static void solve(int d) {
    	if(d+dur[d]<=N) {
    		sum += cash[d];
    		if(d+dur[d] == N) {
    			if(sum>dap) dap = sum;
    		}
    		else {
    			for(int i=d+dur[d];i<N;i++) {
    				solve(i);
    				if(i+dur[i]<=N) { // 이부분 때문에 고생함
    					sum -= cash[i];
    				}
    			}
    		}
    	}
    	else { if(sum>dap) dap = sum; }
    }
}
