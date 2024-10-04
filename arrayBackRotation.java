
import java.util.*;

public class arrayBackRotation {

    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        if (k % ar.length == 0) {
            System.out.println(Arrays.toString(ar));
        } else if (k > ar.length) {
            int counter = 1;
            while (counter <= k - ar.length) {
                for (int i = 0; i <= ar.length - 2; i++) {
                    int temp = ar[ar.length - 1];
                    ar[ar.length - 1] = ar[i];
                    ar[i] = temp;
                }
                counter++;
            }
            System.out.println(Arrays.toString(ar));
        } else {
            int arr[] = new int[k];
            int j = -1;
            for (int i = ar.length - k; i <= ar.length - 1; i++) {
                j++;
                arr[j] = ar[i];
            }
            for (int i = ar.length - k - 1; i >= 0; i--) {
                ar[k + i] = ar[i];
            }
            for (int i = 0; i <= k - 1; i++) {
                ar[i] = arr[i];
            }
            System.out.println(Arrays.toString(ar));
        }
    }
}
