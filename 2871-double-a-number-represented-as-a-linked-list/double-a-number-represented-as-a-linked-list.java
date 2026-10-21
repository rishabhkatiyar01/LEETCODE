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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        ListNode prev = null; 
        int carry=0;
        while(temp!=null){
            int value=temp.val;
            int sum=value+value+carry;
            int digit=sum%10;
             carry=sum/10;

            temp.val=digit;
            prev=temp;
            temp=temp.next;

        }
        if(carry!=0){
            ListNode dummy=new ListNode(carry);
        
        prev.next=dummy;
        }
        head=reverse(head);
        return head;
    }
}