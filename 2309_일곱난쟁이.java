import java.util.*;

// Loop_3040 과 유사
public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int[] kids = new int[9];
			int total = 0, no1 = -1, no2 = -1, num = 0;
			int[] dap = new int[7];
				
			for(int i=0; i<9; i++) {
				kids[i] = sc.nextInt();
				total += kids[i];
			}
				
			for(int i=0; i<8; i++) {
				for(int j=i+1; j<9; j++) {
					if((total-kids[i]-kids[j]) == 100) {
						no1 = i; // 몇 번 친구인지 확인하기 위해
						no2 = j;
					}
				}
			}
			
			for(int i=0; i<9; i++) {
				if(i != no1 && i != no2) {
					dap[num] = kids[i];
					num++;
				}
			}

			Arrays.sort(dap);
			for(int i=0; i<7; i++) {
				System.out.println(dap[i]);
			}
	}
}
