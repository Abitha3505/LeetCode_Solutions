class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i = 1; i < k; i++){
            first = first.next;
        }
        ListNode xyz = first;
        ListNode second = head;
        while(xyz.next != null){
            xyz = xyz.next;
            second = second.next;
        }
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}