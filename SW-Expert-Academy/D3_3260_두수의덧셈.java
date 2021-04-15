// BigDecimal 무한에 가까운 부동소숫점 숫자를 다루기 위해 사용

import java.util.*;
import java.io.*;
import java.math.*;

public class Solution4 { 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TC = Integer.parseInt(br.readLine());
        for(int t=1;t<=TC;t++) { 
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str," ");
            BigDecimal first = new BigDecimal(st.nextToken());
            BigDecimal second = new BigDecimal(st.nextToken());
            BigDecimal result = first.add(second);
            System.out.println("#"+t+" "+result);
        }
    }  
}
