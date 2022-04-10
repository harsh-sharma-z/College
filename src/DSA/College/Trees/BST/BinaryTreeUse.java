/*
**WORKS THROUGH RECURSION**
The following program creates and print a BinaryTree.
It has two methods:
- takeInput(): creates a root node and thn create entire binary tree recursively.
- print(): print the following binary tree in pre-order traversal
 */


package DSA.College.Trees.BST;


import java.util.*;
public class BinaryTreeUse {

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
        print(root);


    }
}
