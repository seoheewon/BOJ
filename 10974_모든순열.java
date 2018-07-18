import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[T]; // 숫자 집어넣기
		int[] count = {1,2,6,24,120,720,5040,40320};
		for(int i=0;i<T;i++) {
			numbers[i] = i+1;
		}
		System.out.print(numbers[0]);
		for(int i=1;i<T;i++) {
			System.out.print(" "+numbers[i]);
		}
		System.out.println();
		
		for(int x=0;x<count[T-1];x++) {
			int j = T-1;
			while(j>0 && numbers[j-1] > numbers[j]) j--;  
			
			if(j == 0) {
				System.exit(0);
			}
			else { // i-1 , i
				
				for(int i=T-1;i>j-1;i--) {
					if(numbers[i] > numbers[j-1]) {
						int temp = numbers[j-1];
						numbers[j-1] = numbers[i];
						numbers[i] = temp;
						break;
					}
				}
				int index = T-1;
				while(j<index) {
					int temp = numbers[j];
					numbers[j] = numbers[index];
					numbers[index] = temp;
					j++; index--;
				}
				System.out.print(numbers[0]);
				for(int i=1;i<T;i++) {
					System.out.print(" "+numbers[i]);
				}
				System.out.println();
			}
		}
	}
}
