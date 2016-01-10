#include <stdio.h>
#define GET_ARRAY_LEN(array, len){len=(sizeof(array)/sizeof(array[0]));}

void merge(int array[], int p, int q, int r){
    printf("\n merge-p is %d and q is  %d and r is %d", p, q, r);
    int n1 = q - p + 1;
    int n2 = r - q;
    int a[n1+1];
    int b[n2+1];
    int i = 0;
    for(i=0; i<n1; i++){
        a[i] = array[p+i];
        //printf(" \n a i is %d", array[p+i]);
    }
    a[n1] =255;
    for(i=0; i<n2; i++){
        b[i] = array[q+i+1];
       // printf(" \n b i is %d", array[q+i+1]);
    
    }
    b[n2] = 255;
    int l = 0;
    int x = 0;
    int j = p;
    for(j=p; j<=r; j++){
       //printf("\n al %d bx is %d", a[l], b[x]);
       if(a[l] <= b[x]){
           array[j] = a[l];
           l++;
       } else{
            array[j] = b[x];
            x++;
       }
     //  printf("\n merge i is %d a i is %d", j, array[j]);
    }
}

merge_sort(int array[], int p, int r){

    if(p < r){
        int q = (r+p)/2;
        // printf("--\n p is %d and q is  %d and r is %d", p, q, r);
         merge_sort(array, p, q);
         merge_sort(array, q+1, r);
         merge(array, p, q, r);
    
    }

}


main(){

    int c[] = {33, 2, 0, 6, 54, 100, 3, 6};
    int len;
    GET_ARRAY_LEN(c, len);
    int i;
    printf("origin array\n");
    for(i=0; i<len; i++){
        
        int j = 0;
        printf("%d\n", c[i]);
    } 
   
    merge_sort(c, 0, len-1);
    printf("---------sort------\n");
    for(i=0; i<len; i++){
        int j = 0;
        printf("%d\n", c[i]);
    } 
}

