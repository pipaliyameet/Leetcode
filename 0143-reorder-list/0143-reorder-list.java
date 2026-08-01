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

    ListNode newHead;

    private ListNode reverse(ListNode pre, ListNode curr){
        if(curr == null) return pre;

        ListNode nextt = curr.next;
        curr.next = pre;

        return reverse(curr, nextt);
    }

    private ListNode findMid(ListNode head){

        ListNode fast = head;

        while(fast != null && fast.next !=null){
            head = head.next;
            fast = fast.next.next;
        }
        return head;
    }
    public void reorderList(ListNode head) {

        ListNode mid = findMid(head);

        ListNode save = reverse(null, mid.next);
        ListNode point = head;
        mid.next = null;

        while(point != null && save != null){
            ListNode temp1 = point.next;
            ListNode temp2 = save.next;

            point.next = save;
            save.next = temp1;

            point = temp1;
            save = temp2;
        }
    }
}