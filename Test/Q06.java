class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = null;

        for (ListNode list : lists)
            result = merge(result, list);

        return result;
    }

    public ListNode merge(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.val < b.val) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }
}
