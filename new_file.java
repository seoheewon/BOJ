import java.util.*;
import java.io.*;

public class O_Next_permutation_10972 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*		
		int T = Integer.parseInt(br.readLine());
		String permute = br.readLine();
		int[] nums1 = new int[T];
		int[] nums2 = new int[T];
		
		StringTokenizer st = new StringTokenizer(permute," ");
		for(int i=0;i<T;i++) {
			nums1[i] = Integer.parseInt(st.nextToken());
			nums2[i] = i+1;
		}
		
		if(T == 1) {
			System.out.println("-1");
			System.exit(0);
		}
		
		int stop = 0;
		for(int i=T-1;i>0;i--) {
			if(nums1[i-1]<nums1[i]) {
				stop = i;
				break;
			}
			else 
				stop = -1;
		}
		
		if(stop == -1)
			System.out.println("-1");
		else {
			for(int i=0;i<stop-1;i++) {
				nums2[nums1[i]-1] = 0;
			}
			for(int i=nums1[stop-1];i<T;i++) {
				if(nums2[i] != 0) {
					nums1[stop-1] = nums2[i];
					nums2[i] = 0;
					break;
				}
			}
			for(int i=0;i<T-1;i++) {
				if(nums2[i] != 0) {
					nums1[stop] = nums2[i];
					stop++;
				}
			}
			System.out.print(nums1[0]);
			for(int i=1;i<T;i++) {
				System.out.print(" "+nums1[i]);
			}
		}
*/
		int T = Integer.parseInt(br.readLine());
		int[] nums = new int[T];
		
		String num = br.readLine();
		StringTokenizer st = new StringTokenizer(num," ");
		for(int i=0;i<T;i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		int index = T-1;
		while(index > 0 && nums[index-1] > nums[index]) index--; 
		
		if(index <= 0) System.out.println("-1");
		else {
			System.out.println(index+"ÀÎµ¦½º°ª");
			int j = T-1;
			while(j >= index && nums[index-1] < nums[j]) j--;
			int temp = nums[j];
			nums[j] = nums[index-1];
			nums[index-1] = temp;
			
			System.out.println("*"+nums[0]+" "+nums[1]+" "+nums[3]+" "+nums[4]);
			
			//Arrays.sort(nums,index,nums.length-1);
			System.out.print(nums[0]);
			for(int i=1;i<T;i++) {
				System.out.print(" "+nums[i]);
			}
		}
		// ¾Æ ¸¾¿¡ ¾Èµé¾î ´Ù ¸¾¿¡ ¾Èµé¾î!!!!!!!!!!!!
	}
}
