package en.ase.sqt.practice.features;

public class Antenna extends AFeature {
    Antenna(String name, int price) {
        super(name, price);
        System.out.println("Antenna created!");
    }

    @Override
    public String toString() {
        return "Antenna{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
