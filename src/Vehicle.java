public abstract class Vehicle {
    private String passingNo;
    private String manufacture;

    public Vehicle(String passingNo, String manufacture) {
        if (passingNo.length() < 11) {
            this.passingNo = passingNo;
        }
        this.manufacture = manufacture;
    }

    public String getPassingNo() {
        return passingNo;
    }

    public void setPassingNo(String passingNo) {
        this.passingNo = passingNo;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public void display() {
        System.out.println(passingNo + " " + manufacture);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void move();


}
