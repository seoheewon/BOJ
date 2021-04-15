//브루트 포스
public class Main {
	public static void main(String[] args) {
		for(int i=1000;i<9999;i++) {
			int a=0,b=0,c=0;
			for(int x=i;x>0;x/=10) {
				a = a+(x%10);
			}
			for(int y=i;y>0;y/=12) {
				b = b+(y%12);
			}
			for(int z=i;z>0;z/=16) {
				c = c+(z%16);
			}
			if(a == b && b == c) 
				System.out.println(i);
		}
	}
}
