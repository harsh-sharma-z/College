/*
**WORKS THROUGH RECURSION**
The following program creates and print a BinaryTree.
It has two methods:
- takeInput(): creates a root node and thn create entire binary tree recursively.
- print(): print the following binary tree in pre-order traversal
- height(): returns the maximum height of the tree from the given node
- diameter(): returns the maximum diameter of the tree
- inorder(): prints the tree in indorder tarversal
- preorder(): prints the tree in preorder traversal
- postorder(): prints the tree in postorder traversal
- isBST(): checks whether the tree is BST or not
- minimum(): Finds the maximum values of the tree or subtree
- maximum(): Finds the minimum value of the tree or subtree
 */


package DSA.personel.Trees.BinaryTree;


import java.util.*;
public class  BinaryTreeUse {

    public static int minimum(BinaryTreeNode root)
    {
        if(root == null)
            return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minimum(root.left),minimum(root.right)));

    }

    public static int maximum(BinaryTreeNode root)
    {
        if(root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maximum(root.left),maximum(root.right)));

    }
    public static  boolean isBST(BinaryTreeNode root)
    {
        if(root==null)
            return true;
        int leftmax=maximum(root.left);
        int rightmin=minimum(root.right);
        if(root.data<=leftmax)
            return false;
        if(root.data>=rightmin)
            return false;

        boolean isLeftBST =isBST(root.left);
        boolean isRightBST =isBST(root.right);

        if(isLeftBST && isRightBST)
            return true;
        else
            return false;
    }

    public static int countNodes(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int ans=1;
        ans+=countNodes(root.left);
        ans+=countNodes(root.right);
        return ans;
    }

    public static int height (BinaryTreeNode root)
    {
        if(root==null)
            return 0;

        int lh=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lh,rh);

    }

        public static int diameter(BinaryTreeNode root)
    {
        if(root==null)
            return 0;
        int op1= height(root.left)+height(root.right);
        int op2=diameter(root.left);
        int op3=diameter(root.right);

        return Math.max(op1,Math.max(op2,op3));

    }
    public static void print(BinaryTreeNode root)
    {
        if(root==null)
        {
            return;
        }
        String toBePrinted=root.data+" ";
        if(root.left!=null)
        {
            toBePrinted+="L:"+root.left.data+",";
        }

        if(root.right!=null)
        {
            toBePrinted+="R:"+root.right.data;
        }

        System.out.println(toBePrinted);
        print(root.left);
        print(root.right);



    }


    public static BinaryTreeNode takeInput(Scanner sc)
    {
        int rootData;
        System.out.println("Enter root data:");
        rootData=sc.nextInt();
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode root=new BinaryTreeNode(rootData);
        root.left=takeInput(sc);
        root.right=takeInput(sc);
        return root;
    }

    public static void inorder (BinaryTreeNode root)
    {
        if(root== null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void preorder(BinaryTreeNode root)
    {
        if(root== null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void postorder (BinaryTreeNode root)
    {
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
/*
        BinaryTreeNode root=new BinaryTreeNode(1);
        BinaryTreeNode node1=new BinaryTreeNode(2);
        root.left=node1;
        BinaryTreeNode node2=new BinaryTreeNode(3);
        root.right=node2;
*/
        BinaryTreeNode root= takeInput(sc);
        System.out.println("\n_________________\nYour tree is:");
        print(root);
        System.out.println("\n______________________");
        System.out.println("Number of Nodes in the tree are:"+countNodes(root));
        System.out.println("The diameter of the tree is="+ diameter(root));
        System.out.println("\n__________________\nInorder traversal:");
        inorder(root);
        System.out.println("\n__________________\nPreorder traversal:");
        preorder(root);
        System.out.println("\n__________________\nPostorder traversal:");
        postorder(root);

        System.out.println("\n______________________");

        if(isBST(root))
            System.out.println("The Binary Tree is BST");
        else
            System.out.println("The Binary Tree is not BST");
    }
}
