/*import java.io.*;
import java.util.*;

public class set_11723 {
	static int T = 0, num = 0, S = 0;
	static String order,o1;
	
	public static int set(String x, int y){
		switch(x) {
		case "add" :
			return S | (1 << y-1);
		case "remove" :
			return S & ~(1 << y-1);
		case "check" :
			if((S & (1 << y-1)) == (1 << y-1))
				System.out.println("1");
			else 
				System.out.println("0");
			return S;
		case "toggle" :
			return S ^ (1 << y-1); 
		case "all" :
			return S | ~S;
		case "empty" :
			return 0;
		}
		return S;
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			order = br.readLine();
			StringTokenizer st = new StringTokenizer(order," ");
			o1 = st.nextToken();
			if(st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
				S = set(o1,num);
			}
			else
				S = set(o1,0);
		}
	}
}
*/

// 시간 초과 나서 함수 호출 안하고 했는데도 시간 초과가 뜸 에라이 
// 다른 사람들이랑 크게 차이가 없던데 뭐가 문제임
// 밑에 다른 사람꺼 있음 참고 하슈
import java.io.*;
import java.util.*;

public class O_set_11723 {
	static int T = 0, num = 0, S = 0;
	static String order,o1;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		
		for(int i=0;i<T;i++) {
			order = br.readLine();
			StringTokenizer st = new StringTokenizer(order," ");
			o1 = st.nextToken();
			if(st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());
			
			switch(o1) {
			case "add" :
				S = S | (1 << num-1);
                break;
	        case "remove" :
	            S = S & ~(1 << num-1);
                break;
	        case "check" :
	            if((S & (1 << num-1)) == (1 << num-1))
	            	System.out.println("1");
	            else 
	            	System.out.println("0");
			    break;
	        case "toggle" :
	        	S = S ^ (1 << num-1); 
	        	break;
	        case "all" :
	        	S = S | ~S; // S = MAX;
	        	break;
	        case "empty" :
	        	S = 0;
	        	break;
            }   
		}
	}
}

/*
import java.io.;
import java.util.*;

public class Main {
	private static int M;
	private static String order;
	private static int x;
	private static int S = 0;
	private static final int MAX = (int)Math.pow(2, 20) - 1;
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder rst = new StringBuilder();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		M = Integer.parseInt(sc.readLine());
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(sc.readLine());
			order = st.nextToken();
			
			if(order.equals("all")) {
				S = MAX;
			}
			else if(order.equals("empty")) {
				S = 0;
			}
			else {
				x = 1 << Integer.parseInt(st.nextToken()) - 1;
				switch(order.charAt(0)) {
				case 'a' :
					S = S | x;
					break;
				case 'c' :
					rst.append((S & x) == 0 ? 0 : 1).append('\n');
					break;
				case 'r' :
					S = S & ~x;
					break;
				case 't' :
					S = S ^ x;
				}
			}
		}
		bw.write(rst.toString());
		bw.flush();
		bw.close();
	}
}
 */



