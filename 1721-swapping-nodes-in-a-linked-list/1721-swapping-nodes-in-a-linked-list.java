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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode firstNode=null;
        ListNode lastNode=null;
        ListNode tmp=head;
        // Finding the kth node from the beginning
        while(tmp!=null){
            len++;
            if(len==k)
                firstNode=tmp;
            tmp=tmp.next;
        }
        //Finding the kth node from the end
        tmp=head;
        int z=0;
        int last=len-k+1;
        while(tmp!=null){
            z++;
            if(last==z)
                lastNode=tmp;
            tmp=tmp.next;
        }
        // Swapping the nodes
        int m=firstNode.val;
        firstNode.val=lastNode.val;
        lastNode.val=m;
        
        // Returning the head
        return head;   
        
        //Time Complexity - O(N)
        //Space Complexity - O(1)
    }
}