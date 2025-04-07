package en.ase.sqt.practice.features;

public class FeatureFactory {
    public static AFeature createFeature(FeatureType type, String name, int price) {
        switch (type) {
            case BATTERY: return new Battery(name, price);
            case ANTENNA: return new Antenna(name, price);
            case SPEAKER: return new Speaker(name, price);
            case COMPASS: return new Compass(name, price);
            default: throw new UnsupportedOperationException();
        }
    }
}
