package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}



//for leetcode code
    class Solution {
        public ListNode reverse(ListNode head){
             ListNode prev = null;
 
             while(head!=null){
                 ListNode temp = head.next;
                 head.next = prev;
                 prev = head;
                 head = temp;
             }
             return prev;
         }
 
     public boolean isPalindrome(ListNode head) {
         ListNode slow = head;
         ListNode fast = head;
 
         while(fast.next!=null && fast.next.next!=null){
             slow = slow.next;
             fast = fast.next.next;
         }
         ListNode temp = reverse(slow.next);
         slow.next = temp;
 
         ListNode p1 = head;
         ListNode p2 = slow.next;
 
         while(p2!=null){
             if(p1.val !=p2.val) return false;
             p1 = p1.next;
             p2 = p2.next;
         }
 
         return true;
     }
 } 

