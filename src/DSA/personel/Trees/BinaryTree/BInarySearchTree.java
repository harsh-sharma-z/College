package DSA.personel.Trees.BinaryTree;

public class BInarySearchTree {
    private BinaryTreeNode root;
    private BinaryTreeNode insertData(int data, BinaryTreeNode root)
    {
        if(root==null) {
            BinaryTreeNode newNode = new BinaryTreeNode(data);
            return newNode;
        }

        if(root.data>data)
        {
            root.left=insertData(data,root.left);
        }
        else
        {
            root.right=insertData(data,root.right);
        }
        return root;
    }


    public void insertData(int data)
    {
        root=insertData(data,root);
    }


    public static void main(String[] args) {

    }
}
