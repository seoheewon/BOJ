import java.util.*;
import java.io.*;
import java.math.*;

// 1. �� �� �� ���� �� �� ū�� �� ���� �� ����
// 2. ���� �� �� ��� �� ���
// 3. �ϳ��� ���ϱ� if������

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
