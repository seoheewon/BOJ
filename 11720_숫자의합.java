import java.io.*;

public class O_nums_hap_11720 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String numbers = br.readLine();
		
		int sum = (numbers.charAt(0)-48);
		for(int i=1;i<numbers.length();i++) {
			sum += (numbers.charAt(i)-48);
		}
		System.out.println(sum);
	}
}
