#include<stdio.h>
#include<string.h>

int main()
{ 
    char Arr[10] = "Hello";
    char * ptr = Arr;
    int iCnt = 0;
    

    while(*ptr !='\0')
    {
        iCnt++;
        ptr++;

    }


    printf("length of sting is :%d\n",iCnt);




    return 0;

}