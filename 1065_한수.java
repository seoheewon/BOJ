/*import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		if(Integer.parseInt(N)<100) { // 100미만은 다 맞음
			System.out.println(N);
		}
		else {
			int count = 99;
			// 오홍 무조건 세자리 수 이구나
			for(int i=111;i<=Integer.parseInt(N);i++) {
				String word = Integer.toString(i);
				int a = word.charAt(2)-word.charAt(1);
				int b = word.charAt(1)-word.charAt(0);
				if(a == b) count++;				
			}
			System.out.println(count);
		}		
	}
}*/
import java.util.*;

public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<100) {
            System.out.println(N); System.exit(0);
        }
        int count = 99; // 일의 자리수는 다 한수
        for(int i=111;i<=N;i++) { // 111부터 한수있음.
            int a = i/100;
            int b = (i%100)/10; 
            int c = i%10; 
            if(a-b == b-c) { count++;}
        }
        System.out.println(count);
	}
}