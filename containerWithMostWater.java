// correct approach but time limit exceeded

// public class containerWithMostWater {
//     public static void main(String[] args) {
//         int h[] = { 1, 2, 1 };
//         int maxArea = 0;
//         for (int i = 0; i<h.length-1; i++) {
//             for (int j = i+1; j<h.length; j++) {
//                 int area = Math.min(h[i], h[j]) * Math.abs(i-j);
//                 if (area>maxArea) {
//                     maxArea = area;
//                 }
//             }
//         }
//         System.out.println(maxArea);
//     }
// }



public class containerWithMostWater {
    public static void main(String[] args) {
        int h[] = { 1,8,6,2,5,4,8,3,7 };

        int left = 0;
        int right = h.length-1;
        int maxArea = 0;

        while(left != right) {
            int area = Math.min(h[left], h[right]) * (right - left);
            if (area>maxArea) {
                maxArea = area;
            }
            if (h[left] < h[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }
}


