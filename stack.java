import java.util.*;

public class stack {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // int top;
        int pos = -1;

        while (true) {
            System.out.println("1. Add value to the stack");
            System.out.println("2. Pop value from stack");
            System.out.println("3. Search for a value in stack");
            System.out.println("4. Peek of the stack");
            System.out.println("5. Display stack");
            System.out.println("6. Empty stack");
            System.out.println("7. Get Min value from stack");
            System.out.println("8. Get Max value from stack");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter number");
                    int num = sc.nextInt();
                    st.push(num);
                    System.out.println("Added sucessfully");
                    pos++;
                    break;
                case 2:
                    if (st.peek() == null) {
                        System.out.println("Empty stack");
                    } else {
                        st.pop();
                        System.out.println("Value removed sucessfully");
                    }
                    break;
                case 3:
                    if (st.peek() == null) {
                        System.out.println("Empty Stack");
                    } else {
                        System.out.println("Enter the number to be searched");
                        int n = sc.nextInt();
                        if (st.search(n) != -1) {
                            System.out.println("Value is present at position "+st.search(n));
                            break;
                        }
                        System.out.println("Value is not present");
                    }
                    break;
                case 4:
                    System.out.println("The topmost element of the stack is " + st.peek());
                    break;
                case 5:
                    System.out.println();
                    System.out.println();
                    for (int i = pos; i >=0; i--) {
                        System.out.println(st.get(i));
                        System.out.println();
                    }
                    break;
                case 6:
                    st.removeAllElements();
                    System.out.println("Stack has been emptied");
                    break;
                case 7:
                    int min=st.get(0);
                    for(int i=1; i<=pos; i++) {
                        if (min>st.get(i)) {
                            min = st.get(i);
                        }
                    }
                    System.out.println("Minimum value from stack is "+ min);
                    break;
                case 8:
                    int max = st.get(0);
                    for (int i=1; i<=pos; i++) {
                        if (max < st.get(i)) {
                            max = st.get(i);
                        }
                    }
                    System.out.println("Maximum value from stack is "+ max);
                    break;
                case 9:
                    System.out.println("Exitting...");
                    System.exit(0);
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}
