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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Handling Base Conditions
        if(list1==null && list2==null)
            return null;
        if(list1!=null && list2==null)
            return list1;
        if(list2!=null && list1==null)
            return list2;
        
        //Using Two pointe Apporach
        ListNode result=null;
        ListNode tmp;
        ListNode curr=null;
        boolean k=true;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val){
                tmp=new ListNode(list1.val);
                list1=list1.next;
            }
            else{
                tmp=new ListNode(list2.val);
                list2=list2.next;
            } 
            if(k){
                result=tmp;
                k=false;
                curr=result;
            }
            curr.next=tmp;
            curr=curr.next;
        }
        //Filling remaining List1
        while(list1!=null){
            tmp=new ListNode(list1.val);
            list1=list1.next;
            curr.next=tmp;
            curr=curr.next;            
        }
        //Filling remaining List2
        while(list2!=null){
            tmp=new ListNode(list2.val);
            list2=list2.next;
            curr.next=tmp;
            curr=curr.next;            
        }
        return result;   
        //Time Complexity - O(N+K)
        //Space Complexity - O(1)
    }
}