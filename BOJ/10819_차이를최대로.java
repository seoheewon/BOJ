import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] num = new int[T];
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums," ");
		for(int i=0;i<T;i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<T;i++) {
			for(int j=i;j<T;j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			} // �ϴ� ����
		}
		
		int hap = 0;
		if(T%2 != 0) { // Ȧ�� // ����̵� �����ؾ���
			if(num[T/2]-num[T/2-1] < num[T/2+1]-num[T/2]) {
				for(int i=T/2+1;i<T;i++) {
					hap += 2*num[i];
				}
				for(int j=0;j<=T/2;j++) {
					hap -= 2*num[j];
				}
				hap = hap + num[T/2] + num[T/2-1];
			}
			else {
				for(int i=T/2;i<T;i++) {
					hap += 2*num[i];
				}
				for(int j=0;j<T/2;j++) {
					hap -= 2*num[j];
				}
				hap = hap - num[T/2] - num[T/2+1];
			}
		}
		else { // ���� ������ ¦���� �ϰ��
			for(int i=T/2;i<T;i++) {
				hap += 2*num[i];
			}
			for(int j=0;j<T/2;j++) {
				hap -= 2*num[j];
			}
			hap = hap - num[T/2] + num[T/2-1];
		}
		System.out.println(hap);
    }
}