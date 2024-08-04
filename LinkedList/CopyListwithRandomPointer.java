package LinkedList;
import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }


    //for leetcode code
}class Solution {
        public Node copyRandomList(Node head) {
            if (head==null){
                return null;
            }
            HashMap<Node, Node> copy1 = new HashMap<>();
            copy1.put(null,null);
            
            // Create a copy of each node and stored in hash map
            Node curr=head;
            while(curr!=null){
                Node c = new Node(curr.val);
                copy1.put(curr, c);
                curr=curr.next;
            }
            // Assignining next and random pointers foe each copied node as in tha above
            curr=head;
            while (curr!=null){
                Node c = copy1.get(curr);
                c.next = copy1.get(curr.next);
                c.random = copy1.get(curr.random);
                curr=curr.next;
            }
            return copy1.get(head);
    
    
    
        }
    }
