import java.util.*;
import java.io.*;

public class Main {
	static int[][] Gs = new int[4][8];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		char gear = 0;
		String turn = null;
		
		for(int i=0;i<4;i++) {
			String G = br.readLine();
			for(int j=0;j<8;j++) {
				Gs[i][j] = G.charAt(j)-48;
			}
		} // 톱니 채움
		
		int TC = Integer.parseInt(br.readLine()); // 테스트 케이스
		for(int i = 0;i<TC;i++) {
			String act = br.readLine();
			gear = act.charAt(0);
			turn = act.substring(2); // 1이 시계방향, -1이 반시계방향
			
			if(gear == '1') {
				if(turn.equals("1")) {
					if(Gs[0][2] != Gs[1][6]) {
						if(Gs[1][2] != Gs[2][6]) {
							if(Gs[2][2] != Gs[3][6]) {
								right(0); left(1); right(2); left(3);
							} else { right(0); left(1); right(2); }
						} else { right(0); left(1); }
					} else { right(0); }
				}
				else { // 왼쪽으로 돌렸을 때
					if(Gs[0][2] != Gs[1][6]) {
						if(Gs[1][2] != Gs[2][6]) {
							if(Gs[2][2] != Gs[3][6]) {
								left(0); right(1); left(2); right(3);
							} else { left(0); right(1); left(2); }
						} else { left(0); right(1); }
					} else { left(0); }
				}					
			}
			else if(gear == '2') {
				if(turn.equals("1")) {
					if(Gs[0][2] != Gs[1][6]) {
						left(0);
					}
					if(Gs[1][2] != Gs[2][6]) {
						if(Gs[2][2] != Gs[3][6]) {
							right(1); left(2); right(3);
						} else { right(1); left(2); }
					} else { right(1); }
				}
				else {
					if(Gs[0][2] != Gs[1][6]) {
						right(0);
					}
					if(Gs[1][2] != Gs[2][6]) {
						if(Gs[2][2] != Gs[3][6]) {
							left(1); right(2); left(3);
						} else { left(1); right(2); }
					} else { left(1); }
				}
			}
			else if(gear == '3') {
				if(turn.equals("1")) {
					if(Gs[2][2] != Gs[3][6]) {
						left(3);
					}
					if(Gs[2][6] != Gs[1][2]) {
						if(Gs[1][6] != Gs[0][2]) {
							right(2); left(1); right(0);
						} else { right(2); left(1); }
					} else { right(2); }
				}
				else { // -1
					if(Gs[2][2] != Gs[3][6]) {
						right(3);
					}
					if(Gs[1][2] != Gs[2][6]) {
						if(Gs[1][6] != Gs[0][2]) {
							left(2); right(1); left(0);
						} else { left(2); right(1); }
					} else { left(2); }
				}
			}
			else { //gear == '4'
				if(turn.equals("1")) {
					if(Gs[3][6] != Gs[2][2]) {
						if(Gs[2][6] != Gs[1][2]) {
							if(Gs[1][6] != Gs[0][2]) {
								right(3); left(2); right(1); left(0);
							} else { right(3); left(2); right(1); }
						} else { right(3); left(2); }
					} else { right(3); }
				}
				else { // 왼쪽으로 돌렸을 때
					if(Gs[3][6] != Gs[2][2]) {
						if(Gs[2][6] != Gs[1][2]) {
							if(Gs[1][6] != Gs[0][2]) {
								left(3); right(2); left(1); right(0);
							} else { left(3); right(2); left(1); }
						} else { left(3); right(2); }
					} else { left(3); }
				}		
			}			
		}	
		int a=0,b=0,c=0,d=0;
		a = Gs[0][0] * 1;
		b = Gs[1][0] * 2;
		c = Gs[2][0] * 4;
		d = Gs[3][0] * 8;
		
		System.out.print(a+b+c+d);
	}
	public static void right(int g) {
		int r = Gs[g][7];
		for(int i=7;i>0;i--) {
			Gs[g][i] = Gs[g][i-1]; 
		}
		Gs[g][0] = r;
	}
	public static void left(int g) {
		int l = Gs[g][0];
		for(int i=1;i<8;i++) {
			Gs[g][i-1] = Gs[g][i]; 
		}
		Gs[g][7] = l;
	}
}
