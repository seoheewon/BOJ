#include <stdio.h>

int main()
{
    int T = 0, i = 0, S = 0, num = 0;
    char str[10];
    
    scanf("%d",&T); // 테스트 케이스 개수 입력받기
    
    for(i=0;i<T;i++) {
        scanf("%s", str);
        switch(str[1]) {
            case 'd' : //add
                scanf("%d", &num);
                S = S | (1 << num-1);
                break;
            case 'e' : //remove
                scanf("%d", &num);
                S = S & ~(1 << num-1);
                break;
            case 'h' : //check 
                scanf("%d", &num);
                if((S & (1 << num-1)) == (1 << num-1))
	            	printf("1\n");
	            else 
	            	printf("0\n");
			    break;
            case 'o' : //toggle
                scanf("%d", &num);
                S = S ^ (1 << num-1); 
	        	break;
            case 'l' : //all
                S = S | ~S;
	        	break;
            case 'm' : //empty
                S = 0;
	        	break;
        }
    }
    return 0;
}