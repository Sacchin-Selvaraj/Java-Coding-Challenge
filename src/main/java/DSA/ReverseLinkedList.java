package DSA;

class ListNode {
    int val; // Value of the node
    ListNode next; // Pointer to the next node

    ListNode(int x) {
        val = x; // Constructor to initialize the node's value
        next = null; // Initialize next pointer to null
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // Initialize the previous node as null
        ListNode next = null; // Initialize the next node as null
        ListNode curr = head; // Start from the head of the list

        // Traverse the list
        while (curr != null) {
            next = curr.next; // Store the next node

            curr.next = prev; // Reverse the current node's pointer

            prev = curr; // Move prev to the current node
            curr = next; // Move to the next node in the original list
        }

        return prev; // Return the new head of the reversed list
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> null
        ListNode head = createList(new int[]{1, 2, 3, 4, 5});
        System.out.println("Original list:");
        printList(head); // Print the original linked list

        // Reverse the linked list
        ListNode reversedHead = solution.reverseList(head);
        System.out.println("Reversed list:");
        printList(reversedHead); // Print the reversed linked list
    }
}