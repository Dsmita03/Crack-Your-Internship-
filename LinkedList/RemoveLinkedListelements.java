package LinkedList;
 
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode();
            dummy.next = head;
            ListNode curr = dummy;      //Start of dummy node has a fake node then head node
             while(curr.next!=null){    //next node is the head of curr linked list
               if(curr.next.val==val){
                   curr.next=curr.next.next;
               }
               else{
                   curr=curr.next;
               }
            }
            return dummy.next;
    
        }
    } 
