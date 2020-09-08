package principle.basic;

public class ReserveList {

    public static void main(String[] args) {

       // ListNode node = reverseList();

    }

    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        head.next.next = head;
        head.next = null;
        head = reverseList(head);
        return head;
    }

    public class ListNode {

        int val;

        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

