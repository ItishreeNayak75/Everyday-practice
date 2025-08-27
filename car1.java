class Car1 {
    String make;
    String model;
    int year;

    Car1(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String args[]) {
        Car1 car = new Car1("Maruti", "Alto", 2009);
    }
}
