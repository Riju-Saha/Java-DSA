// Leetcode question 2

// approach 1

// Space complexity: O(max(n,m))
// Time complexity: O(m+n)

// m = length of l1     n = length of l2

// class addTwoNumbers {
//     static Node head1;
//     static Node head2;
//     static Node h;

//     addTwoNumbers() {
//         head1 = null;
//         head2 = null;
//     }

//     static class Node {

//         int val;
//         Node next;

//         Node(int value) {
//             this.val = value;
//             this.next = null;
//         }
//     }

//     public int sum(Node head) {
//         Node currNode = head;
//         int sum = 0;
    
//         while (currNode != null) {
//             sum = sum * 10 + currNode.val; // Multiply sum by 10 and add res node's value
//             currNode = currNode.next;
//         }
    
//         return sum;
//     }

//     public Node sol(Node l1, Node l2) {
//         int res1 = sum(head1);
//         int res2 = sum(head2);
//         int res = res1 + res2;

//         int n = res % 10;
//         res /= 10;
//         Node l = new Node(n); 
//         h = l;

//         while (res != 0) {
//             n = res %10;
//             res /= 10;
//             Node temp = new Node(n);
//             while(l.next != null) {
//                 l = l.next;
//             }
//             l.next = temp;
//         }
//         return h;
//     }

//     public static void main(String[] args) {
//         addTwoNumbers list = new addTwoNumbers();

//         Node l1 = new Node(2);
//         head1 = l1;
//         l1.next = new Node(4);
//         l1.next.next = new Node(3);

//         Node l1 = new Node(9);
//         head1 = l1;
//         l1.next = new Node(9);
//         l1.next.next = new Node(9);
//         l1.next.next.next = new Node(9);
//         l1.next.next.next.next = new Node(9);
//         l1.next.next.next.next.next = new Node(9);
//         l1.next.next.next.next.next.next = new Node(9);

//         Node l2 = new Node(9);
//         head2 = l2;
//         l2.next = new Node(9);
//         l2.next.next = new Node(9);
//         l2.next.next.next = new Node(9);

//         Node res = list.sol(l1, l2);

        // StringBuilder sb = new StringBuilder();
        // sb.append("[");

        
        // while (res != null) {
        //     sb.append(res.val); 
        //     res = res.next; 
        //     if (res != null) {
        //         sb.append(", "); 
        //     }
        // }
        // sb.append("]");
        // System.out.println(sb.toString());
//     }   
// }




// approach 2

// Space complexity: O(max(n,m))
// Time complexity: O(max(n,m))

// m = length of l1     n = length of l2

class addTwoNumbers {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode sol(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); 
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummyHead.next;
    }
    public static void main(String[] args) {
        addTwoNumbers solution = new addTwoNumbers();

        ListNode l1 = solution.new ListNode(2);
        l1.next = solution.new ListNode(4);
        l1.next.next = solution.new ListNode(3);

        ListNode l2 = solution.new ListNode(5);
        l2.next = solution.new ListNode(6);
        l2.next.next = solution.new ListNode(4);

        ListNode res = solution.sol(l1, l2);

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (res != null) {
            sb.append(res.val); 
            res = res.next; 
            if (res != null) {
                sb.append(", "); 
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
