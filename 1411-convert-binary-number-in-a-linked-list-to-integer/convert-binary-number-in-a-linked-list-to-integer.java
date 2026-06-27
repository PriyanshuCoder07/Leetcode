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
    public int getDecimalValue(ListNode head) {
        int ans=0;
        int power=0;
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        ListNode temp2=head;
        count--;
        power=count;
        while(temp2!=null){
            int n=temp2.val;
            ans+=Math.pow(2,power)*n;
            power--;
            temp2=temp2.next;

        }
        return ans;
        
    }
}