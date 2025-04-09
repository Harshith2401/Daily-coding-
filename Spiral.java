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
public class Spiral {
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
    public int height(node root)
    {
        if(root==null)
        {
            return 0;        
        }
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public void left(node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        left(root.left,level-1);
        left(root.right,level-1);
    }
    public void right(node root,int level)
    {
        if(root==null)
        {
            return;
        }
        if(level==1)
        {
            System.out.print(root.data+" ");
        }
        right(root.right,level-1);
        right(root.left,level-1);

    }
    public static void main(String args[])
    {
        Spiral r=new Spiral();
        r.insert(25);
        r.insert(15);
        r.insert(35);
        r.insert(10);
        r.insert(20);
        r.insert(30);
        r.insert(40);
        r.insert(5);
        r.insert(12);
        int h=r.height(r.root);
        boolean leftright=true;
        for(int i=1;i<=h;i++)
        {
            if(leftright)
            {
                r.left(r.root,i);
            }
            else
            {
                r.right(r.root,i);
            }
            leftright=!leftright;
            System.out.println();
            
        }
    }
    
}
