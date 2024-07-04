class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode sample = new ListNode(), current = sample;
        head = head.next;
        int sum = 0;
        while(head != null) {
            if(head.val == 0) {
                current.next = new ListNode(sum);
                current = current.next;
                sum = 0;
            } 
            sum += head.val;
            head = head.next;
        }
        return sample.next;
    }
}