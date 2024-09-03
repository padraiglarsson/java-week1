//public class Exercise3 {
    //public static void main(String[] args){
       // int ans = 2, v1 = 10, v2=19;
        //ans +=--v2 %v1++;
       // System.out.println(ans);
    //
//}

public class Exercise3 {
    public static void main(String[] args) {

        // Declare and initialize variables ans, v1, and v2 with the values 2, 10, and 19
        int ans = 2;
        int v1 = 10;
        int v2 = 19;

        // Perform the following operations and update the value of ans:
        // - Decrement v2 by 1 (--v2)
        // - Calculate the modulus of the result by incrementing v1 after the operation (v1++)
        // - Add the result to ans (ans += ...)
        ans += --v2 % v1++;

        // Print the final value of ans after the operations
        System.out.println(ans);
    }
}

