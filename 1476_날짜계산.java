import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int tol = 15*28*19;
		int[] num = new int[3];
		int[] dap = new int[3];
		for(int i=0;i<3;i++) {
			num[i] = sc.nextInt();
		}

		for(int i=1;i<=tol;i++) {
			if(i==0) {
				System.out.println("7980");
				break;
			}
			
			dap[0] = i%15; if(dap[0] == 0) dap[0] = 15;
			dap[1] = i%28; if(dap[1] == 0) dap[1] = 28;
			dap[2] = i%19; if(dap[2] == 0) dap[2] = 19;
			
			if(dap[0] == num[0]) {
				if(dap[1] == num[1]) {
					if(dap[2] == num[2]) {
						System.out.println(i);
						System.exit(0);
					}
				}
			}
		}
	}
}
