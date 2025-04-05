class node
{
    int data;
    node left;
    node right;
    public node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Bfs
{
    node root;
    public void insert(int data)
    {
        root=insertrec(root,data);
    }

    public node insertrec(node root,int data)
    {
        if(root== null)
        {
            root=new node(data);

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
    public void inorder(node root)
    {
        if(root!=null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    public void preorder(node root)
    {
        if(root!=null)
        {
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public void postorder(node root)
    {
        if(root!=null)
        {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public int height(node root)
    {
        if(root==null)
        {
            return 0;        
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }

    public void bfs(node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        bfs(root.left,level-1);
        bfs(root.right,level-1);

    }
    public static void main(String args[])
    {
       Bfs r=new Bfs();
        r.insert(5);
        r.insert(6);
        r.insert(3);
        r.insert(10);
        r.insert(2);
        System.out.println("inorder");
        r.inorder(r.root);
        System.out.println("\npostorder");
        r.postorder(r.root);
        System.out.println("\npreorder");
        r.preorder(r.root);
        int h=r.height(r.root);
        System.out.println("\nBFS (level-order):");
        for(int i=1;i<=h;i++)
        {
            r.bfs(r.root,i);
        }
        
    }
}

