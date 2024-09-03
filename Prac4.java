public class Prac4 {
    public static void main(String[] args) {

        // Declare and initialize variables representing the dimensions of a box
        int height = 3;
        int width = 4;
        int depth = 5;

        // Declare variables to store the perimeter and volume of the box
        int perimeter;
        int volume;

        // Calculate the perimeter of the box using the given formula: 4 * (height + width + depth)
        perimeter = (4 * height + 4 * width + 4 * depth);

        // Calculate the volume of the box using the given formula: height * width * depth
        volume = (height * width * depth);

        // Print information about the dimensions of the box, its volume, and perimeter
        System.out.println("The box is " + height + "cm height, " +
                width + "cm wide, and " + depth + "cm deep");
        System.out.println("The volume of the box is " + volume + "cm³");
        System.out.println("The perimeter of the box is " + perimeter + "cm");
    }
}

