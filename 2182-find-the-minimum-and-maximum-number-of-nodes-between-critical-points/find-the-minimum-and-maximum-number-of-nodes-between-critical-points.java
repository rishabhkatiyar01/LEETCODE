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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null){
            return new int[]{-1,-1};

        }

        ListNode prev=head;
        ListNode curr=head.next;
        List<Integer>ciriticalPoints=new ArrayList<>();
        int i=0;
        while(curr!=null && curr.next!=null){
            if(curr.val>prev.val && curr.val>curr.next.val){
                ciriticalPoints.add(i);
            }
            if(curr.val<prev.val && curr.val<curr.next.val){
                ciriticalPoints.add(i);
            }
            curr=curr.next;
            prev=prev.next;
            i=i+1;
        }
        if(ciriticalPoints.size()<2){
            return new int[]{-1, -1};
        }
        int minDist=Integer.MAX_VALUE;
        for(int j=1;j<ciriticalPoints.size();j++){
            minDist=Math.min(minDist,ciriticalPoints.get(j)-ciriticalPoints.get(j-1));
        }
        int maxDist=ciriticalPoints.get(ciriticalPoints.size()-1)-ciriticalPoints.get(0);
        return new int []{minDist, maxDist};
    }
}