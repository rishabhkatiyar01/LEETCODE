/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        //clone node ko add karo
        Node temp=head;
        while(temp!=null){
            Node cloneNode=new Node (temp.val);
            cloneNode.next=temp.next;
            temp.next=cloneNode;
            temp=cloneNode.next;
        }
        temp=head;
        //copying the random pointer by the formula naye node ka jo random hoga wo old node ke random ka next hoga
        while(temp!=null){
            Node oldNode=temp;
            Node newNode=temp.next;
            if(oldNode.random!=null){
                newNode.random=oldNode.random.next;
            }
            temp=newNode.next;
        }
        temp=head;
        // detaching both the list 
        
        Node ansListHead=head.next;
        while(temp!=null){
            Node oldNode=temp;
            Node cloneNode=temp.next;
            oldNode.next=cloneNode.next;
            if(cloneNode.next!=null){
                cloneNode.next=cloneNode.next.next;
            }
            temp=temp.next;
        }
        return ansListHead;
    }
}