public class Exercise4 {
    public static void main(String[] args) {

        // Declare and initialize variables a and b with the values 7 and 3
        int a = 7;
        int b = 3;

        // Calculate the result of the division of a / b and store it in the variable result.
        // Casting one of the operands to float ensures that the division result is a floating-point value.
        float result = (float) a / b;

        // Calculate the result1 without explicit casting.
        // In this case, both operands are integers, so the result will also be an integer (truncated).
        float result1 = a / b;

        // Print the result of the first division with explicit casting, yielding a floating-point result
        System.out.println(result);

        // Print the result of the second division without casting, resulting in an integer (truncated) result
        System.out.println(result1);
    }
}

