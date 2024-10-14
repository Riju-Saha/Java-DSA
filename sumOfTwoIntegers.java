// leetcode 371

// works only for positive numbers not negative numbers

// public class sumOfTwoIntegers {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 25;

//         String binaryA = Integer.toBinaryString(a);
//         String binaryB = Integer.toBinaryString(b);
        
//         int maxLength = Math.max(binaryA.length(), binaryB.length());

//         String paddedBinaryA = String.format("%" + maxLength + "s", binaryA).replace(' ', '0');
//         String paddedBinaryB = String.format("%" + maxLength + "s", binaryB).replace(' ', '0');

//         int counter = paddedBinaryA.length()-1;
//         String ch = "";
//         String carry = "0";

//         StringBuilder sb = new StringBuilder("");

//         for (int i = counter; i >= 0; i--) {
//             if (paddedBinaryA.charAt(i) == '1' && paddedBinaryB.charAt(i) == '0') {
//                 ch = "1";
//                 if (carry.equals("1")) {
//                     ch = "0";
//                     carry = "1";
//                 }
//             } else if ((paddedBinaryA.charAt(i) == '0' && paddedBinaryB.charAt(i) == '1')) {
//                 ch = "1";
//                 if (carry.equals("1")) {
//                     ch = "0";
//                     carry = "1";
//                 }
//             } else if (paddedBinaryA.charAt(i) == '0' && paddedBinaryB.charAt(i) == '0') {
//                 ch = "0";
//                 if (carry.equals("1")) {
//                     ch = "1";
//                     carry = "0";
//                 }
//             } else if (paddedBinaryA.charAt(i) == '1' && paddedBinaryB.charAt(i) == '1'){
//                 ch = "0";
//                 String c = "1";
//                 if (carry.equals("1")) {
//                     ch = "1";
//                     carry = "1";
//                 }
//                 carry = c;
//             }
//             System.out.println("checking "+paddedBinaryA.charAt(i)+" and "+paddedBinaryB.charAt(i));
//             System.out.println("appending "+ch);
//             System.out.println("carry "+carry);
//             System.out.println();
//             sb.insert(0, ch);
//         }

//         if (carry.equals("1")) {
//             sb.insert(0, "1");
//         }

//         System.out.println(a + "->" + paddedBinaryA);
//         System.out.println(b + "-> " + paddedBinaryB);

//         System.out.println();

//         System.out.println("    "+sb.toString());

//         System.out.println(Integer.parseInt(sb.toString(),2));
//     }
// }


// works both for positive and negative numbers

class sumOfTwoIntegers {
    public int getSum(int a, int b) {
        while (b != 0) {
            // Carry will be the common set bits of a and b
            int carry = a & b;
    
            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;
    
            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }
    public void main(String[] args) {
        int res = getSum(-5,5);
        System.out.println(res);
    }
}