import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] s_method = new String[num];
		Stack mystack = new Stack();
		
		for(int i=0; i<num; i++) {
			s_method[i] = sc.nextLine();
		}
		
		for(int i=0; i<num; i++) {
			if(s_method[i].equals("top")) {
				if(mystack.isEmpty()) {
					System.out.println(-1);
				}
				else {	System.out.println(mystack.peek());	}
			}
			else if(s_method[i].equals("size")) {
				System.out.println(mystack.size());
			}
			else if(s_method[i].equals("empty")) {
				if(mystack.isEmpty()) {
					System.out.println(1);
				}
				else {	System.out.println(0);	}
			}
			else if(s_method[i].equals("pop")) {
				if(mystack.isEmpty()) {
					System.out.println(-1);
				}
				else {	System.out.println(mystack.pop());	}
			}
			else { // pushÀÎ °æ¿ì
				String number = s_method[i].substring(5);
				mystack.push(number);
			}			
		}
	}
}
