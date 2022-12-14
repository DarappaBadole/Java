#include<stdio.h>
#include<string.h>


int main()
{
    char Arr[5] =  {'a','b','c','d','\0'};

    char Brr[5] = "abcd";
    char Crr[]="abcd";

    printf("%s\n",Arr);
    printf("%s\n",Brr);
    printf("%s\n",Crr);

    
    printf("Size of array Arr  :%d\n",sizeof(Arr));
    printf("Size of array Brr :%d\n",sizeof(Brr));
    printf("Size of array Crr :%d\n",sizeof(Crr));
    
    printf("length of array Arr :%d\n",strlen(Arr));
    printf("length array  Brr :%d\n",strlen(Brr));
    printf("length of array  Crr:%d\n",strlen(Crr));
    
    return 0;

    
    }