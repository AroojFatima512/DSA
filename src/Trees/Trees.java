package Trees;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    Node root;
   Trees(){
       this.root = null;
   }
   void traverse(Node root){
      Queue <Node> q = new LinkedList<Node>();

      q.add(root);
      Node current;
      while (!q.isEmpty()){
          current = q.remove();
          System.out.println(current.data);
          if(current.left!=null){
              q.add(current.left);
          }
          if (current.right!=null){
              q.add(current.right);
          }
      }

   }

    public static void main(String[] args) {
        Node N1 = new Node(1);
        Node N2 = new Node(2);
        Node N3 = new Node(3);
        Node N4 = new Node(4);
        Node N5 = new Node(5);
        Node N6 = new Node(6);
        Node N7 = new Node(7);
        Node N8 = new Node(8);
        Node N9 = new Node(9);
        N1.left = N2;
        N1.right = N3;
        N2.left = N4;
        N2.right = N5;
        N3.left = N6;
        N3.right = N7;
        N4.left = N8;
        N4.right = N9;
        Trees BT = new Trees();
        BT.traverse(N1);
    }


}
