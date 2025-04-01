class node
{
    int data;
    node left,right;
    public node(int data)
    {
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
class BST
{
    node root;
    public void insert(int data)
    {
        root=insertrec(root,data);
    }
    node insertrec(node root,int data)
    {
        if(root==null)
        {
            return new node(data);
        }
        else if(data<root.data)
        {
            root.left=insertrec(root.left,data);
        }
        else
        {
            root.right=insertrec(root.right,data);
        }
        return root;
    }
    public int  minnode()
    {
        if (root==null) return -1; 
        node temp=root;
        while(temp.left!=null)
        {
            temp=temp.left;
        }
        return temp.data;
    }
}
public class Minintree {
    public static void main(String args[])
    {
        BST bst=new BST();
        bst.insert(50);
        bst.insert(40);
        bst.insert(65);
        bst.insert(75);
        System.out.println(bst.minnode());
    }
    
}
