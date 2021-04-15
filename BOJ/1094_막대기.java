import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x == 64) { System.out.print("1"); System.exit(0); }
		int pole = 32;
		int num = 0, count = 0;
		while(true) {
			if(x == pole)  { System.out.print("1"); System.exit(0); }
			else if(x >= (pole+num)) {
				num += pole; pole /= 2; count++;
			}
			else {
				pole /= 2;
			}
			if(num == x) { System.out.println(count); System.exit(0);}
		}
	}
}
// 비트연산자로 해도됨