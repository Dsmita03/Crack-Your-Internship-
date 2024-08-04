package LinkedList;
    
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    public ListNode() {
    }
}



//for leetcode code
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode Head = null;
        while (head != null){
            ListNode temp = new ListNode(head.val);
            temp.next = Head;
            Head = temp;
            head = head.next;
        }
        return Head;
    }
} 

