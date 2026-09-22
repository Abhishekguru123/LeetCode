/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){return head;}
        ListNode current= head.next;
        if(current.next==null){
            head.next=null;
            current.next=head;
            head=current;
            return head;
        }
        ListNode ptr = current.next;
        current.next=head;
        head.next=null;
        
        while(ptr!=null){
        
            ListNode  temp= ptr.next;
            ptr.next=current;
            current=  ptr;
            ptr=temp;

        }
        return current;
        
        
        
    }
}