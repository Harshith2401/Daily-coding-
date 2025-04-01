class node
{
    int data;
    node left,right;
    public node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class TREE
{
    node root;
    public void insert(int data)
    {
        root=insertrec(root,data);
    }
    public node insertrec(node root,int data)
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
    public int findMin(node root) 
    {
        if (root == null) return Integer.MAX_VALUE;
        int leftMin = findMin(root.left);
        int rightMin = findMin(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
}

public class Mininanytree {
    public static void main(String args[])
    {
        TREE bst=new TREE();
        bst.insert(50);
        bst.insert(40);
        bst.insert(65);
        bst.insert(75);
        System.out.println(bst.findMin(bst.root));
    }
    
}
