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
    public ListNode mergeInBetween(ListNode head, int a, int b, ListNode list2) {
        ListNode first=head;
        ListNode firstprev=null;

        ListNode last=head;
        int A=a;
        while (first!=null && a>0){
            firstprev=first;
            first=first.next;
            a--;
        }
        last=first;
        
        for(int i=0;i<=b-A && last!=null;i++){
            last=last.next;
        }
        ListNode ll=list2;
        while(ll.next!=null){
            ll=ll.next;
        }
        firstprev.next=list2;
        ll.next=last;

        return head;
        
    }
}