package en.ase.sqt.practice;

import en.ase.sqt.practice.features.AFeature;

import java.util.List;

public class Phone {
    String identifier;
    String version;
    // add the features/add-ons
    final List<AFeature> features;

    public Phone(String identifier, String version, List<AFeature> features) {
        this.identifier = identifier;
        this.version = version;
        this.features = features;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "identifier='" + identifier + '\'' +
                ", version='" + version + '\'' +
                ", features=" + features +
                '}';
    }
}
