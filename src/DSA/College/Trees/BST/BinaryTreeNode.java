/*
This is node class for BinaryTree.
It has the following member functions:
- int data: to store data
- BinaryTreeNode left: to store the left node
- BinaryTreeNOde right: to store the right node
- BinaryTreeNode(): a constructor to initialize the data

 */

package DSA.College.Trees.BST;

public class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public BinaryTreeNode(int data)
    {
        this.data=data;
    }
}
