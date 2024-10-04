
public class selectionSort {

    public static void main(String args[]) {
        int ar[] = {4, 2, 5, 7, 1, 6};
        for (int i = 0; i < ar.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = ar[minIndex];
            ar[minIndex] = ar[i];
            ar[i] = temp;
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
