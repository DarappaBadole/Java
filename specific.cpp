#include<iostream>
using namespace std;

int Addi(int i,int j)
{
 int ans = 0;
 ans  = i+j;
 return ans;

}

float Addf(float i,float j)
{
    float ans = 0.0f;
    ans = i+j;
    return ans;
}

int main()
{
    int a=10, b=11,iRet=0;
    float x = 90.0f , y = 67.8f ,fRet =0.0f;

    iRet = Addi(a,b);
    fRet = Addf(x,y);

    cout<<"Addition of integer:"<<iRet<<"\n";
    cout<<"Addition of Float:"<<fRet<<"\n";

  

    return 0;
}