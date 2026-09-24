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
 public int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;

    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode front=head;
        ListNode forward=head.next;

        while(forward!=null){
            int value=gcd(front.val, forward.val);
            ListNode temp = new ListNode(value); 
            front.next=temp;
            front.next.next=forward;
            front=forward;
            forward=front.next;


        }
        return head;
        
    }
}