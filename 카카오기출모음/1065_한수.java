/*import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		if(Integer.parseInt(N)<100) { // 100�̸��� �� ����
			System.out.println(N);
		}
		else {
			int count = 99;
			// ��ȫ ������ ���ڸ� �� �̱���
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
        int count = 99; // ���� �ڸ����� �� �Ѽ�
        for(int i=111;i<=N;i++) { // 111���� �Ѽ�����.
            int a = i/100;
            int b = (i%100)/10; 
            int c = i%10; 
            if(a-b == b-c) { count++;}
        }
        System.out.println(count);
	}
}