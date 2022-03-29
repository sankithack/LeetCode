/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //Using HashSet Approach
        Set<ListNode> nodesSeen = new HashSet();
        while(head!=null){
            if(nodesSeen.contains(head)){
                return true;
            }
            nodesSeen.add(head);
            head=head.next;            
        }
        return false;
        //Time Complexity - O(N)
        //Space Complexity - O(N)
    }
}