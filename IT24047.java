// 5.Create another class named MainVehicle containing the main() method.
public class IT24047{
    public static void main(String[] args) {

	// 7. Each pair of arguments represents brand and color. Input pairs seperated by space
        
        if (args.length % 2 != 0) {
            System.out.println("Please provide arguments in pairs (brand color).");
            return;
        }

        // 6. Use command line arguments to create objects.

        for (int i = 0; i < args.length; i += 2) {
            String brand = args[i];
            String color = args[i + 1];

            // Create object

            Vehicle v = new Vehicle(brand, color);

            // Call method

            v.start();
        }
    }
}