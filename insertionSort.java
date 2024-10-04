
public class insertionSort {

    // 2   7   6   3   5  
    public static void main(String args[]) {
        int ar[] = {2, 7, 6, 3, 5};

        for (int i = 1; i < ar.length; i++) {
            int num = ar[i];
            int index = i;
            while (ar[index - 1] > ar[index] && index > 0) {
                ar[index] = ar[index - 1];
                ar[index - 1] = num;
                index--;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
