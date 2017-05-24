#include<iostream>
#include<malloc.h>
using namespace std;
struct node {
    node *left;
    node *right;
    int bf;
    int data;
};
void insert(node **h,int d)
{
    node *p1,*p2;
    if(*h==NULL)
    {
        *h=(node *)malloc(sizeof(node));
        (*h)->data=d;
        (*h)->left=NULL;
        (*h)->right=NULL;
        (*h)->bf=0;
    }
    else if(d<(*h)->data)
    {

        insert(&((*h)->left),d);
        switch((*h)->bf)
        {

            case -1:
            (*h)->bf=0;
            break;
            case 0:
            (*h)->bf=1;
            break;
            case 1:
            p1=(*h)->left;
            if(p1->bf==1)
            {
                (*h)->left=p1->right; //right rotation
                p1->right=*h;
                (*h)->bf=0;
                *h=p1;
            }
            else
            {
                p2=p1->right;       //left-right rotation
                p1->right=p2->left;
                p2->left=p1;
                (*h)->left=p2->right;
                p2->right=*h;
                (*h)->bf=p2->bf==1?-1:0;
                p1->bf=p2->bf==-1?1:0;
                *h=p2;

            }
            break;
        }
    }
    else
    {
        insert(&((*h)->right),d);
        switch((*h)->bf)
        {
            case 0:
            (*h)->bf=-1;
            break;
            case 1:
            (*h)->bf=0;
            break;
            case -1:
            p1=(*h)->right;
            if(p1->bf==-1)
            {
                (*h)->right=p1->left;     //left rotation
                p1->left=*h;
                (*h)->bf=0;
                *h=p1;
            }
            else
            {
                p2=p1->left;            //right-left rotation
                p1->left=p2->right;
                p2->right=p1;
                (*h)->right=p2->left;
                p2->left=*h;
                (*h)->bf = p2->bf==-1?1:0;
                p1->bf=p2->bf==1?-1:0;
                *h=p2;
            }
            break;
        }

    }

}

node* findMax(node *root)
{
    if(root==NULL || root->right==NULL)
        return root;
    else
        findMax(root->right);
}


void delet(node **h,int d)
{
    node *p1,*p2;
    if(*h==NULL)
    {
        cout<<"unable to find the node.";

    }
    else if(d<(*h)->data)
    {

        delet(&((*h)->left),d);

        switch((*h)->bf)
        {
            case 1:
            (*h)->bf=0;
            break;
            case 0:
            (*h)->bf=-1;
            break;
            case -1:
            p1=(*h)->right;
            if(p1->bf==-1)
            {
                (*h)->right=p1->left;         //left rotation
                p1->left=*h;
                (*h)->bf=0;
                *h=p1;
            }
            else
            {
                p2=p1->left;                //right-left rotation
                p1->left=p2->right;
                p2->right=p1;
                (*h)->right=p2->left;
                p2->left=*h;
                (*h)->bf=p2->bf==-1?1:0;
                p1->bf=p2->bf==1?-1:0;
                *h=p2;
            }
            break;

        }
    }
    else if(d>(*h)->data)
    {
        delet(&((*h)->right),d);
        node *p1,*p2;
        switch((*h)->bf)
        {
            case -1:
            (*h)->bf=0;
            break;
            case 0:
            (*h)->bf=1;
            break;
            case 1:
            p1=(*h)->left;
            if(p1->bf==1)
            {
                (*h)->left=p1->right;         // right rotation
                p1->right=*h;
                (*h)->bf = 0;
                *h=p1;
            }
            else
            {
                p2=p1->right;               // left-right rotation
                p1->right=p2->left;
                p2->left=p1;
                (*h)->left=p2->right;
                p2->right=*h;
                (*h)->bf = p2->bf==1?-1:0;
                p1->bf = p2->bf==-1?1:0;
                *h=p2;

            }
            break;
        }
    }
        else if((*h)->left && (*h)->right)
        {
            node *temp;
            temp=findMax(((*h)->left));
            (*h)->data=temp->data;
            delet(&((*h)->left),temp->data);
        }
        else
        {
            node *temp;
            temp=*h;
            if((*h)->left==NULL && (*h)->right==NULL)
                *h=NULL;
            else if((*h)->left==NULL)
                (*h)=(*h)->right;
            else
                *h=(*h)->left;
            free(temp);
        }



}

void inorderT(node *root)       //inorder traversal
{
    if(root!=NULL)
    {
        inorderT(root->left);
        cout<<root->data<<" ";
        inorderT(root->right);
    }
}
void preorderT(node *root) //preorder traversal
 {
     if(root==NULL)
      return;
      else
        {
            cout<<root->data<<" ";
            preorderT(root->left);
            preorderT(root->right);
        }
 }
int main()
{
    int choice,data;
    node *root=NULL;
    while(1)
    {
        cout<<"\n\n      Options available \n"<<endl;
        cout<<" 1. Insert Node\n";
        cout<<" 2. In-order traversal \n";
        cout<<" 3. Delete Node\n";
        cout<<" 4. pre-order Traversal\n";
        cout<<" 5. exit\n";
        cout<<"Enter your choice(1-4) : ";
        cin>>choice;
        switch(choice)
        {
            case 1: cout<<"\n\n Enter data to be inserted into tree :";
            cin>>data;
            insert(&root,data);
            break;

            case 2: cout<<"\n\n In order traversal of avl tree is :";
            inorderT(root);
            break;

            case 3: cout<<"Enter data to delete :";
            cin>>data;
            delet(&root,data);
            break;

            case 4:
            preorderT(root);
            break;
        }

    }

}
