
public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("MH15GW8810", "HONDA", "Black", 1, 5);
        c1.display();

        System.out.println();

        Bus b1 = new Bus("MH123034", "PMTL", 100);
        b1.display();
        Checkpost.checkvehicle(b1);
    }


}