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
    public ListNode partition(ListNode head, int x) {
        ListNode lessHead=new ListNode(-1);
        ListNode lessTail=lessHead;
    
        ListNode greaterHead=new ListNode(-1);
        ListNode greaterTail=greaterHead;
        ListNode temp=head;

        while(temp!=null){
            if(temp.val<x){
                ListNode nodeToInsert=temp;
                temp=temp.next;
                
                nodeToInsert.next=null;
                lessTail.next=nodeToInsert;
                lessTail=nodeToInsert;
            }
            else {
                 ListNode nodeToInsert=temp;
                temp=temp.next;
                
                nodeToInsert.next=null;
                greaterTail.next=nodeToInsert;
                greaterTail=nodeToInsert;
            }
        }
        lessTail.next=greaterHead.next;
        greaterTail.next=null;
        return lessHead.next;
    }
}