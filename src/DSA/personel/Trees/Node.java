package DSA.personel.Trees;

import java.util.ArrayList;

public class Node {
    public int data;
    public ArrayList<Node> children;
    public Node(int data)
    {
        this.data=data;
        children=new ArrayList<>();
    }


}

