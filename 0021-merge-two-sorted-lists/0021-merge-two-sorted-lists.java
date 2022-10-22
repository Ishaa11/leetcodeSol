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
        
        ListNode t1=list1,t2=list2,p;
        ListNode temp = new ListNode();
        p=temp;
        
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                p.next=t1;
                t1=t1.next;
            }else{
                p.next=t2;
                t2=t2.next;
            }
            p=p.next;
        }
        
        p.next=t2!=null ? t2 : t1;
        
        return temp.next;
    }
}