
public class cars {

    int val;
    cars next;

    cars(int value) {
        this.val = value;
    }

    public static void main(String[] args) {
        cars c1 = new cars(10);
        cars c2 = new cars(20);
        c1.next = c2;
        c2.next = null;
        System.out.println(c1);
        System.out.println(c1.val);
        System.out.println(c1.next);
        System.out.println(c1.next.val);
    }
}
