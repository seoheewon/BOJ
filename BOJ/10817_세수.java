import java.util.*;
import java.io.*;
import java.math.*;

// 1. 세 수 다 합한 후 젤 큰거 젤 작은 거 빼기
// 2. 정렬 한 후 가운데 꺼 출력
// 3. 하나씩 비교하기 if문으로

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		if(a>b) {
			if(b>c) System.out.println(b);
			else {
				if(a>c) System.out.println(c);
				else System.out.println(a);
			}
		}
		else {
			if(a>c) System.out.println(a);
			else {
				if(b>c) System.out.println(c);
				else System.out.println(b);
			}
		}
		
		/*
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		int c = sc.nextInt();
		int sum = a+b+c;
		System.out.println(sum-Math.max(Math.max(a, b),c)-Math.min(Math.min(a, b),c));
		*/
	}
}
