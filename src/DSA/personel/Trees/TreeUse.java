package DSA.personel.Trees;
import java.util.Scanner;

public class TreeUse {
    public static Node takeInput()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter data for this node:");
        n=sc.nextInt();
        Node root=new Node(n);
        int childCount;
        System.out.println("Enter number of children for this node:");
        childCount=sc.nextInt();
        for(int i=0;i<childCount;i++)
        {
            Node child=takeInput();
            root.children.add(child);
        }

        return root;

    }

    public static void print(Node root)
    {
        String s=root.data+":";
        for(int i=0;i<root.children.size();i++)
        {
            s=s+root.children.get(i).data+",";
        }
        System.out.println(s);
        for(int i=0;i<root.children.size();i++)
        {
            print(root.children.get(i));
        }

    }


    public static void main(String[] args) {

        Node root=takeInput();
        print(root);


        /*Node root=new Node(4);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(5);
        Node node4=new Node(6);
        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);*/
  }
}
