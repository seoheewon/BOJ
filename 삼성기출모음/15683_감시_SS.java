import java.util.*;
import java.io.*;

public class O_watch_15683 {
	static int N,M,cnt=0,dap=Integer.MAX_VALUE;
	static int[][] map;
	static int[][] cam = new int[9][3];
    public static void main(String args[]) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        for(int i=0;i<N;i++) {
        	str = br.readLine();
    		st = new StringTokenizer(str," ");
        	for(int j=0;j<M;j++) {
        		map[i][j] = Integer.parseInt(st.nextToken());
        		if(map[i][j]>0 && map[i][j]<6) {
        			cam[cnt][0] = map[i][j]; cam[cnt][1] = i; cam[cnt][2] = j; 
        			cnt++; //  카메라의 갯수
        		}
        	}
        }
        watch(0,cam[0][1],cam[0][2]);
        System.out.print(dap);
    }
    public static void watch(int n, int r, int c) {
    	if(n == cnt) { 
    		int imp = 0;
    		for(int i=0;i<N;i++) {
            	for(int j=0;j<M;j++) {
            		if(map[i][j] == 0) imp++;
            	}
            }
    		if(dap > imp) dap = imp;
    	}
    	else {
    		switch(cam[n][0]) {
    			case 1:
    				for(int i=0;i<4;i++) {
    					switch(i) {
    					case 0: // 북
	    					diraction(1,-(n+1),0,r,c); 
	    					watch(n+1,cam[n+1][1],cam[n+1][2]);
	    					diraction(2,-(n+1),0,r,c); 
    						break;
    					case 1: // 동
    						diraction(1,-(n+1),1,r,c); 
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),1,r,c); 
    						break;
    					case 2: // 남
    						diraction(1,-(n+1),2,r,c); 
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),2,r,c); 
    						break;
    					case 3: // 서
    						diraction(1,-(n+1),3,r,c); 
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),3,r,c);  
    						break;
    					}
    				}
    				break;
    			case 2:
    				for(int i=0;i<2;i++) {
    					switch(i) {
    					case 0: // 서3 동1
    						diraction(1,-(n+1),1,r,c);
    						diraction(1,-(n+1),3,r,c); 
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),1,r,c);
    						diraction(2,-(n+1),3,r,c); 
    						break;
    					case 1: // 북0 남2
    						diraction(1,-(n+1),0,r,c);
    						diraction(1,-(n+1),2,r,c); 
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),0,r,c);
    						diraction(2,-(n+1),2,r,c); 
    						break;
    					}
    				}
    				break;
    			case 3:
    				for(int i=0;i<4;i++) {
    					switch(i) {
    					case 0: // 북 동
    						diraction(1,-(n+1),0,r,c); 
    						diraction(1,-(n+1),1,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),0,r,c); 
    						diraction(2,-(n+1),1,r,c);
    						break;
    					case 1: // 동 남
    						diraction(1,-(n+1),1,r,c); 
    						diraction(1,-(n+1),2,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),1,r,c); 
    						diraction(2,-(n+1),2,r,c);
    						break;
    					case 2: // 남 서
    						diraction(1,-(n+1),2,r,c); 
    						diraction(1,-(n+1),3,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),2,r,c); 
    						diraction(2,-(n+1),3,r,c);
    						break;
    					case 3: // 서 북
    						diraction(1,-(n+1),3,r,c); 
    						diraction(1,-(n+1),0,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),3,r,c); 
    						diraction(2,-(n+1),0,r,c);
    						break;
    					}
    				}
    				break;
    			case 4:
    				for(int i=0;i<4;i++) {
    					switch(i) {
    					case 0: // 북 동 서
    						diraction(1,-(n+1),0,r,c);
    						diraction(1,-(n+1),1,r,c);
    						diraction(1,-(n+1),3,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),0,r,c);
    						diraction(2,-(n+1),1,r,c);
    						diraction(2,-(n+1),3,r,c);
    						break;
    					case 1: // 동 북 남
    						diraction(1,-(n+1),1,r,c); 
    						diraction(1,-(n+1),0,r,c);
    						diraction(1,-(n+1),2,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),1,r,c); 
    						diraction(2,-(n+1),0,r,c);
    						diraction(2,-(n+1),2,r,c);
    						break;
    					case 2: // 남 동 서
    						diraction(1,-(n+1),2,r,c); 
    						diraction(1,-(n+1),1,r,c);
    						diraction(1,-(n+1),3,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),2,r,c); 
    						diraction(2,-(n+1),1,r,c);
    						diraction(2,-(n+1),3,r,c);
    						break;
    					case 3: // 서 남 북
    						diraction(1,-(n+1),3,r,c); 
    						diraction(1,-(n+1),2,r,c);
    						diraction(1,-(n+1),0,r,c);
    						watch(n+1,cam[n+1][1],cam[n+1][2]);
    						diraction(2,-(n+1),3,r,c); 
    						diraction(2,-(n+1),2,r,c);
    						diraction(2,-(n+1),0,r,c);
    						break;
    					}
    				}
    				break;
    			case 5:
					diraction(1,-(n+1),0,r,c);
					diraction(1,-(n+1),1,r,c);
					diraction(1,-(n+1),2,r,c);
					diraction(1,-(n+1),3,r,c); 
					watch(n+1,cam[n+1][1],cam[n+1][2]);
					diraction(2,-(n+1),0,r,c);
					diraction(2,-(n+1),1,r,c);
					diraction(2,-(n+1),2,r,c);
					diraction(2,-(n+1),3,r,c); 
    				break;
    		}
    	}
    }
    public static void diraction(int we,int chg, int dir, int r, int c) {
    	switch(dir) {
    	case 0: // 북
	    	while(r-1>=0) {
	    		if(map[r-1][c] == 6) break;
	    		if(we == 1 && map[r-1][c] != 6) {
	    			if(map[r-1][c] == 0) map[r-1][c] = chg;
	    			else if(map[r-1][c]>=1 && map[r-1][c]<=5 || map[r-1][c] > chg) { r -= 1; continue;}
	    			else map[r-1][c] = chg;
	    		}
	   			else if(we == 2 && map[r-1][c] <= chg) map[r-1][c] = 0;
	   			r -= 1;
	   		} 
    		break;
    	case 1: // 동
	   		while(c+1<M) {
	   			if(map[r][c+1] == 6) break;
				if(we == 1 && map[r][c+1] != 6)  {
					if(map[r][c+1] == 0) map[r][c+1] = chg;
					else if(map[r][c+1]>=1 && map[r][c+1]<=5 || map[r][c+1] > chg) { c += 1; continue;}
					else map[r][c+1] = chg;
				}
				else if(we == 2 && map[r][c+1] <= chg) map[r][c+1] = 0;
				c += 1;
			} 
    		break;
    	case 2: // 남
	    	while(r+1<N) {
				if(map[r+1][c] == 6) break;
				if(we == 1 && map[r+1][c] != 6) {
					if(map[r+1][c] == 0) map[r+1][c] = chg;
					else if(map[r+1][c]>=1 && map[r+1][c]<=5 || map[r+1][c] > chg) { r += 1; continue;}
					else map[r+1][c] = chg;
				}
				else if(we == 2 && map[r+1][c] <= chg) map[r+1][c] = 0;
				r += 1;
			}	
    		break;
    	case 3: // 서
    		while(c-1>=0) {
				if(map[r][c-1] == 6) break;
				if(we == 1 && map[r][c-1] != 6) {
					if(map[r][c-1] == 0) map[r][c-1] = chg;
					else if(map[r][c-1]>=1 && map[r][c-1]<=5 || map[r][c-1] > chg) { c-= 1; continue;}
					else map[r][c-1] = chg;
				}
				else if(we == 2 && map[r][c-1] <= chg) map[r][c-1] = 0;
				c -= 1;
			}
    		break;
    	}
    }
}
