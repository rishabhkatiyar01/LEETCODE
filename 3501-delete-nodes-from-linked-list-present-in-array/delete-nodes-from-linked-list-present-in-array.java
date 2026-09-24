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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        while(head!=null && set.contains(head.val) )
        {  
        head=head.next;
            }
            if(head==null)return head;

        ListNode front=head;
        ListNode move=head.next;

        while(move!=null){
            if(set.contains(move.val)){
                front.next=move.next;
            }
            else {  front=move;

            }
            move=move.next;
        }
        return head;
        
    }
}