#include<cmath>
#include<iostream>
using namespace std;
class link{
    public:
    int data;
    link *next;

};
class LinkList  {
    link *first,*last;

    public:
    LinkList()  {
        first=NULL;
        last=NULL;
    }
    void insertAtLast(int d)
    {
        link *n = new link;
        n->data=d;
        if(first==NULL)
        {
            first=n;
        }
        else
            last->next=n;
        last=n;
        last->next=NULL;


    }
     void DeleteAll()
    {
        first=NULL;
        last=NULL;
    }
    int GetIntoArray(int *arr,int index)
    {
        link *temp=first;
        while(temp!=NULL)
        {

            arr[index]=temp->data;
            index++;
            temp=temp->next;
            cout<<"h1";
        }
        return index;

    }
    void display()
    {

        link *temp=first;
        while(temp!=NULL)
        {
            cout<<temp->data<<" ";
            temp=temp->next;
        }

    }
};
void radixSort(int *arr, int len)
{
    LinkList *lst;
    lst=new LinkList[10];
    int max=0;
    for(int i=0;i<len;i++)
    {
        if(max<arr[i])
            max=arr[i];
    }

    int digits=0;
    while(max!=0)
    {
        digits++;
        max=max/10;
    }

    for(int i=0;i<digits;i++)
    {
        int divisor=1*(int)pow(10.0,i);
            cout<<"divisor="<<divisor<<endl;
        for(int j=0;j<len;j++)
        {
            lst[(arr[j]/divisor)%10].insertAtLast(arr[j]);

        }


        int index=0;
        for(int x=0;x<10;x++)
        {

            index=lst[x].GetIntoArray(arr,index);

            lst[x].DeleteAll();
            cout<<"H2"<<endl;
        }
        for(int a=0;a<len;a++)
        cout<<arr[a]+" ";

    }
    cout<<"h3"<<endl;

}
int main()
{
    cout<<"Enter length of array-";
    int len;
    cin>>len;

    int *arr=new int[len];
    cout<<"Enter array-"<<endl;
    for(int i=0;i<len;i++)
    {
        int x;
        cin>>x;
        arr[i]=x;
    }
    for(int a=0;a<len;a++)
        cout<<arr[a]+" ";
    radixSort(&arr[0],len);

    for(int a=0;a<len;a++)
        cout<<arr[a]+" ";
    return 0;
}

