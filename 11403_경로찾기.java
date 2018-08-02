import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[][] a;
	static int[] chk;
	static int[][] dap;
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	N = Integer.parseInt(br.readLine());
    	a = new int[N][N]; // �׷����� ���� ���
    	chk = new int[N]; // üũ�� ���� �迭
    	dap = new int[N][N];
    	
    	for(int i=0;i<N;i++) {
    		String str = br.readLine();
    		StringTokenizer st = new StringTokenizer(str," ");
    		for(int j=0;j<N;j++) {
    			a[i][j] = Integer.parseInt(st.nextToken());
    		}	
    	}
    	
    	for(int i=0;i<N;i++) {
    		dfs(i);
    		for(int j=0;j<N;j++) {
    			dap[i][j] = chk[j];
    		}
    		Arrays.fill(chk,0); // üũ �迭 ����
    	}
    	for(int i=0;i<N;i++) {
    		for(int j=0;j<N;j++) {
    			System.out.print(dap[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
    static void dfs(int n) {
    	for(int i=0;i<N;i++) {
    		if(a[n][i] == 1 && chk[i] == 0) {
    			chk[i] = 1;
    			dfs(i);
    		}    		
    	}
    }
}