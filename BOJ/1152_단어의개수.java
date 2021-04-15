import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
	  	StringTokenizer st = new StringTokenizer(str," ");
	  	int count = 0;
	  	while(st.hasMoreTokens()) {
	  		st.nextToken();
	  		count++;
	  	}
	  	System.out.print(count);
	}
}