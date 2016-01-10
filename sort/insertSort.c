#include <stdio.h>
#define GET_ARRAY_LEN(array, len){len=(sizeof(array)/sizeof(array[0]));}

void printfArray(int array[]);

main(){

    int c[] = {33, 2, 0, 6, 54};
    int len;
    GET_ARRAY_LEN(c, len);
    int i;
    printf("origin array\n");
    for(i=0; i<len; i++){
        
        int j = 0;
        printf("%d\n", c[i]);
    } 
    for(i=1; i<len; i++){
        int temp = c[i];
        int j = i-1;
        while(c[j]>temp && (j>=0)){
            c[j+1] = c[j];
            j--;
        }
        c[j+1] = temp;
    }
   
    printf("---------sort------\n");
    for(i=0; i<len; i++){
        int j = 0;
        printf("%d\n", c[i]);
    } 

}

