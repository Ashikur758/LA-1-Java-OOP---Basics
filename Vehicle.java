class Vehicle {
    //2. Private data members
    private String brand;
    private String color;

    // 3. Public constructor
    public Vehicle(String b, String c) {
        this.brand = b;
        this.color = c;
    }

    // 4. Public method
    public void start() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Color: " + color);
        System.out.println("Vehicle is starting...");
        System.out.println();
    }
}