/*
The following code contains a TreeNode class with following instances:
- TreeNode left
- TreeNode right
- int data
- constructor to initialize data to the object of the class

Also, it has member functions:
- createBinaryTree: It creates some TreeNodes and combine them as a binary tree

Syllabus:
Inorder, Preorder, Postorder
Min and max search
Advanced Search (algorithm)
BST deletion
 */
package DSA.College.Trees;

public class BinaryTree {
    private static TreeNode root;

        private static class TreeNode
        {
            private TreeNode left;
            private TreeNode right;
            private int data;

            public TreeNode(int data)
            {
                this.data=data;

            }
        }

        public static void createBinaryTree()
        {

            TreeNode first = new TreeNode(1);
            TreeNode second = new TreeNode(2);
            TreeNode third = new TreeNode(3);
            TreeNode fourth = new TreeNode(4);
            TreeNode fifth = new TreeNode(5);
            TreeNode sixth = new TreeNode(6);
            TreeNode seventh = new TreeNode(7);

            root=first;
            first.left=second;
            first.right=third;
            second.left= fourth;
            second.right=fifth;
            third.left=sixth;
            third.right=seventh;



        }

        public static void preOrder(TreeNode root)
        {
            if(root==null)
                return;
            System.out.println(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void main(String[] args)
        {
            createBinaryTree();
            preOrder(root);
        }

    }
