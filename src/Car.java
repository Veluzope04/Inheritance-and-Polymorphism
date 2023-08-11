public class Car extends Vehicle {
    private String color;
    private byte fueltype;

    private String fuelType1;
    private int noofGears;

    public Car(String passingNo, String manufacture, String color, int fueltype, int noofGears) {
        super(passingNo, manufacture);
        this.color = color;
        if (fueltype == 1) {
            this.fueltype = (byte) fueltype;
            this.fuelType1 = "petrol";
        } else if (fueltype == 2) {
            this.fueltype = (byte) fueltype;
            this.fuelType1 = "diesel";
        }

        this.noofGears = noofGears;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getFueltype() {
        return fueltype;
    }

    public void setFueltype(byte fueltype) {
        this.fueltype = fueltype;
    }

    public int getNoofGears() {
        return noofGears;
    }

    public void setNoofGears(int noofGears) {
        this.noofGears = noofGears;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" Passing Number : " + getPassingNo() + " Manufacture : " + getManufacture() + " Color : " + color + " fueltype1 : " + fuelType1 + " noofgears : " + noofGears);
    }

    public void start() {
        System.out.println(" Car is Start ");
    }

    public void stop() {
        System.out.println("Car is stop");
    }

    public void move() {
        System.out.println("Car is moving");
    }


}
