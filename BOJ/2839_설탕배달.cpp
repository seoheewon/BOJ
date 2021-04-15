#include <stdio.h>
int main() {
    int x;
    scanf("%d",&x);
    int dap = 2147483640;
    int no = -1;
    for(int i=0;i<=x/5;i++) {
        for(int j=0;j<=x/3;j++) {
            if((i*5)+(j*3) == x) {
                if(i+j < dap) {
                    dap = i+j; no = 1;
                }
            }
        }
    }
    if(no == -1) {
        printf("-1");
    }
    else printf("%d",dap);
}   
///////////////////////////////////////////////////////
/* ¹ØÀº ´Ù¸¥»ç¶÷ ÄÚµå ÀÌ°Å °µÂúÅ¸
#include <stdio.h>
main()
{
	int n,i=0;
	scanf("%d",&n);
	while(1)
	{
		if(n<0) {printf("-1");break;}
		if(n%5==0) {printf("%d",i+n/5);break;}
		n-=3;i++;
	}
}  
*/