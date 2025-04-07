package en.ase.sqt.practice.main;

import en.ase.sqt.practice.*;
import en.ase.sqt.practice.features.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Requirement 1 ---");
        // Create features using the Simple Factory
        AFeature battery = FeatureFactory.createFeature(FeatureType.BATTERY, "Battery1", 100);
        AFeature speaker = FeatureFactory.createFeature(FeatureType.SPEAKER,  "Speaker1", 100);
        AFeature compass = FeatureFactory.createFeature(FeatureType.COMPASS,  "Compass1", 100);

        //Package-private constructor
        //Battery battery1 = new Battery("Battery", 100);

        // Add features to a list
        List<AFeature> features = new ArrayList<AFeature>();
        features.add(battery);
        features.add(speaker);
        features.add(compass);

        // Create a phone with identifier and version
        Phone customPhone = new Phone("BrainX-3000", "v1.1", features);
        System.out.println(customPhone);

    }
}
