public class Exercise1 {
    public static void main(String[] args) {

        // Declare and initialize variables m and n both with the value 5
        int m = 5;
        int n = 5;

        // Print the result of the pre-increment operation on variable m (++m)
        // Pre-increment increments the value of m before its value is used in the expression
        System.out.println(++m);

        // Print the result of the post-increment operation on variable n (n++)
        // Post-increment uses the current value of n in the expression and then increments it
        System.out.println(n++);

        // Print the current value of variable n after the post-increment operation
        // The value of n was incremented in the previous line due to post-increment
        System.out.println(n);
    }
}

