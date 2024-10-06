import java.util.*;

public class queue {
    public static void main (String args[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Queue <Integer> q = new LinkedList <> ();
        int num;

        while(true) {
            System.out.println("1. Add value to the queue");
            System.out.println("2. Release value from queue");
            System.out.println("3. Search for a value in queue");
            System.out.println("4. Peek of the queue");
            // System.out.println("5. Base of the queue");
            System.out.println("5. Display queue");
            System.out.println("6. Empty queue");
            System.out.println("7. Get Min value from queue");
            System.out.println("8. Get Max value from queue");
            System.out.println("9. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter number");
                    num = sc.nextInt();
                    q.add(num);
                    System.out.println("Added sucessfully");
                    break;
                case 2:
                    System.out.println(q.poll()+" released sucessfully");
                    break;
                case 3:
                    System.out.println("Enter the number to be searched");
                    num = sc.nextInt();
                    if (q.contains(num)) {
                        System.out.println("Value is present");
                    } else {
                        System.out.println("Value is not present");
                    }
                    break;
                case 4:
                    System.out.println("The topmost value is "+ q.peek());
                    break;
                case 5:
                    if (q.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println();
                        for (int i : q) {
                            System.out.println(i);
                        }
                        System.out.println();
                        break;
                    }
                case 6:
                    q.clear();
                    System.out.println("Queue has be emptied");
                    break;
                case 7:
                    int min = q.peek();
                    for (int i : q) {
                        if (i<min) {
                            min = i;
                        }
                    }
                    System.out.println("Minimum value is "+min);
                    break;
                case 8:
                    int max = q.peek();
                    for(int i : q) {
                        if (i>max) {
                            max = i;
                        }
                    }
                    System.out.println("Maximum value is "+max);
                    break;
                case 9:
                    System.out.println("Exitting...");
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");
                    break;
            }
        }
    }
}
