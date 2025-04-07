package en.ase.sqt.practice.features;

public class Speaker extends AFeature {
    Speaker(String name, int price) {
        super(name, price);
        System.out.println("Speaker created!");
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
