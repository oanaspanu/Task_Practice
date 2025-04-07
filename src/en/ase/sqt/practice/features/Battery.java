package en.ase.sqt.practice.features;

public class Battery extends AFeature {
    public Battery(String name, int price) {
        super(name, price);
        System.out.println("Battery created!");
    }

    @Override
    public String toString() {
        return "Battery{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
