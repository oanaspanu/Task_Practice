package en.ase.sqt.practice.features;

public class Compass extends AFeature {
    Compass(String name, int price) {
        super(name, price);
        System.out.println("Compass created!");
    }

    @Override
    public String toString() {
        return "Compass{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
