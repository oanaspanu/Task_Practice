package en.ase.sqt.practice.features;

import en.ase.sqt.practice.AFeature;

public class FeatureFactory {
    public static AFeature create(FeatureType type) {
        switch (type) {
            case BATTERY: return new Battery();
            case ANTENNA: return new Antenna();
            case SPEAKER: return new Speaker();
            case COMPASS: return new Compass();
            default: throw new UnsupportedOperationException();
        }
    }
}
