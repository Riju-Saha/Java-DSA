
public class bubbleSort {

    public static void main(String args[]) {
        int ar[] = {4, 2, 5, 7, 1, 6};
        for (int i = 0; i <= ar.length - 2; i++) {
            for (int j = 0; j <= ar.length - 2; j++) {
                if (ar[j] > ar[j + 1]) {
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
