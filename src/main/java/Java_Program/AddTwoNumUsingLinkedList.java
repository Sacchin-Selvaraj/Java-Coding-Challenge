package Java_Program;

public class AddTwoNumUsingLinkedList {

    class ListNode {
        int data;
        ListNode next = null;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }

        public ListNode() {
        }
    }

    private ListNode addElement(int i,ListNode head) {

        ListNode newnode = new ListNode(i);
        ListNode current = head;
        if (head == null) {
            head = newnode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;

        while (l1!=null||l2!=null||carry!=0){
            total=carry;
            if ((l1!=null)){
                total=total+l1.data;
                l1=l1.next;
            }
            if ((l2!=null)){
                total=total+l2.data;
                l2=l2.next;
            }
            int num=total%10;
            carry=total/10;
            dummy.next=new ListNode(num);
            dummy=dummy.next;
        }
        return res.next;
    }
    public void printLinkedList(ListNode listNode){
        while (listNode!=null){
            System.out.println(listNode.data);
            listNode=listNode.next;
        }
    }


    public static void main(String[] args) {

        AddTwoNumUsingLinkedList obj = new AddTwoNumUsingLinkedList();
        int[] a = {2, 4, 3};
        int[] b = {5, 6, 4};
        ListNode l1=null;
        ListNode l2=null;
        ListNode head = null;
        ListNode head2=null;
        for (int i : a) {
            l1 = obj.addElement(i, head);
            head=l1;
        }
        for (int i : b) {
            l2 = obj.addElement(i,head2);
            head2=l2;
        }
        obj.printLinkedList(l1);
        obj.printLinkedList(l2);

        ListNode l3=obj.addTwoNumbers(l1,l2);
        obj.printLinkedList(l3);
    }
}
