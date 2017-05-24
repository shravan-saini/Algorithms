// Program for Threaded Binary Search Tree


#include<iostream>
#include<malloc.h>
using namespace std;

struct node		//node defination
{
    node *left;
    node *right;
    char thread;
    int data;

};

void insert(node **h,int d)
{
    node *ptr,*parent,*cur;
    ptr=(node *)malloc(sizeof(node));
    ptr->data=d;
    ptr->left=NULL;
    if(*h==NULL)
    {
        *h=ptr;
        ptr->right=NULL;
        ptr->thread='0';
    }
    else
    {
        cur=*h;
        parent=NULL;
        while(cur!=NULL)
        {
            parent=cur;
            if(d<cur->data)
                cur=cur->left;
            else
            {
                if(cur->thread=='1')
                    cur=NULL;
                else
                    cur=cur->right;
            }
        }
        if(d<parent->data)
        {
            parent->left=ptr;
            ptr->right=parent;
            ptr->thread='1';
        }
        else
        {
            if(parent->thread=='1')
            {
                parent->thread='0';
                ptr->thread='1';
                ptr->right=parent->right;
                parent->right=ptr;
            }
            else
            {
                ptr->thread='0';
                ptr->right=NULL;
                parent->right=ptr;
            }
        }


    }

}

node* findMax(node *root)
{
    if(root==NULL || root->thread=='1' || root->right==NULL)
    {
        return root;
    }
    else
        return findMax(root->right);
}

void delet(node **h,int d)
{
    node *p1,*p2;
    char tag;
    if(*h==NULL)
    {
        cout<<"\nnode not found!"<<endl;
        return;
    }
    else if(d<(*h)->data)
        delet(&((*h)->left),d);
    else if(d>(*h)->data)
        delet(&((*h)->right),d);
    else if((*h)->left && (*h)->right && (*h)->thread=='0')
    {
        p1=findMax((*h)->left);
        (*h)->data=p1->data;
        delet(&((*h)->left),p1->data);
    }
    else
    {
        p1=*h;
        if(((*h)->left==NULL) && (((*h)->right==NULL || (*h)->thread=='1')))        // leaf node
        {
            (*h)=NULL;
        }
        else if((*h)->left!=NULL )   // left child only
        {
            tag=(*h)->thread;
            p2=(*h)->right;
            (*h)=(*h)->left;
            (*h)->thread=tag;
            if(tag=='1')
            {
                (*h)->right=p2;
            }

        }
        else                //right child only
        {
            (*h)=(*h)->right;
        }
        free(p1);

    }

}

//in-order traversal

void inorderT(node *root)
{
    node *cur,*parent;
    cur=root;
    do
    {
        parent=NULL;
        while(cur!=NULL)
        {
            parent=cur;
            cur=cur->left;
        }
        if(parent!=NULL)
        {
            cout<<parent->data<<" ";
            cur=parent->right;

            while((parent->thread=='1') && (cur!=NULL))
            {
                cout<<cur->data<<" ";
                parent=cur;
                cur=cur->right;
            }
        }

    }while(cur!=NULL);

}

int main()
{
    int choice,d;
    node *root=NULL;
    while(1)
    {
        cout<<"\n\n      Options available \n"<<endl;
        cout<<" 1. Insert Node\n";
        cout<<" 2. In-order traversal \n";
        cout<<" 3. Delete Node\n";
        cout<<" 4. Exit\n";
        cout<<"Enter your choice(1-4) : ";
        cin>>choice;
        switch(choice)
        {
            case 1: cout<<"\n\n Enter data to be inserted into tree :";
            cin>>d;
            insert(&root,d);
            break;

            case 2: cout<<"\n\n In order traversal of BT tree is :";
            inorderT(root);
            break;

            case 3: cout<<"Enter data to delete :";
            cin>>d;
            delet(&root,d);
            break;

            case 4: return 0;
        }

    }

}
