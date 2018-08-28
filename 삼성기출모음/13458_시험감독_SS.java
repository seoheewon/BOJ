import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception{
		long count = 0;
		int check = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());
		
		String S_stu = br.readLine();
		StringTokenizer st1 = new StringTokenizer(S_stu," ");
		String Sam = br.readLine();
		StringTokenizer st2 = new StringTokenizer(Sam," ");
		double Sam1 = Double.parseDouble(st2.nextToken()); //총 감독
		double Sam2 = Double.parseDouble(st2.nextToken()); //보조 감독
		
		double[] I_stu = new double[TC];
		for(int i=0;i<TC;i++) {
			I_stu[i] = Double.parseDouble(st1.nextToken());
		}
		
		for(int i=0;i<TC;i++) {
			while(I_stu[i] > 0) {
				if(check == 1) {
					I_stu[i] -= Sam1; check = -1; count++;
				}
				else {
					if(I_stu[i] % Sam2 == 0) {
						count = count + (int)(I_stu[i] / Sam2);
						I_stu[i] = -1;	
					}
					else {
						count = count + (int)(I_stu[i] / Sam2) + 1;
						I_stu[i] = -1;
					}					
				}
			}
			check = 1;
		}
		System.out.println(count);
	}
}
