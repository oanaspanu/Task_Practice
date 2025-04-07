package en.ase.sqt.practice;

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
}
