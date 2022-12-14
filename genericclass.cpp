#include<iostream>

using namespace std;

template< class T>

class Array
{
  public:
    T *Arr;
    int Size;

    Array(int length)
    {
        Size = length;
        Arr = new T[Size];

    }
    
    void Accept()
    {
        cout<<"Enter the values:\n";
        for(int i=0;i<Size;i++)
        {
            cin>>Arr[i];
        }
    }

    void Display()
    {
        cout<<"values of array are:\n";
        for(int i =0; i<Size;i++)
        {
            cout<<Arr[i]<<"\n";
        }
    }
    


    };

    int main()
    {
        Array <int> obj1(5);
        obj1.Accept();
        obj1.Display();




     Array <float> obj2(5);

        obj2.Accept();
        obj2.Display();

        Array <char> obj3(5);

        obj3.Accept();
        obj3.Display();

         Array <double> obj4(5);

        obj4.Accept();
        obj4.Display();




        return 0;
 }