package org.example.list;
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ReverseList_反转链表 {
    public ListNode ReverseList(ListNode head) {
        // 判断链表为空或长度为1的情况
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while(head!=null){
            next =head.next;
            head.next=pre;
            pre = head;
            head =next;
        }
        return pre;
    }
}
