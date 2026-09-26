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
    public ListNode reverseList(ListNode head) {
        
        if(head==null){
            return null;
        }
        Stack <ListNode> st=new Stack<>();
        ListNode t=head;
        while(t!=null){
            st.push(t);
            t=t.next;
        }
        ListNode newHead=st.pop();
        t=newHead;
        while(st.size()>0){
            t.next=st.pop();
            t=t.next;
        }
        t.next=null;
        
        return newHead;
    }
}
