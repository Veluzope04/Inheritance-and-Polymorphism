public class Bus extends Vehicle {

    private int capacity;


    public Bus(String passingNo, String manufacture, int capacity) {
        super(passingNo, manufacture);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(" passing no : " + getPassingNo() + " Manufrature : " + getManufacture() + " Capacity : " + capacity);
    }

    public void start() {
        System.out.println("Bus is start");
    }

    public void stop() {
        System.out.println("Bus is stop");
    }

    public void move() {
        System.out.println("Bus is moving");
    }
}
