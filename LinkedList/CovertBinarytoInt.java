package LinkedList;

 
class Solution {
        public int getDecimalValue(ListNode head) {
            ListNode node = head;
            StringBuilder sb = new StringBuilder();
            while(node!= null){
               sb.append(node.val);
               node = node.next;
            }
            return (Integer.parseInt(sb.toString() , 2));
        }
    }
     
