package DSA.personel.Trees;

import javax.crypto.MacSpi;

public class TreeUse {
    public static void main(String[] args) {
        Node root=new Node(4);
        Node node1=new Node(2);
        Node node2=new Node(3);
        Node node3=new Node(5);
        Node node4=new Node(6);
        root.children(node1);
        root.children(node2);
        root.children(node3);
        node2.children(node4);


  }
}
