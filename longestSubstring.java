/* not completed */
 /* not completed */
 /* not completed */
 /* not completed */
 /* not completed */
 /* not completed */
 /* not completed */
 /* not completed */
 /* not completed */

// import java.util.*;
// public class longestSubstring {
//     public static void main(String args[]) {
//         HashMap<String, Integer> map = new HashMap<>();
//         String s = "au";
//         int counter = 0;
//         String r = "";
//         while (counter < s.length()) {
//             if (r.contains(s.charAt(counter) + "")) {
//                 map.put(r, r.length());
//             } else {
//                 r = r + s.charAt(counter);
//                 counter++;
//             }
//         }
//         if(map.size() == 1) {
//         }
// String s = "  ";
// System.out.println(s.length());
// s = "";
// System.out.println(s.length());
//     }
// }
import java.util.*;
// import java.util.jar.Attributes;

class longestSubstring {

    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        String s = "au";
        if (s.length() == 0) {
            // System.out.println("11");
            System.out.println(0);
        } else if (s.trim().length() == 0 || s.length() == 1) {
            // System.out.println("1111");
            System.out.println(1);
        } else {
            // System.out.println("111111");
            int counter = 0;
            String r = "";
            while (counter < s.length()) {
                System.out.println("Counter: " + counter);

                // Check if r contains the current character from s
                if (r.contains(s.charAt(counter) + "")) {
                    map.put(r, r.length());
                    System.out.println("Printing below:");
                    System.out.println("Substring: " + r);
                    r = "";  // Reset r
                } else {
                    r = r + s.charAt(counter);  // Append the character to r
                }

                // Always increment the counter to avoid infinite loop
                counter++;
            }
            // for (int i = 0; i < s.length(); i++) {
            //     // char currentChar = ;
            //     if (!r.contains(s.charAt(i) + "")) {
            //         r += s.charAt(i);
            //         System.out.println(r);
            //     } else {
            //         map.put(r, r.length());
            //         r = "";
            //     }
            // }
            int maxValue = 0;  // Initialize with the lowest possible integer value
            String maxKey = "";  // To store the key of the max value entry

            // Iterate over all entries to find the max value
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
                if (entry.getValue() > maxValue) {
                    maxValue = entry.getValue();  // Update max value
                    maxKey = entry.getKey();  // Store the key associated with the max value
                }
            }
            System.out.println(maxValue);
            System.out.println(maxKey);
        }
    }
}
